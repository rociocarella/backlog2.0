
<%@page import="modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% Usuario c=(Usuario)request.getSession().getAttribute("MyClienteEncontrado"); %>
        <h1>El cliente <%out.println(c.getNombre());%> esta registrado </h1>
        <p>ID asignada <%out.println(c.getId_usuario());%> XD</p> 
            
    </body>
</html>
