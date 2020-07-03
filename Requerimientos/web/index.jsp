<%-- 
    Document   : index
    Created on : 03-jul-2020, 0:11:27
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
        <h1>Bienvenido</h1>
             <form action="ingreso" method="post">
        <table border="1">
  
                <tr>
                    <td>Usuario</td>
                    <td><input type="text" name="usuario"></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password"></td>
                </tr>
                <tr>
                    <td><a href="Registrar.jsp">Registrar</a></td>
                    <td><input type="submit" value="Ingresar"></td>
                </tr>
            
        </table>
        <% if (request.getParameter("mensaje")!=null){%>
        <%=request.getParameter("mensaje")%>
        <%}%>
        </form>
    </body>
</html>
