package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class connection_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"ressources/css/bootstrap.min.css\">\r\n");
      out.write("    <style>\r\n");
      out.write("        .mainpage{\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("            height: 100vh;\r\n");
      out.write("            background-color: rgba(2, 5,1, 0.2);\r\n");
      out.write("        }\r\n");
      out.write("        .header{\r\n");
      out.write("            background-color: rgba(2, 5,61, 0.6);\r\n");
      out.write("            margin-bottom: 40px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"bg-light\">\r\n");
      out.write("    <section class=\"header p-4\">\r\n");
      out.write("        <h1 class=\"text-center\">Bienvenue sur le parc informatique de l'IFRI</h1>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <section class=\"mainpage my-2 p-3\">\r\n");
      out.write("        <div class=\"container p-3\">\r\n");
      out.write("            <div class=\"row justify-content-center align-items-center h100\">\r\n");
      out.write("                <div class=\"col-lg-6\">\r\n");
      out.write("                    <img src=\"ressources/images/digital.jpg\" class=\"img-fluid\" alt=\"\" srcset=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-6 p-3\">\r\n");
      out.write("                    <h1>Connection</h1>\r\n");
      out.write("                    <form>\r\n");
      out.write("                        <div class=\"mb-3\">\r\n");
      out.write("                          <label for=\"idifri\" class=\"form-label\">Identifiant</label>\r\n");
      out.write("                          <input type=\"email\" class=\"form-control\" id=\"idifri\" aria-describedby=\"emailHelp\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"mb-3\">\r\n");
      out.write("                          <label for=\"exampleInputPassword1\" class=\"form-label\">Password</label>\r\n");
      out.write("                          <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                      \r\n");
      out.write("                        <button onclick=\"window.location.href ='Accueil.html';\" type=\"submit\" class=\"btn btn-primary me-auto\">Se connecter</button>\r\n");
      out.write("                      </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"ressources/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
