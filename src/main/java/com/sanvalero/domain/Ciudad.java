package com.sanvalero.domain;

public class Ciudad {
    private String Ciudad_ID;
    private String Nombre_ciudad;
    private String CCAA;

    public Ciudad() {
    }

    public String getCiudad_ID() {
        return Ciudad_ID;
    }

    public void setCiudad_ID(String Ciudad_ID) {
        this.Ciudad_ID = Ciudad_ID;
    }

    public String getNombre_ciudad() {
        return Nombre_ciudad;
    }

    public void setNombre_ciudad(String Nombre_ciudad) {
        this.Nombre_ciudad = Nombre_ciudad;
    }

    public String getCCAA() {
        return CCAA;
    }

    public void setCCAA(String CCAA) {
        this.CCAA = CCAA;
    }
    
}
