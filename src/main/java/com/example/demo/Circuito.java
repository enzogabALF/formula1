package com.example.demo;

import java.util.ArrayList;

public class Circuito implements isSponsoreable{
    String nombre;
    String pais;
    int longitud;
    int numeroVueltas;
    ArrayList<SponsorContrato> Sponsor;
    public Circuito(String nombre, String pais, int longitud, int numeroVueltas, ArrayList<SponsorContrato> Sponsor) {
        setNombre(nombre);
        setPais(pais);
        setLongitud(longitud);
        setNumeroVueltas(numeroVueltas);
        setSponsor(Sponsor);
    }
    public ArrayList<SponsorContrato> getSponsor() {
        return Sponsor;
    }
    
    public void setSponsor(ArrayList<SponsorContrato> sponsor) {
        Sponsor = sponsor;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public int getLongitud() {
        return longitud;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    public int getNumeroVueltas() {
        return numeroVueltas;
    }
    public void setNumeroVueltas(int numeroVueltas) {
        this.numeroVueltas = numeroVueltas;
    }
    @Override
    public void agregar(SponsorContrato sponsor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregar'");
    }
    @Override
    public void remover(com.example.demo.Sponsor sponsor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }
    @Override
    public void remover(String sponsor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }
    @Override
    public void remover(com.example.demo.Sponsor sponsor, String ubicacion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }
}
