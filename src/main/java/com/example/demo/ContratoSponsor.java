package com.example.demo;


public class ContratoSponsor {
    Sponsor sponsor;
    String fechaInicio;
    String fechaFinalizacion;
    String Ubicacion;
    
    public ContratoSponsor(Sponsor sponsor, String fechaInicio, String fechaFinalizacion, String ubicacion) {
        setSponsor(sponsor);
        setFechaInicio(fechaInicio);
        setFechaFinalizacion(fechaFinalizacion);
        setUbicacion(ubicacion);
    }
    public Sponsor getSponsor() {
        return sponsor;
    }
    public void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }
    public String getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }
    public void setFechaFinalizacion(String fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }
    public String getUbicacion() {
        return Ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }

}
