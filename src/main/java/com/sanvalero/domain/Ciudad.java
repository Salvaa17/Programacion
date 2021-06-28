package com.sanvalero.domain;

public class Ciudad {
    private int ciudadID;
    private String nombreCiudad;
    private String ccaa;

    public Ciudad(){
        
    }
    public Ciudad(int ciudadID, String nombreCiudad, String ccaa) {
        this.ciudadID = ciudadID;
        this.nombreCiudad = nombreCiudad;
        this.ccaa = ccaa;
    }

    public int getCiudadID() {
        return ciudadID;
    }

    public void setCiudadID(int ciudadID) {
        this.ciudadID = ciudadID;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getCcaa() {
        return ccaa;
    }

    public void setCcaa(String ccaa) {
        this.ccaa = ccaa;
    }
    
}
