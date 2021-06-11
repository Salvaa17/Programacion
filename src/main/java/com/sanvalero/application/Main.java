/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanvalero.application;

import com.sanvalero.dao.CiudadDAO;
import com.sanvalero.dao.Conexion;
import com.sanvalero.dao.ParqueDAO;
import com.sanvalero.domain.Ciudad;
import java.util.Scanner;

/**
 *
 * @author ssb28
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        CiudadDAO cd = new CiudadDAO();
        ParqueDAO pd = new ParqueDAO();
        System.out.println("Introduce el ID del parque que quieres buscar");
        int id = teclado.nextInt();
        pd.getById(id);
        System.out.println(id);
        
    }
    
}
