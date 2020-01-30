<%-- 
    Document   : error
    Created on : 04-05-2019, 16:26:23
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
        <h1>Ocurrio un error</h1>
        <%
            String error = (String) request.getSession().getAttribute("mensaje");
        %>
        <p>Error :  <%out.println(error);%></p>
    </body>
</html>
