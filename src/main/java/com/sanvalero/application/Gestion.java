package com.sanvalero.application;

import com.sanvalero.dao.Conexion;
import com.sanvalero.dao.ParqueDAO;
import com.sanvalero.domain.Parque;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Gestion {
    
    private boolean salirPrograma;
    private final ParqueDAO parqueDAO;
    private Scanner teclado;


    public Gestion() {
        Conexion conexion = new Conexion();
        conexion.getConexion();
        parqueDAO = new ParqueDAO();
        salirPrograma = false;
    }

    public void ejecutar() {
        do {
            System.out.println("------------------------");
            System.out.println("Elige una opción:");
            System.out.println("1. Listar los parques por nombre de ciudad");
            System.out.println("0. Salir del programa");
            System.out.println("------------------------");

            String opcion = teclado.nextLine();

            switch (opcion) {
                case "1":
                    nombrarParques_Ciudad();
                    break;
                case "0":
                    System.out.println("Saliendo del programa...");
                    salirPrograma = true;
                    break;
                default:
                    System.out.println("Error desconocido");
            }
        } while (!salirPrograma);
    }

    public void nombrarParques_Ciudad() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Selecciona la ciudad donde quieras listar los parques");
        String ciudad = teclado.nextLine();
        System.out.println("\nParques registrados en " + ciudad + ":");
        try {
            ArrayList<Parque> listadoParques = parqueDAO.nombrarParques_Ciudad(ciudad);
            for (Parque parque : listadoParques) {
                System.out.println(parque);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
