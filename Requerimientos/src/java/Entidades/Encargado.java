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
public class Encargado {
    Conexion con;
    int Id;
    String Nombre;
    String Apellido;
    String Cargo;
    
    public Encargado()throws ClassNotFoundException,SQLException{
        Conexion con = new Conexion(); 
    }
    
    public Encargado(int Id, String Nombre, String Apellido, String Cargo)throws ClassNotFoundException,SQLException{
        Conexion con = new Conexion();
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cargo = Cargo;
        
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    
        public ArrayList<Encargado> obtenerEncargado() throws SQLException, ClassNotFoundException{
   String sentencia = "select Id, encargado from encargado ";
   
  ArrayList <Encargado> encargado = new ArrayList();
  ResultSet re = Conexion.consultarSQL(sentencia);
  while(re.next()){
      encargado.add(new Encargado(re.getInt("Id"),re.getString("Nombre"),re.getString("Apellido"),re.getString("Cargo")));
     
  }
  
      return encargado;
  }
}
