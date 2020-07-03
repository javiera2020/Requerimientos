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
public class Requerimiento {
    Conexion con;
    int Id;
    String Descripcion;
    
    public Requerimiento ()throws ClassNotFoundException,SQLException{
        Conexion con = new Conexion(); 
    }
    
     public Requerimiento (int Id, String Descripcion)throws ClassNotFoundException,SQLException{
        Conexion con = new Conexion(); 
        this.Id = Id;
        this.Descripcion = Descripcion;
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
             public ArrayList<Requerimiento> obtenerRequerimiento() throws SQLException, ClassNotFoundException{
   String sentencia = "select Id, requerimiento from requerimiento ";
   
  ArrayList <Requerimiento> requerimiento = new ArrayList();
  ResultSet re = Conexion.consultarSQL(sentencia);
  while(re.next()){
      requerimiento.add(new Requerimiento(re.getInt("Id"),re.getString("Descripcion")));
     
  }
  
      return requerimiento;
  }
}

