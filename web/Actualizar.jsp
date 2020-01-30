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
                    <input type="hidden" name="ID_CLIENTE" value="" />ID_CLIENTE<br/>
            <input type="text" name="NOMBRE" value="" />NOMBRE<br/>
            <input type="text" name="RUT" value="" />RUT<br/>
            <input type="text" name="APELLIDO" value="" />APELLIDO<br/>
            <input type="text" name="DIRECCION" value="" />DIRECCION<br/>
            <input type="text" name="COMUNA" value="" />COMUNA<br/>
            <input type="text" name="EMAIL" value="" />EMAIL<br/>
            <input type="text" name="FECHA_NAC" value="" />FECHA_NAC<br/>
            <input type="password" name="PASS" value="" />PASS<br/>
            <input type="submit" value="Actualizar" name="Actualizar" />
        </form>
    </body>
</html>
