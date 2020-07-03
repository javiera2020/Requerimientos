/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author javil
 */
public class ControlIntranet extends HttpServlet{
     
    protected void processRequest (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
       String accion = request.getParameter("action"); 
       switch (accion){
           case "1": IniciaSesion(request, response);
           break;
           case "2": IngresaRequerimiento(request, response);
           break;
           case "3": ConsultaRequerimiento(request, response);
           break;
           case "4": CerrarRequerimiento(request, response);
           
                   
       }
    }
    catch(Exception e){
            response.sendRedirect("index.jsp?mensaje="+e.getMessage());
        }

    private void IniciaSesion(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void IngresaRequerimiento(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ConsultaRequerimiento(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void CerrarRequerimiento(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

    private void IniciaSesion(HttpServletRequest request, HttpServletResponse response) throw IOException, ClassNotFoundException, SQLException{
        String Usuario = request.getParameter("Usuario").trim();
        String Password = request.getParameter("Password").trim();
        if (Usuario.isEmpty()|| Password.isEmpty()){
        response.sendRedirect("index.jsp?mensaje=Complete todos los campos");
          
        }else{
            Usuario u = new Usuario();
            u.setUsuario(Usuario);
            u.setPassword(Password);
            if (u.iniciaSesion()){
                response.sendRedirect(Intranet.jsp);
            }else{
                response.sendRedirect(index.jsp?mensaje= Datos incorrectos);
            }
            
            
        }
                
    
    }

    private void IngresaRequerimiento(HttpServletRequest request, HttpServletResponse response) 
        throw IOException, ClassNotFoundException, SQLException{

    }

    private void ConsultaRequerimiento(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void CerrarRequerimiento(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




   

    
}
