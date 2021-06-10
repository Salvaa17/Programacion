/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanvalero.application;

import com.sanvalero.dao.Conexion;

/**
 *
 * @author ssb28
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gestion gestion = new Gestion();
        gestion.ejecutar();
    }
    
}
