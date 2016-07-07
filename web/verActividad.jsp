<%-- 
    Document   : verActividad
    Created on : 27-06-2016, 23:44:20
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
                                <form action="VerActividad" method="post"> 
                                <label class="col-sm-5 control-label">Seleccione el grupo</label>
                                <div class="col-sm-5">
                                    <select class="form-control" name="select">
                                        <<i:forEach items="${lista}" var="grupo">
                                            <option value="${grupo.uid}">${grupo.nombre} ${grupo.uid}</option>
                                        </i:forEach>
                                    </select>
                                </div>
                                <button type="submit" name="boton" value="enviar" class="bt btn-success">Ver</button>
                                 </form>
                            </div>

                        </div>
                    </center>
                </div>
                <i:forEach items="${listaActividad}" var="actividad">
                    <div class="list-group">
                        <li class="list-group-item">
                            <p>${actividad.descripcion}</p>
                            <p>Fecha: ${actividad.fecha}</p>
                        </li>

                    </i:forEach>
                </div>


        </div>   

    </body>
</html>
