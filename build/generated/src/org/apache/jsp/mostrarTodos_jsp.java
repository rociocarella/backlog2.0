package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Cliente;
import java.util.ArrayList;

public final class mostrarTodos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Mostrar tolos clientes registrador</h1>\n");
      out.write(" ");
 ArrayList<Cliente> clie =(ArrayList<Cliente>)request.getSession().getAttribute("Clientes"); 
      out.write("\n");
      out.write("                <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID_CLIENTE</th>\n");
      out.write("                    <th>NOMBRE</th>\n");
      out.write("                    <th>RUT</th>\n");
      out.write("                    <th>APELLIDO</th>\n");
      out.write("                    <th>DIRECCION</th>\n");
      out.write("                    <th>COMUNA</th>\n");
      out.write("                    <th>EMAIL</th>\n");
      out.write("                    <th>FECHA_NAC</th>\n");
      out.write("                    <th>PASS</th>\n");
      out.write("                </tr>\n");
      out.write("                ");
         for (int i = 0; i < clie.size(); i++) {
                    out.println("<tr>");
                    out.println("<td>"+clie.get(i).getID_CLIENTE() +"</td>");
                    out.println("<td>"+clie.get(i).getNOMBRE()+"</td>");
                    out.println("<td>"+clie.get(i).getRUT()+"</td>");
                    out.println("<td>"+clie.get(i).getAPELLIDO()+"</td>");
                    out.println("<td>"+clie.get(i).getDIRECCION() +"</td>");
                    out.println("<td>"+clie.get(i).getCOMUNA() +"</td>");
                    out.println("<td>"+clie.get(i).getEMAIL()+"</td>");
                    out.println("<td>"+clie.get(i).getFECHA_NAC() +"</td>");
                    out.println("<td>"+clie.get(i).getPASS() +"</td>");

        }
      out.write("\n");
      out.write("            </thead>\n");
      out.write("\n");
      out.write("        </table>\n");
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
