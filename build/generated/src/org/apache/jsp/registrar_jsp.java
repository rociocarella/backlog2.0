package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registrar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <!-- BOOTSTRAP-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <title>Registrar Usuario</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <img src=\"registrarusuario.jpg\">\n");
      out.write("        \n");
      out.write("    <center><h1>Rellena el formulario para ingresar un nuevo usuario</h1></center>\n");
      out.write("    <br>\n");
      out.write("\n");
      out.write("        <form action=\"registrar\" method=\"POST\" style=\"background-color: lavender; align-content: flex-start;\">\n");
      out.write("            \n");
      out.write("            <input type=\"text\" name=\"ID_USUARIO\" value=\"\" style=\"background-color: lightblue\"/>     ID_USUARIO<br/>\n");
      out.write("            <input type=\"text\" name=\"NOMBRE\" value=\"\"style=\"background-color: lightblue\" />     NOMBRE<br/>\n");
      out.write("            <input type=\"text\" name=\"PASSWORD\" value=\"\" style=\"background-color: lightblue\" />      PASSWORD<br/>\n");
      out.write("            <input type=\"text\" name=\"TOKEN_CSRF\" value=\"\" style=\"background-color: lightblue\"/>     TOKEN_CSRF<br/>\n");
      out.write("            <input type=\"text\" name=\"ULTIMA_CONEXION\" value=\"\" style=\"background-color: lightblue\"/>     ULTIMA_CONEXION<br/>\n");
      out.write("            <input type=\"text\" name=\"CORREO\" value=\"\" style=\"background-color: lightblue\"/>     CORREO ELECTRONICO<br/>\n");
      out.write("            <input type=\"text\" name=\"ID_TIPO_USUARIO\" value=\"\" style=\"background-color: lightblue\"/>     ID_TIPO_USUARIO<br/>\n");
      out.write("            \n");
      out.write("            <!-- BORRADO\n");
      out.write("            <input type=\"text\" name=\"FECHA_NAC\" value=\"\" style=\"background-color: lightblue\"/>FECHA_NAC<br/>\n");
      out.write("            <input type=\"password\" name=\"PASS\" value=\"\" style=\"background-color: lightblue\"/>PASS<br/>\n");
      out.write("            -->\n");
      out.write("            \n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <!-- saque boton por feo \n");
      out.write("            <input type=\"submit\" value=\"Agregar\" name=\"agregar\" />\n");
      out.write("            -->\n");
      out.write("            <input type=\"submit\" value=\"Agregar\" name=\"agregar\" class=\"btn btn-primary\"  role=\"button\"/>\n");
      out.write("        <br>\n");
      out.write("    \n");
      out.write("        </form>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");
      out.write("            \n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
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
