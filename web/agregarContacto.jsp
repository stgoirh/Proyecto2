<%-- 
    Document   : agregarContacto
    Created on : 09-06-2016, 1:07:03
    Author     : Xiterss
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <body style="background-color: chocolate;">
        <jsp:include page="barra.jsp"/>

        <div class="container">
            <div class="jumbotron">
                <form class="form-horizontal" action="AgregarContacto" method="post"> 
                    <center>
                        <div class="row">
                            <div class="col-sm-12">
                                <center>
                                    <h2
                                        <b> Agregar Contacto</b>
                                    </h2>
                                </center>
                            </div>
                        </div>
                        <div class="col-sm-8">
                            <div class="form-group">
                                <label for="nombreContacto" class="col-sm-5 control-label" > Nombre Contacto </label>
                                <div class="col-sm-7">
                                    <input type="text" placeholder="Nombre del contacto" class="form-control" id="nombreContacto"
                                           name="nombreContacto" required>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="apellidoContacto" class="col-sm-5 control-label" > Apellido Contacto </label>
                                <div class="col-sm-7">
                                    <input type="text"  placeholder="Apellido del contacto" class="form-control" id="apellidoContacto"
                                           name="apellidoContacto" required>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="telefonoContacto" class="col-sm-5 control-label" > Telefono Contacto </label>
                                <div class="col-sm-7">
                                    <input type="text"  placeholder="Telefono del contacto" class="form-control" id="telefonoContacto"
                                           name="telefonoContacto" required>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="mailContacto" class="col-sm-5 control-label" > Email Contacto </label>
                                <div class="col-sm-7">
                                    <input type="text"  placeholder="Email del contacto" class="form-control" id="mailContacto"
                                           name="mailContacto" required>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="nombreOrganizacion" class="col-sm-5 control-label" > Organizacion Contacto </label>
                                <div class="col-sm-7">
                                    <input type="text"  placeholder="Organizacion del contacto" class="form-control" id="nombreEmpresa"
                                           name="nombreOrganizacion" required>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="nombreCiudad" class="col-sm-5 control-label" > Ciudad Contacto </label>
                                <div class="col-sm-7">
                                    <input type="text"  placeholder="Ciudad del contacto" class="form-control" id="nombreCiudad"
                                           name="nombreCiudad" required>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="imagenContacto" class="col-sm-5 control-label" > Imagen Contacto </label>
                                <div class="col-sm-7">
                                    <input type="text"  placeholder="url de la imagen" class="form-control" id="nombreCiudad"
                                           name="imagenContacto">
                                </div>
                            </div>
                    </center>
                    <div class="row">
                        <div class="col-sm-12"> 
                            <center><button type="submit" class="bt btn-success" > Agregar Contacto </button></center>
                        </div>    
                    </div>
                </form>  
            </div>
        </div>
    </body>
</html>
