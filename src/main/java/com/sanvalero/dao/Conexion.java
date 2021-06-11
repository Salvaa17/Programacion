package com.sanvalero.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection conexion;    
    public static String DRIVER = "oracle.jdbc.driver.OracleDriver";       
    public static String URL_CONEXION = "jdbc:oracle:thin:@localhost:1521:XE";  
    public static String USUARIO = "SYSTEM";        
    public static String CONTRASENA = "1234";
    
    
    public static Connection getConexion(){
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL_CONEXION , USUARIO, CONTRASENA);
        } catch (Exception e) {
            System.out.println("Error en conexion");
        }
        return conexion;
    }
}
