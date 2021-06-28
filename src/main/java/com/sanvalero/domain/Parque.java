package com.sanvalero.domain;

public class Parque {
    private String nombre;
    private int ParqueID;
    private double extension;

    public Parque(String nombre, int ParqueID, double extension) {
        this.nombre = nombre;
        this.ParqueID = ParqueID;
        this.extension = extension;
    }

    public Parque() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getParqueID() {
        return ParqueID;
    }

    public void setParqueID(int ParqueID) {
        this.ParqueID = ParqueID;
    }

    public double getExtension() {
        return extension;
    }

    public void setExtension(double extension) {
        this.extension = extension;
    }
    
    
}
