<%-- 
    Document   : eliminarContacto
    Created on : Jun 23, 2016, 11:55:14 AM
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
                <form class="form-horizontal" action="EliminarContacto" method="post">
                    <center>
                        <div class="row">
                            <div class="col-sm-12">
                                <center>
                                    <h2>
                                        <b>Eliminar Contacto</b>
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
                        </div>
                    </center>
                    <div class="row">
                        <div class="col-sm-12"> 
                            <center><button type="submit" class="bt btn-success" > Eliminar Contacto </button></center>
                        </div>    
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>