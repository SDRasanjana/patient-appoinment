package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Hospital Appointment Booking System</title>\n");
      out.write("    <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"styles/main.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <!-- Navigation Bar -->\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">HospitalApp</a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("            <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Home</a></li>\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">About</a></li>\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Services</a></li>\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Contact</a></li>\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link btn btn-primary text-white ml-2\" href=\"#\">Sign Up</a></li>\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link btn btn-secondary text-white ml-2\" href=\"#\">Log In</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <!-- Hero Section -->\n");
      out.write("    <header class=\"hero text-center\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1 class=\"display-4\">Medical and Health Centre Booking Software</h1>\n");
      out.write("            <p class=\"lead\">For all medical, health and wellness businesses</p>\n");
      out.write("            <a href=\"#\" class=\"btn btn-danger btn-lg mr-2\">Get a Free Account</a>\n");
      out.write("            <a href=\"#\" class=\"btn btn-info btn-lg\">Get Inspired</a>\n");
      out.write("            <p class=\"mt-4\">No credit card needed</p>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <!-- Services Section -->\n");
      out.write("    <section class=\"services py-5 text-center\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <img src=\"images/medical_clinic.png\" class=\"card-img-top\" alt=\"Medical Clinics & Doctors\">\n");
      out.write("                            <h5 class=\"card-title mt-3\">Medical Clinics & Doctors</h5>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <img src=\"images/dentists.png\" class=\"card-img-top\" alt=\"Dentists\">\n");
      out.write("                            <h5 class=\"card-title mt-3\">Dentists</h5>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <img src=\"images/chiropractics.png\" class=\"card-img-top\" alt=\"Chiropractics\">\n");
      out.write("                            <h5 class=\"card-title mt-3\">Chiropractics</h5>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row mt-4\">\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <img src=\"images/acupuncture.png\" class=\"card-img-top\" alt=\"Acupuncture\">\n");
      out.write("                            <h5 class=\"card-title mt-3\">Acupuncture</h5>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <img src=\"images/massage.png\" class=\"card-img-top\" alt=\"Massage\">\n");
      out.write("                            <h5 class=\"card-title mt-3\">Massage</h5>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <img src=\"images/psychologists.png\" class=\"card-img-top\" alt=\"Psychologists\">\n");
      out.write("                            <h5 class=\"card-title mt-3\">Psychologists</h5>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <!-- Footer -->\n");
      out.write("    <footer class=\"bg-light text-center py-4\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <p class=\"mb-0\">&copy; 2024 HospitalApp. All rights reserved.</p>\n");
      out.write("            <p>Designed by Group H</p>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"scripts/main.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
