/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author javil
 */
public class Conexion {

    public static ResultSet consultarSQL(String sentencia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
          Connection con;
    public Conexion(){
        try {
         Class.forName("com.mysql.jdbc.Driver");
         con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/Evaluacion2","root","");
        } catch (Exception e) {
           System.err.print("Error" +e);
           
        }
    }
    public static void main(String[] args) {
        Conexion con=new Conexion();
    }
}
