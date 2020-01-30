
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Usuario</title>
    </head>
    <body>
        <h1>Rellena el formulario para ingresar un nuevo usuario</h1>

        <form action="registrar" method="POST">
            
            <input type="text" name="ID_CLIENTE" value="" />ID_CLIENTE<br/>
            <input type="text" name="NOMBRE" value="" />NOMBRE<br/>
            <input type="text" name="RUT" value="" />RUT<br/>
            <input type="text" name="APELLIDO" value="" />APELLIDO<br/>
            <input type="text" name="DIRECCION" value="" />DIRECCION<br/>
            <input type="text" name="COMUNA" value="" />COMUNA<br/>
            <input type="text" name="EMAIL" value="" />EMAIL<br/>
            <input type="text" name="FECHA_NAC" value="" />FECHA_NAC<br/>
            <input type="password" name="PASS" value="" />PASS<br/>
            <input type="submit" value="Agregar" name="agregar" />
        </form>
    </body>
</html>
