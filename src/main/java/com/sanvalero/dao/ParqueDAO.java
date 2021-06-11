package com.sanvalero.dao;

import com.sanvalero.domain.Parque;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ParqueDAO{
    
    public static Conexion conexion;
    private String consulta;

    public ParqueDAO() {
        
    }
    
      public ArrayList<Parque> nombrarParques_Ciudad(String Ciudad) throws SQLException{
          consulta = "";
          ArrayList<Parque> listaParques = new ArrayList<>();
          PreparedStatement sentencia = conexion.getConexion().prepareStatement(consulta);
          sentencia.setString(1, Ciudad);
          ResultSet lista = sentencia.executeQuery();
           while(lista.next()){
               Parque parque = new Parque();
               parque.setNombre(lista.getString(1));
               listaParques.add(parque);
           }
          return listaParques;
      }
      public ArrayList<Parque> nombrarParques_CCAA(String CCAA) throws SQLException{
          consulta = "";
          ArrayList <Parque> listaParques = new ArrayList<>();
          PreparedStatement sentencia = conexion.getConexion().prepareStatement(CCAA);
          sentencia.setString(1, CCAA);
          ResultSet lista = sentencia.executeQuery();
          while(lista.next()){
              Parque parque = new Parque();
              parque.setNombre(lista.getString(1));
              listaParques.add(parque);
          }
          return listaParques;
      }
      public void actualizarInfo(Parque updateParque) throws SQLException{
          consulta = "";
          PreparedStatement sentencia = conexion.getConexion().prepareStatement(consulta);
          sentencia.setString(1, updateParque.getNombre());
          sentencia.setString(2, updateParque.getParqueID());
          sentencia.setDouble(3, updateParque.getExtension());
          sentencia.executeUpdate();
          
      }
      public void añadirParque (Parque registro) throws SQLException{
          consulta = "";
          PreparedStatement sentencia = conexion.getConexion().prepareStatement(consulta);
          
          sentencia.setString(1, registro.getParqueID());
          sentencia.setString(2, registro.getNombre());
          sentencia.setDouble(3, registro.getExtension());
          sentencia.executeUpdate();
          
      }
}
