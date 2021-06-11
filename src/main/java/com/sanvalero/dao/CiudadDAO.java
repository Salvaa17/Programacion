package com.sanvalero.dao;

import com.sanvalero.domain.Ciudad;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CiudadDAO implements IDAO <Ciudad>{
    
    private Connection conexion;
    
    public CiudadDAO(){
        this.conexion = Conexion.getConexion();
    }
    @Override
    public List <Ciudad> getAll() {
        List<Ciudad> ciudades = new ArrayList();
        String sql = "SELECT * FROM CIUDAD";
        try{
         
        Statement statement = conexion.createStatement();
        ResultSet result = statement.executeQuery(sql);

        while (result.next()) {
            Ciudad ciudad = new Ciudad(result.getInt(1),result.getString(2),result.getString(3));
            ciudades.add(ciudad);
        }   
        }catch (Exception e){
            System.out.println(e);
        }
        return ciudades;
    }

    @Override
    public Ciudad getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void create(Ciudad t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Ciudad t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
