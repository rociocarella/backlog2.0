
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <!-- BOOTSTRAP-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
     
        <title>Actualizar Usuario</title>
        <!--header-->
                <img src="actualizarusuarios.jpg">         
    </head>
    <body>
    <center><h1>Actualizar registro cliente</h1></center>
    <br>
    
        <form action="Actualizar" method="POST" style="background-color: lavender">
            <input type="text" name="ID_USARIO" value="" />ID_USARIO<br/>
            <input type="text" name="NOMBRE" value="" />NOMBRE<br/>
            <input type="text" name="PASSWORD" value="" />PASSWORD<br/>
            <input type="text" name="TOKEN_CSRT" value="" />TOKEN_CSRT<br/>
            <input type="text" name="ULTIMA_CONEXION" value="" />ULTIMA_CONEXION<br/>
            <input type="text" name="CORREO" value="" />CORREO<br/>
            <input type="text" name="ID_TIPO_USUARIO" value="" />ID_TIPO_USUARIO<br/>
            
            
            <!-- borrado por feo
            <input type="submit" value="Actualizar" name="Actualizar" />
            -->
            <br>
            <center>
            <input type="submit" value="Actualizar" name="Actualizar" class="btn btn-primary"  role="button"/>
            </center>
        </form>
        
        
              <!-- footer -->
            <img src="futter.jpg">
<%-- Bootstrap --%>            
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

            
        
    </body>
</html>
