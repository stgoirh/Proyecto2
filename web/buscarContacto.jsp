<%-- 
    Document   : buscarContacto
    Created on : 09-06-2016, 21:25:17
    Author     : Xiterss
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"prefix="i"%>
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
                <div class="row" >
            <center>
                <h2>
                    <b>Búsqueda simple</b>
                </h2>
            </center>
        </div>
    <center>
        <form class="form-inline" method="post" action="BuscarContacto"
              id="formRegistroTrabajador">
            <div class="row">
                <div class="col-sm-12">
                    
                    <div class="form-group">
                        <div class="col-sm-7">
                            <input type="text" placeholder="Búsqueda simple" class="form-control" id="textoBusqueda"
                                   name="textoBusqueda">
                        </div>
                        <div class="col-sm-3">
                            <button type="submit" value="simple" name="btn_accion" >
                                <span></span>
                                <img src="imagenes/buscar.png" width="28" height="28"/>
                            
                            </button>
                        </div>
                    </div>
                </div>
            </div>
        </form>
    </center>
    <center>
        <form class="form-horizontal" method="post" action="Busqueda"
               id="formRegistroTrabajador">
            <div class="row" >
                <div class="col-sm-12">
                     <center>
                         <h2>
                             <b>Búsqueda avanzada</b>
                         </h2>
                    </center>
                </div>    
            </div>
            <div class="col-sm-8">
                <div class="form-group">
                    <label for="nombreContacto" class="col-sm-5 control-label">Nombre contacto:</label> 
                    <div class="col-sm-7">
                        <input type="text" placeholder="nombre contacto" class="form-control" id="nombreContacto"
                               name="nombre">
                    </div>
                </div>
                <div class="form-group">
                    <label for="apellido" class="col-sm-5 control-label">Apellidos contacto</label>
                    <div class="col-sm-7">
                        <input type="text" class="form-control" id="apellidosContacto"
                               placeholder="apellido contacto" name="apellido">
                    </div>
                </div>
                <div class="form-group">
                    <label for="telefono" class="col-sm-5 control-label">Teléfono contacto</label>
                    <div class="col-sm-7">
                        <input type="text" class="form-control" id="telefonoContacto"
                               placeholder="teléfono contacto" name="telefono">
                    </div>
                </div>
                <div class="form-group">
                    <label for="mail" class="col-sm-5 control-label">Email contacto:</label>
                    <div class="col-sm-7">
                        <input type="text" class="form-control" id="mailContacto"
                               placeholder="email contacto" name="mail">
                    </div>
                </div>
                <div class="form-group">
                    <label for="ciudad" class="col-sm-5 control-label"> Ciudad Contacto</label>
                    <div class="col-sm-7">
                        <input type="text" class="form-control" id="ciudadContacto" placeholder="Ciudad del Contacto" name="ciudad">
                    </div>
                    
                    
                    
                    
                </div>
            </div>
            <div class="row">
                <div class="col-sm-12">
                    <center><button type="submit" value="avanzado" name="btn_accion" class="btn btn-success">
                            <span class="glyphicon glyphicon-search" aria-hidden="true"></span> Buscar </button></center>
                </div>
            </div>
        </form>
    </center>  
    
     </div>
        </div>
      
      <i:forEach items="${lista}" var="contacto">
            
            <div class="container">
            <div class="jumbotron">
                <div class="row">
                    <div class="col-sm-4">
                        <img src="${contacto.imagen_contacto}" width="300" height="300"/>
                    </div>
                    <div class="col-sm-8">
                        <div class="row"><label>Nombre: ${contacto.nombre_contacto}</label></div>
                        <div class="row"><label>Apellido: ${contacto.apellido_contacto}</label></div>
                        <div class="row"><label>Telefono: ${contacto.telefono_contacto}</label></div>
                        <div class="row"><label>E-Mail: ${contacto.mail_contacto}</label></div>
                        <div class="row"><label>Ciudad: ${contacto.ciudad_contacto}</label></div>
                        <div class="row"><label>Organización: ${contacto.organizacion_contacto}</label></div>
                    </div>
                   
                </div>
         
            </div>
            
        </div>
            
        </i:forEach>
    </body>
</html>
