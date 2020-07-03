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
    
   public ArrayList<Login> obtenerRequerimiento() throws SQLException, ClassNotFoundException{
   String sentencia = "select Id, login from login ";
   
  ArrayList <Login> login = new ArrayList();
  ResultSet re = Conexion.consultarSQL(sentencia);
  while(re.next()){
      login.add(new Login(re.getInt("Id"),re.getString("Usuario"),re.getString("password")));
     
  }
  
      return login;
  }
}

