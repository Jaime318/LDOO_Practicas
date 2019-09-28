package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class regi_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Registro</title>\n");
      out.write("        <Style>\n");
      out.write("            body{background-color:#18A383;box-sizing:border-box;}\n");
      out.write("            h1{font-family:arial; color:white;}\n");
      out.write("            form{\n");
      out.write("                background-color:white;\n");
      out.write("                font-family:arial;\n");
      out.write("                width:300px;\n");
      out.write("                margin:0 auto;\n");
      out.write("                padding:30px;\n");
      out.write("                border-radius:3px;\n");
      out.write("            }\n");
      out.write("            input, textarea{\n");
      out.write("              border:1;\n");
      out.write("            }\n");
      out.write("            .field{\n");
      out.write("                border:solid 10px #fff;\n");
      out.write("            }\n");
      out.write("        </Style>\n");
      out.write("    </head>\n");
      out.write("   <body>\n");
      out.write("       <center><h1>Registro de Usuario</h1></center>\n");
      out.write("      <form action = \"main.jsp\" method = \"GET\">\n");
      out.write("         Nombre: <br><input type = \"text\" name = \"nombre\">\n");
      out.write("         <br>\n");
      out.write("         Contrase&ntilde;a:<br> <input type = \"password\" name = \"pass\" />\n");
      out.write("         <br>\n");
      out.write("         Email:<br><input type = \"text\" name = \"correo\" />\n");
      out.write("         <br>\n");
      out.write("         Edad:<br> <input type = \"text\" name = \"edad\" />\n");
      out.write("         \n");
      out.write("         <center><label><br/><input type = \"submit\" value = \"Submit\" /></label></center>\n");
      out.write("      </form>\n");
      out.write("   </body>\n");
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
