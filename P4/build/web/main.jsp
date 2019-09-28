
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
    </head>
    <body>
        <center><h1>Informacion de Usuario</h1></center>
            <b>Nombre:</b><%= request.getParameter("nombre")%><br/>
            <b>Contraseña:</b><%= request.getParameter("pass")%><br/>
            <b>Email:</b><%= request.getParameter("correo")%><br/>
            <b>Edad:</b><%= request.getParameter("edad")%><br/>
    </body>
</html>
