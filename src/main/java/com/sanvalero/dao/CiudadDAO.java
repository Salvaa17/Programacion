/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanvalero.dao;

import com.sanvalero.domain.Ciudad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ssb28
 */
public class CiudadDAO implements IDAO <Ciudad>{
    
    private Connection conexion;
    
    public CiudadDAO(){
        this.conexion = Conexion.getConexion();
    }
    @Override
    public List <Ciudad> getAll() {
        List<Ciudad> ciudades = new ArrayList();
        String consulta = "SELECT * FROM Ciudad WHERE ID = 3";
        try{
            PreparedStatement ps = conexion.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

        while (rs.next()) {  
        Ciudad ciudad = new Ciudad(rs.getInt(1),rs.getString(2),rs.getString(3));
        ciudades.add(ciudad);
        }   
        }catch (SQLException e){
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
