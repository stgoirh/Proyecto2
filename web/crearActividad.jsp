<%-- 
    Document   : newjs
    Created on : Jun 23, 2016, 12:29:16 PM
    Author     : John Titor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"prefix="i"%>
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
                <form class="form-horizontal" action="CrearActividad" method="post">
                    <center>
                        <div class="row">
                            <div class="col-sm-12">
                                <center>
                                    <h2>
                                        <b>Crear Actividad</b>
                                    </h2>
                                </center>
                            </div>                            
                        </div>
                        <div class="col-sm-8">
                            <div class="form-group">
                                <label for="nombre" class="col-sm-5 control-label">Nombre Actividad</label>
                                <div class="col-sm-7">
                                    <input type="text"<input type="text" placeholder="Nombre de actividad" class="form-control" id="nombre"
                                                             name="nombre" required>
                                </div>                                
                            </div>                                                        
                        </div>
                        <div class="col-sm-8">
                            <div class="form-group">
                                <label for="fecha" class="col-sm-5 control-label">Fecha Actividad</label>
                                <div class="col-sm-7">
                                    <input type="text"<input type="text" placeholder="Fecha Actividad" class="form-control" id="fecha"
                                                             name="fecha" required>
                                </div>                                
                            </div>
                        </div>
                        <div class="col-sm-8">
                            <div class="form-group">
                                <label for="desc" class="col-sm-5 control-label">Descripcion Actividad</label>
                                <div class="col-sm-7">
                                    <input type="text"<input type="text" placeholder="Descripcion de Actividad" class="form-control" id="desc"
                                                             name="desc" required>
                                </div>                                
                            </div>
                        </div>

                        <div class="col-sm-8">
                            <div class="form-group">
                                <label for="listaContacto" class="col-sm-5 control-label">Elija un grupo para la Actividad</label>
                                <div class="col-sm-7">
                                    <select class="form-control" name="select">
                                        <<i:forEach items="${lista}" var="grupo">
                                            <option value="${grupo.uid}">${grupo.nombre} ${grupo.uid}</option>
                                        </i:forEach>
                                    </select>
                                </div>
                            </div>
                        </div>
                    </center>
                    <div class="row">
                        <div class="col-sm-12"> 
                            <center><button type="submit" class="bt btn-success" > Crear actividad </button></center>
                        </div>    
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
