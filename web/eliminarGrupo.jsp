<%-- 
    Document   : eliminarGrupo
    Created on : 07-07-2016, 2:06:52
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
    <body>
        <jsp:include page="barra.jsp"/>
        <div class="container">
            <div class="jumbotron">
                <form class="form-horizontal" action="EliminarGrupo" method="post">
                    <center>
                        <div class="row">
                            <div class="col-sm-12">
                                <center>
                                    <h2>
                                        <b>Eliminar Grupo</b>
                                    </h2>
                                </center>
                            </div>                            
                        </div>
                        <div class="col-sm-8">
                            <div class="form-group">
                                <label for="uidContacto" class="col-sm-5 control-label">Elija el grupo</label>
                                <div class="col-sm-7">
                                    <select class="form-control" name="select">
                                        <i:forEach items="${lista}" var="grupo">
                                            <option value="${grupo.uid}">${grupo.nombre} ${grupo.uid}</option>
                                        </i:forEach>
                                    </select>

                                </div>                                
                            </div>                                                        
                        </div>
                    </center>
                    <div class="row">
                        <div class="col-sm-12"> 
                            <center><button type="submit" class="bt btn-success" > Eliminar Grupo </button></center>
                        </div>    
                    </div>
                </form>
                <br><br>
                <center><label>${resultado}</label></center>
                
            </div>
        </div>
    </body>
</html>
