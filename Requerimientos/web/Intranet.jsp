<%-- 
    Document   : Intranet
    Created on : 03-jul-2020, 2:09:59
    Author     : javil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Menu principal</h1>
    <center>
        <form>
            <table border="1">
           
                    <tr>
                        <td>
                            <a href="IngresaRequerimiento.jsp"></a>
                            <input type="button" value="Ingresar Requerimiento"/>
                                   
                        </td>
                        <td>
                            <a href="ConsutaRequerimiento.jps"></a>
                            <input type="button" value="Consulta Requerimiento"/>
                        </td>
                        <td>
                            <a href="CerraRequerimiento.jsp"></a>
                            <input type="button" value="Cerrar Requerimientos"
                                  
                        </td>
                    </tr>
               
            </table>
            <% if (request.getParameter("mensaje")!= null){ %>
                <%=request.getParameter("mensaje") %>
           <% }%>
        </form>
    </center>
    </body>
</html>
