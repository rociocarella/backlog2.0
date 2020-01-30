<%-- 
    Document   : mostrarTodos
    Created on : 05-05-2019, 18:56:49
    Author     : VAIO
--%>

<%@page import="modelo.Cliente"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Mostrar tolos clientes registrador</h1>
 <% ArrayList<Cliente> clie =(ArrayList<Cliente>)request.getSession().getAttribute("Clientes"); %>
                <table border="1">
            <thead>
                <tr>
                    <th>ID_CLIENTE</th>
                    <th>NOMBRE</th>
                    <th>RUT</th>
                    <th>APELLIDO</th>
                    <th>DIRECCION</th>
                    <th>COMUNA</th>
                    <th>EMAIL</th>
                    <th>FECHA_NAC</th>
                    <th>PASS</th>
                </tr>
                <%         for (int i = 0; i < clie.size(); i++) {
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

        }%>
            </thead>

        </table>
        
    </body>
</html>
