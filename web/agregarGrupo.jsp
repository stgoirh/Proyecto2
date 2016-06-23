<%-- 
    Document   : agregarGrupo
    Created on : 09-06-2016, 1:26:59
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
                <form class="form-horizontal" action="CrearGrupo" method="post" id="formRegistroTrabajador"> 
            <center>
                <div class="row">
                    <div class="col-sm-12">
                        <center>
                            <h2
                                <b> Crear Grupo</b>
                            </h2>
                        </center>
                    </div>
                </div>
                <div class="col-sm-8">
                    <div class="form-group">
                        <label for="nombreGrupo" class="col-sm-5 control-label" > Nombre Grupo </label>
                        <div class="col-sm-7">
                            <input type="text" placeholder="Nombre del Grupo" class="form-control" id="nombreContacto"
                                   name="nombreGrupo" required>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="descripcionGrupo" class="col-sm-5 control-label" > Descripcion Grupo </label>
                        <div class="col-sm-7">
                            <input type="text" placeholder="Descripcion del Grupo" class="form-control" id="nombreContacto"
                                   name="descripcionGrupo" required>
                        </div>
                    </div>
                    <div class="form form-group">
                        <label for="listaContactos" class="col-sm-5 control-label">Elija un contacto para el grupo</label>
                        <div class="col-sm-7">
                            <select class="form-control" name="select">
                                <i:forEach items="${lista}" var="contacto">
                                    <option value="${contacto.uid}">${contacto.nombre} ${contacto.uid}</option>
                                </i:forEach>
                            </select>
                            
                         </div>
                        
                    </div>
               
            </center>
            <div class="row">
                <div class="col-sm-12"> 
                    <center><button type="submit" class="bt btn-success" > Crear Grupo </button></center>
                </div>    
            </div>
        </form>
                
  
                
                
                
     </div>
        </div>
    </body>
</html>
