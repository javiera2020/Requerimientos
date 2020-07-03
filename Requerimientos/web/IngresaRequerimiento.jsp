<%-- 
    Document   : IngresaRequerimiento
    Created on : 03-jul-2020, 2:10:44
    Author     : javil
--%>

<%@page import="Entidades.Encargado"%>
<%@page import="Entidades.Asignado"%>
<%@page import="Entidades.Departamento"%>
<%@page import="Entidades.Gerencia"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ingresa el Requerimiento</h1>
    <center>
        <form action="" method="post">
            <table>
                <tr>
                    <th>Gerencia:</th>
                    <% try{
                        Gerencia g =new Gerencia();
                        ArrayList<Gerencia> gerencia = g.obtenerGerencia();
                     %>
                    
                    <td><select name="gerencia">
                            <option disabled selected>Seleccionar</option>
                            <% for(Gerencia ge: gerencia){%>
                            <option value="<%= ge.getDescripcion()%>">
                                <%= ge.getDescripcion()%>
                            </option>
                            <% } %>
                        </select></td>
                        <%
                            }catch (Exception e){
                          out.println(e.getMessage());
                            }%>
                </tr>
                <tr>
                    <th>Departamento:</th>
                    <% try{
                        Departamento d = new Departamento();
                        ArrayList<Departamento> departamento = d.obtenerDepartamento();
                    %>
                    <td><select name="Departamento">
                            <option disabled selected>Seleccionar </option>
                            <% for (Departamento dep: departamento){%>
                            <option value="<%=dep.getDescripcion()%>">
                                <%= dep.getDescripcion()%>
                            </option>
                           <%}%>
                           
                        </select>
                    </td>
                    <%
                        }catch (Exception e){
                   out.println(e.getMessage());
}%>
                    
                </tr>
                
                <tr>
                <hd>Asignar a:</hd>
                <% try{
                    Asignado a = new Asignado();
                    ArrayList<Asignado> asignado = a.obtenerAsignado();
                    %>
                <td><select name="Asignar">
                <opcion disabled selected>Seleccionar</opcion>
                <% for(Asignado as: asignado) {%>
                <option value="<%= as.getDescripcion()%>">
                    <%= as.getDescripcion()%>
                </option>
                <%}%>
                    </select></td>
                    <%
                        }catch(Exception e){
                      out.println(e.getMessage());
                    }%>
                </tr>
                
                <tr>
                <hd>Encargado:</hd>
                <% try{
                    Encargado e = new Encargado();
                    ArrayList<Encargado> encargado = e.obtenerEncargado();
                    %>
                <td><select name="Encargado">
                        <opcion disabled selected>Seleccionar</opcion>
                        <% for (Encargado enc: encargado) {%>
                        <option value="<%=enc.getNombre()%>">
                            <%= enc.getNombre()%>
                        </option>
                        <%}%>
                     </select></td>
                     <%
                         }catch(Exception e){
                       out.println(e.getMessage());
                          }%>
                </tr>
                
                <tr>
                    <th>Requerimiento:</th>
                    <td><textarea name="requerimiento" type="text"></textarea></td>
                </tr>
                <tr>
                    <th><input type="submit" value="Guardar"/>
                        <input type="hidden" name ="accion" value=""/>
                </tr>
            </table>
        </form>
    </center>
    </body>
</html>
