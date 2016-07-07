<%-- 
    Document   : verNotificacion
    Created on : 05-07-2016, 18:56:42
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
                <center>
                    <div class="col-sm-8">
                        <div class="form-group">
                            <label class="col-sm-5 control-label">Seleccione el grupo</label>
                            <form action="VerNotificacion" method="post"> 
                                <div class="col-sm-5">
                                    <select class="form-control" name="select">
                                        <<i:forEach items="${lista}" var="grupo">
                                            <option value="${grupo.uid}">${grupo.nombre} ${grupo.uid}</option>
                                        </i:forEach>
                                    </select>
                                </div>
                                <button type="submit" class="bt btn-success">Ver</button>

                            </form>


                        </div>

                    </div>
                </center>
            </div>
            <i:forEach items="${listaActividad}" var="notificacion">
                <div class="list-group">
                    <li class="list-group-item">
                        <p>${notificacion.mensaje}</p>
                        <p>Fecha: ${notificacion.fecha}</p>
                        <p>Visto por: </p>
                    </li>

                </i:forEach>
            </div>

        </div>   
    </body>
</html>
