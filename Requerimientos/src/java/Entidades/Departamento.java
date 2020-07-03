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
public class Departamento {
    Conexion con;
    int Id;
    String Descripcion;
    
    public Departamento()throws ClassNotFoundException,SQLException{
    Conexion con = new Conexion();   
    }
        
    
    public Departamento(int Id, String Descripcion)throws ClassNotFoundException,SQLException{
        Conexion con = new Conexion();
        this.Id = Id;
        this.Descripcion = Descripcion;
     
    }

    public Conexion getCon() {
        return con;
    }

    public void setCon(Conexion con) {
        this.con = con;
    }
    

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    public ArrayList<Departamento> obtenerDepartamento() throws SQLException, ClassNotFoundException{
   String sentencia = "select Id, departamento from departamento ";
   
  ArrayList <Departamento> departamento = new ArrayList();
  ResultSet re = Conexion.consultarSQL(sentencia);
  while(re.next()){
      departamento.add(new Departamento(re.getInt("Id"),re.getString("Descripcion")));
     
  }
  
      return departamento;
  }
    
}
