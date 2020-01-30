<%-- 
    Document   : buscar
    Created on : 04-05-2019, 12:31:47
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
        <h1>Buscar</h1>
        <form action="Leer" method="POST">
            ID_USUARIO <input type="text" name="ID_USUARIO" value="" /><br/>
            <input type="submit" value="Burcar" name="Buscar" />
        </form>
    </body>
</html>
