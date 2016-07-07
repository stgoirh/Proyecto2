<%-- 
    Document   : vistosActividad
    Created on : 06-07-2016, 16:15:40
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
                <form action="VistosActividad" method="post">
                    <div class="form-group">
                        <label for="nombreGrupo" class="col-sm-2 control-label" > Uid Actividad </label>
                        <div class="col-sm-5">
                            <input type="text" placeholder="Uid Actividad" class="form-control" id="nombreContacto"
                                   name="uidActividad" required>
                        </div>
                        <div class="col-sm-2">
                            <button type="submit" class="bt btn-success">Buscar</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
        <i:forEach items="${lista}" var="contacto">
            
            <div class="container">
            <div class="jumbotron">
                <div class="row">
                    <div class="col-sm-4">
                        <img src="${contacto.imagen}" width="150" height="150"/>
                    </div>
                    <div class="col-sm-8">
                        <div class="row"><label>Nombre: ${contacto.nombre}</label></div>
                        <div class="row"><label>Apellido: ${contacto.apellido}</label></div>
                        <div class="row"><label>Telefono: ${contacto.telefono}</label></div>
                        <div class="row"><label>E-Mail: ${contacto.mail}</label></div>
                        <div class="row"><label>Ciudad: ${contacto.ciudad}</label></div>
                        <div class="row"><label>Organización: ${contacto.organizacion}</label></div>
                    </div>
                   
                </div>
         
            </div>
            
        </div>
            
        </i:forEach>
    </body>
</html>
