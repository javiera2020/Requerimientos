/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author javil
 */
public class Login {
    Conexion con;
    int Id;
    String Usuario;
    String Password;
    
    
public Login ()throws ClassNotFoundException,SQLException{
Conexion con = new Conexion(); 
}
public Login (int Id, String Usuario, String Password)throws ClassNotFoundException,SQLException{

    Conexion con = new Conexion(); 
    this.Id = Id;
    this.Usuario = Usuario;
    this.Password = Password;
}

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
 public boolean iniciaSesion() throws SQLException{
     String sentencia = "select * form Usuario where Nombre ='"+Usuario+"'"+"and Password = '"+Password+"'";
     ResultSet re = Conexion.consultarSQL(sentencia);
     boolean respuesta = false;
     if(re.next()){
         respuesta = true;
     }
     return respuesta;
 }
}

