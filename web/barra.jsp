<%-- 
    Document   : barra
    Created on : 09-06-2016, 1:01:12
    Author     : Xiterss
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    </head>
    <body>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid"> 
               <div class="navbar-header">
            </div>
            <ul class="nav navbar-nav">
                <a class="navbar-brand" href="index.jsp">Inicio</a>
                <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" role="button" href="#" aria-haspopup="true" aria-expanded="false">Contactos<span class="caret"</span></a>
                    <ul class="dropdown-menu">
                        <li><a href="AgregarContacto">Agregar Contacto</a></li>
                        <li><a href="EditarContacto">Editar Contacto</a></li>
                        <li><a href="EliminarContacto">Eliminar Contacto</a></li>
                        <li><a href="BuscarContacto">Buscar Contacto</a></li>
                        <li><a href="ContactosList">Ver Contactos</a></li>
                    </ul>
                </li>
                <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Grupos<span class="caret"</span></a>
                    <ul class="dropdown-menu">
                        <li><a href="CrearGrupo">Crear Grupo</a></li>
                        <li><a href="#">Editar Grupo</a></li>
                        <li><a href="#">Buscar Grupo</a></li>
                        <li><a href="#">Eliminar Grupo</a></li>
                        <li><a href="CrearActividad">Crear Actividad</a></li>
                    </ul>
                </li>    
            </ul>
        </nav>
    </body>
</html>
