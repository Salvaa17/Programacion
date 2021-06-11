package com.sanvalero.dao;

import com.sanvalero.domain.Parque;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ParqueDAO implements IDAO <Parque> {
    
    private Connection conexion;
    private Parque parque;

    public ParqueDAO() {
        this.conexion = conexion;
    }
    
    @Override
    public List<Parque> getAll() {
        List <Parque> parques = new ArrayList();
        String consulta = "SELECT * FROM PARQUE";
        
        try{
            Statement statement = conexion.createStatement();
            ResultSet result = statement.executeQuery(consulta);
            
            while(result.next()){
                parque = new Parque(result.getString(1),result.getString(2),result.getInt(3));
                parques.add(parque);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return parques;
    }

    @Override
    public Parque getById(int id) {
        String consulta = "";
        
        try{
            Statement statement = conexion.createStatement();
            ResultSet result = statement.executeQuery(consulta);
            result.getInt(parque.getParqueID());            
            
        }catch(Exception e){
            System.out.println(e);
        }
        return parque;
    }

    @Override
    public void create(Parque t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        
    
//      public ArrayList<Parque> nombrarParques_Ciudad(String Ciudad) throws SQLException{
//          consulta = "";
//          ArrayList<Parque> listaParques = new ArrayList<>();
//          PreparedStatement sentencia = conexion.getConexion().prepareStatement(consulta);
//          sentencia.setString(1, Ciudad);
//          ResultSet lista = sentencia.executeQuery();
//           while(lista.next()){
//               Parque parque = new Parque();
//               parque.setNombre(lista.getString(1));
//               listaParques.add(parque);
//           }
//          return listaParques;
//      }
//      public ArrayList<Parque> nombrarParques_CCAA(String CCAA) throws SQLException{
//          consulta = "";
//          ArrayList <Parque> listaParques = new ArrayList<>();
//          PreparedStatement sentencia = conexion.getConexion().prepareStatement(CCAA);
//          sentencia.setString(1, CCAA);
//          ResultSet lista = sentencia.executeQuery();
//          while(lista.next()){
//              Parque parque = new Parque();
//              parque.setNombre(lista.getString(1));
//              listaParques.add(parque);
//          }
//          return listaParques;
//      }
//      public void actualizarInfo(Parque updateParque) throws SQLException{
//          consulta = "";
//          PreparedStatement sentencia = conexion.getConexion().prepareStatement(consulta);
//          sentencia.setString(1, updateParque.getNombre());
//          sentencia.setString(2, updateParque.getParqueID());
//          sentencia.setDouble(3, updateParque.getExtension());
//          sentencia.executeUpdate();
//          
//      }
//      public void añadirParque (Parque registro) throws SQLException{
//          consulta = "";
//          PreparedStatement sentencia = conexion.getConexion().prepareStatement(consulta);
//          
//          sentencia.setString(1, registro.getParqueID());
//          sentencia.setString(2, registro.getNombre());
//          sentencia.setDouble(3, registro.getExtension());
//          sentencia.executeUpdate();
//          
//      }
