<%@ page import="classes.User" %>
<%@ page import="classes.DbConnector" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ page import="java.util.logging.Logger" %>

<%!
    private static final Logger logger = Logger.getLogger("registration.jsp");
%>

<%
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    String phone_number = request.getParameter("phone_number");
    String dob = request.getParameter("dob");
    String role = "patient";

    if (name != null && email != null && password != null && phone_number != null && dob != null) {
        User user = new User(name, email, password, phone_number, dob, role);
        try {
            if (user.register(DbConnector.getConnection())) {
                logger.info("User registered successfully: " + email);
                response.sendRedirect("sign_up.jsp?s=1");
            } else {
                logger.warning("User registration failed: " + email);
                response.sendRedirect("sign_up.jsp?s=0");
            }
        } catch (Exception e) {
            logger.severe("Exception during registration: " + e.getMessage());
            response.sendRedirect("sign_up.jsp?s=0");
        }
    } else {
        logger.warning("Incomplete registration data");
        response.sendRedirect("sign_up.jsp?s=0");
    }
%>