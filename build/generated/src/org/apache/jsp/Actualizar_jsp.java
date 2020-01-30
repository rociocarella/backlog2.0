package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Actualizar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <!-- BOOTSTRAP-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("     \n");
      out.write("        <title>Actualizar Usuario</title>\n");
      out.write("        <!--header-->\n");
      out.write("                <img src=\"actualizarusuarios.jpg\">         \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Actualizar registro cliente</h1>\n");
      out.write("\n");
      out.write("                <form action=\"Actualizar\" method=\"POST\">\n");
      out.write("                    <input type=\"hidden\" name=\"ID_CLIENTE\" value=\"\" />ID_CLIENTE<br/>\n");
      out.write("            <input type=\"text\" name=\"NOMBRE\" value=\"\" />NOMBRE<br/>\n");
      out.write("            <input type=\"text\" name=\"RUT\" value=\"\" />RUT<br/>\n");
      out.write("            <input type=\"text\" name=\"APELLIDO\" value=\"\" />APELLIDO<br/>\n");
      out.write("            <input type=\"text\" name=\"DIRECCION\" value=\"\" />DIRECCION<br/>\n");
      out.write("            <input type=\"text\" name=\"COMUNA\" value=\"\" />COMUNA<br/>\n");
      out.write("            <input type=\"text\" name=\"EMAIL\" value=\"\" />EMAIL<br/>\n");
      out.write("            <input type=\"text\" name=\"FECHA_NAC\" value=\"\" />FECHA_NAC<br/>\n");
      out.write("            <input type=\"password\" name=\"PASS\" value=\"\" />PASS<br/>\n");
      out.write("            <input type=\"submit\" value=\"Actualizar\" name=\"Actualizar\" />\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("              <!-- footer -->\n");
      out.write("            <img src=\"futter.jpg\">\n");
      out.write("             \n");
      out.write("        \n");
      out.write("    </body>\n");
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
