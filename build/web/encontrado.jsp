
<%@page import="modelo.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% Cliente c=(Cliente)request.getSession().getAttribute("MyClienteEncontrado"); %>
        <h1>El cliente <%out.println(c.getNOMBRE());%> esta registrado </h1>
        <p>RUT <%out.println(c.getRUT());%> encontrado</p> 
            
    </body>
</html>
