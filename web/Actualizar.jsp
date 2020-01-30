<%-- 
    Document   : Actualizar
    Created on : 05-05-2019, 21:50:56
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
        <h1>Actualizar registro cliente</h1>

                <form action="Actualizar" method="POST">
            <input type="text" name="ID_USARIO" value="" />ID_CLIENTE<br/>
            <input type="text" name="NOMBRE" value="" />NOMBRE<br/>
            <input type="text" name="PASSWORD" value="" />RUT<br/>
            <input type="text" name="TOKEN_CSRT" value="" />APELLIDO<br/>
            <input type="text" name="ULTIMA_CONEXION" value="" />DIRECCION<br/>
            <input type="text" name="CORREO" value="" />COMUNA<br/>
            <input type="text" name="ID_TIPO_USUARIO" value="" />EMAIL<br/>
            <input type="submit" value="Actualizar" name="Actualizar" />
        </form>
    </body>
</html>
