<%-- 
    Document   : agregarContactoGrupo
    Created on : 29-06-2016, 23:35:17
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
                <form action="AgregarContactoGrupo" method="post">
                    <center>

                        <div class="col-sm-8">
                            <div class="form-group">
                                <label for="desc" class="col-sm-5 control-label">${busqueda}</label>
                                <div class="col-sm-5">
                                    <select class="form-control" name="select">
                                        <<i:forEach items="${lista}" var="contacto">
                                            <option value="${contacto.uid}">${contacto.nombre} ${contacto.uid}</option>
                                        </i:forEach>
                                    </select>
                                </div>
                                <button type="submit" class="bt btn-success" name="btn" value="contacto" >Ver</button>                                
                            </div>
                        </div>
                        <br>
                        <br>
                        <div class="row">
                            <div class="col-sm-8">
                                <div class="form-group">
                                    <label for="listaContacto" class="col-sm-5 control-label">Seleccione un Grupo</label>
                                    <div class="col-sm-5">
                                        <select class="form-control" name="selectGrupo">
                                            <<i:forEach items="${listaGrupo}" var="grupo">
                                                <option value="${grupo.uid}">${grupo.nombre} ${grupo.uid}</option>
                                            </i:forEach>
                                        </select>
                                    </div>
                                    <button type="submit" class="bt btn-success" name="btn" value="${boton}" >Agregar</button>
                                </div>
                            </div>

                        </div>


                    </center>
                </form>


            </div>

        </div>   

    </body>
</html>
