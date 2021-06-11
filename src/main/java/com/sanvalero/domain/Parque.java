package com.sanvalero.domain;

public class Parque {
    private String nombre;
    private int parqueID;
    private double extension;

    public Parque(String nombre, String parqueID, double extension) {
        this.nombre = nombre;
        this.parqueID = parqueID;
        this.extension = extension;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getParqueID() {
        return parqueID;
    }

    public void setParqueID(int ParqueID) {
        this.parqueID = ParqueID;
    }

    public double getExtension() {
        return extension;
    }

    public void setExtension(double extension) {
        this.extension = extension;
    }
    
    
}
