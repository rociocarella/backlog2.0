

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <!-- BOOTSTRAP-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        
        <title>ERROR!</title>
                
        <!--header-->
        <img src="error.jpg">

    </head>
    <body>
    <center><h1>Ocurrió un error</h1></center>
        <%
            String error = (String) request.getSession().getAttribute("mensaje");
        %>
        <p>Error :  <%out.println(error);%></p>
        
            <center><img src="erroricon.jpg"></center>

            <br>
            <br>
            <br>
            <br>
            <!-- footer -->
            <img src="futter.jpg">

        
    </body>
</html>
