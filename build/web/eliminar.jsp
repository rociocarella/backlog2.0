<%-- 
    Document   : eliminar
    Created on : 05-05-2019, 21:38:32
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
        <h1>Eliminar Cliente</h1>
        <form action="Eliminar" method="POST">
            ID_CLIENTE <input type="text" name="ID_CLIENTE" value="" /><br/>
            <input type="submit" value="Eliminar" name="Eliminar" />
        </form>
        


    </body>
</html>
