
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <!-- BOOTSTRAP-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        
        
        <title>Registrar Usuario</title>
    </head>
    <body>
        <img src="registrarusuario.jpg">
        
    <center><h1>Rellena el formulario para ingresar un nuevo usuario</h1></center>
    <br>

        <form action="registrar" method="POST" style="background-color: lavender">
            
<<<<<<< HEAD
            <input type="text" name="ID_USARIO" value="" />ID_CLIENTE<br/>
            <input type="text" name="NOMBRE" value="" />NOMBRE<br/>
            <input type="text" name="PASSWORD" value="" />RUT<br/>
            <input type="text" name="TOKEN_CSRT" value="" />APELLIDO<br/>
            <input type="text" name="ULTIMA_CONEXION" value="" />DIRECCION<br/>
            <input type="text" name="CORREO" value="" />COMUNA<br/>
            <input type="text" name="ID_TIPO_USUARIO" value="" />EMAIL<br/>
=======
            <input type="text" name="ID_USUARIO" value="" style="background-color: lightblue"/>     ID_USUARIO<br/>
            <input type="text" name="NOMBRE" value=""style="background-color: lightblue" />     NOMBRE<br/>
            <input type="text" name="PASSWORD" value="" style="background-color: lightblue" />      PASSWORD<br/>
            <input type="text" name="TOKEN_CSRF" value="" style="background-color: lightblue"/>     TOKEN_CSRF<br/>
            <input type="text" name="ULTIMA_CONEXION" value="" style="background-color: lightblue"/>     ULTIMA_CONEXION<br/>
            <input type="text" name="CORREO" value="" style="background-color: lightblue"/>     CORREO ELECTRONICO<br/>
            <input type="text" name="ID_TIPO_USUARIO" value="" style="background-color: lightblue"/>     ID_TIPO_USUARIO<br/>
            
            <!-- BORRADO
            <input type="text" name="FECHA_NAC" value="" style="background-color: lightblue"/>FECHA_NAC<br/>
            <input type="password" name="PASS" value="" style="background-color: lightblue"/>PASS<br/>
            -->
            
            <!-- saque boton por feo 
>>>>>>> rocio
            <input type="submit" value="Agregar" name="agregar" />
            -->
            <input type="submit" value="Agregar" name="agregar" class="btn btn-primary"  role="button"/>
        <br>
        
    
        </form>
    
    <!-- footer -->
            <img src="futter.jpg">

    
    
    <%-- Bootstrap --%>            
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

    </body>
</html>
