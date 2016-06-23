<%-- 
    Document   : editarContacto
    Created on : Jun 16, 2016, 7:31:42 PM
    Author     : John Titor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: chocolate">
        <jsp:include page="barra.jsp"/>
        <div class="container">
            <div class="jumbotron">
                <form class="form-horizontal" action="EditarContacto" method="post">
                    <center>
                        <div class="row">
                            <div class="col-sm-12">
                                <center>
                                    <h2>
                                        <b>Editar Contacto</b>
                                    </h2>
                                </center>
                            </div>                            
                        </div>
                        <div class="col-sm-8">
                            <div class="form-group">
                                <label for="uidContacto" class="col-sm-5 control-label">Uid Contacto</label>
                                <div class="col-sm-7">
                                    <input type="text"<input type="text" placeholder="Uid del contacto" class="form-control" id="uidContacto"
                                                             name="uidContacto" required>
                                </div>                                
                            </div>
                            <div class="form-group">
                                <label for="newNombre" class="col-sm-5 control-label">Nombre Contacto</label>
                                <div class="col-sm-7">
                                    <input type="text"<input type="text" placeholder="Nuevo nombre del contacto" class="form-control" id="newNombre"
                                                             name="newNombre" required>
                                </div>                                
                            </div>
                            <div class="form-group">
                                <label for="newApellido" class="col-sm-5 control-label">Apellido Contacto</label>
                                <div class="col-sm-7">
                                    <input type="text"<input type="text" placeholder="Nuevo Apellido del contacto" class="form-control" id="newApellido"
                                                             name="newApellido" required>
                                </div>                                
                            </div>
                            <div class="form-group">
                                <label for="newTelefono" class="col-sm-5 control-label">Telefono Contacto</label>
                                <div class="col-sm-7">
                                    <input type="text"<input type="text" placeholder="nuevo Telefono del contacto" class="form-control" id="newTelefono"
                                                             name="newTelefono" required>
                                </div>                                
                            </div>
                            <div class="form-group">
                                <label for="newEmail" class="col-sm-5 control-label">E-mail Contacto</label>
                                <div class="col-sm-7">
                                    <input type="text"<input type="text" placeholder="nuevo E-mail del contacto" class="form-control" id="newEmail"
                                                             name="newEmail" required>
                                </div>                                
                            </div>
                            <div class="form-group">
                                <label for="newCiudad" class="col-sm-5 control-label">Ciudad Contacto</label>
                                <div class="col-sm-7">
                                    <input type="text"<input type="text" placeholder="Nueva Ciudad del contacto" class="form-control" id="newCiudad"
                                                             name="newCiudad" required>
                                </div>                                
                            </div>
                            <div class="form-group">
                                <label for="newOrganizacion" class="col-sm-5 control-label">Organizacion Contacto</label>
                                <div class="col-sm-7">
                                    <input type="text"<input type="text" placeholder="Nueva Organizacion del contacto" class="form-control" id="newOrganizacion"
                                                             name="newOrganizacion" required>
                                </div>                                
                            </div>
                            <div class="form-group">
                                <label for="newImagen" class="col-sm-5 control-label">Imagen Contacto</label>
                                <div class="col-sm-7">
                                    <input type="text"<input type="text" placeholder="nueva Imagen del contacto" class="form-control" id="newImagen">
                                </div>                                
                            </div>                            
                        </div>
                    </center>
                    <div class="row">
                        <div class="col-sm-12"> 
                            <center><button type="submit" class="bt btn-success" > Editar Contacto </button></center>
                        </div>    
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
