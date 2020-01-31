
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
        <h1>El USUARIO <%out.println(c.getNombre());%> esta registrado </h1>
        <p>tipo <%out.println(c.getId_tipo_usuario());%> encontrado</p> 
            
    </body>
</html>
