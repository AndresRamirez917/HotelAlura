/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsuariosDAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author andres
 */
public class Conexion {
    //la base de datos debe de ir con la extension de sqlite .s3db
    String conexionDB = "jdbc:sqlite:C:/Users/andres/Documents/NetBeansProjects/HotelAlura/BDUsuarios.s3db";
    Connection conn = null;
    
    //constructor
    public Conexion(){
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(conexionDB);
            System.out.println("Conexión Establecida");
        } catch (Exception e) {
            System.out.println("Error de Conexión" + e);
        }
    }
    
    //método para establecer conexión con la BD
    //devuelva 1 si hubo éxito de lo contreario 0
    public int sentenciaSQL(String consultaSQL){
        try {
            PreparedStatement pStatement = conn.prepareStatement(consultaSQL);
            pStatement.execute();
            return 1;
            
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }
    
    
    //método para devolver información y validar su existencia
    public ResultSet consultarDatos(String consultaSQL){
        try {
             PreparedStatement pStatement = conn.prepareStatement(consultaSQL);
             ResultSet respuesta = pStatement.executeQuery();
             return respuesta;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
      
    
    
}
