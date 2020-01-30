<%-- 
    Document   : exito
    Created on : 05-05-2019, 23:47:36
    Author     : VAIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>

        <%
            String error = (String) request.getSession().getAttribute("mensaje");
        %>
        <h1> <%out.println(error);%></h1>
    </body>
</html>
