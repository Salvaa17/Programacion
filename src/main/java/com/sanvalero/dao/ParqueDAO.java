package com.sanvalero.dao;

import com.sanvalero.domain.Ciudad;
import com.sanvalero.domain.Parque;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ParqueDAO implements IDAO <Parque>{
    
    private Connection conexion;

    public ParqueDAO() {
        this.conexion = Conexion.getConexion();
    }

    @Override
    public List<Parque> getAll() {
        List <Parque> parques = new ArrayList();
        String consulta = "SELECT * FROM Parque";
        try{
            PreparedStatement ps = conexion.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Parque parque = new Parque (rs.getString(1),rs.getInt(2),rs.getDouble(3));
                parques.add(parque);
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        return parques;
    }
    
    public List<Parque> listarParqueCiudad(String ciudad) throws SQLException{
        List <Parque> parques = new ArrayList();
        String consulta = "SELECT P.NOMBRE_PARQUE FROM PARQUE P JOIN CIUDAD C ON (C.CIUDAD_ID = P.ID) WHERE C.NOMBRE = ?";
        try{
        PreparedStatement ps = conexion.prepareStatement(consulta);
        ResultSet rs = ps.executeQuery();
        ps.setString(1, ciudad);
        while(rs.next()){
            Parque parque = new Parque();
            parque.setNombre(rs.getString(1));
            parques.add(parque);
        }
        }catch(Exception e){
            System.out.println(e);
        }
        return parques;
    }

    @Override
    public Parque getById(int id) {
        return null;
    }

    /**
     *
     * @param t
     * @throws SQLException
     */
    @Override
    public void create(Parque t) throws SQLException{
        String consulta = "INSERT INTO CIUDAD VALUES (?,?,?)";
        PreparedStatement ps = conexion.prepareStatement(consulta);
        
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Parque t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
