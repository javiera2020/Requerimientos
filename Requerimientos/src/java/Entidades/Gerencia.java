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
public class Gerencia {
   Conexion con;
   int id;
   String Descripcion;
    
public Gerencia () throws ClassNotFoundException,SQLException{
    Conexion con = new Conexion();
}
public Gerencia (int id, String Descripcion) 
throws ClassNotFoundException,SQLException{
    Conexion con = new Conexion();
    this.id = id;
    this.Descripcion = Descripcion;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

public ArrayList<Gerencia> obtenerGerencia() throws SQLException, ClassNotFoundException{
   String sentencia = "select Id, gerencia from gerencia ";
   
  ArrayList <Gerencia> gerencia = new ArrayList();
  ResultSet re = Conexion.consultarSQL(sentencia);
  while(re.next()){
      gerencia.add(new Gerencia(re.getInt("Id"),re.getString("Descripcion")));
     
  }
  
       return gerencia;
  }
      
  }
        

