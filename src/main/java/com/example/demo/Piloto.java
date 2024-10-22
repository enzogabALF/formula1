package com.example.demo;

import java.util.ArrayList;

public class Piloto extends Persona implements isSponsoreable{
    int numero;
    ArrayList<SponsorContrato> sponsors;
    
    public Piloto(int numero, String nombre, String nacinalidad, ArrayList<SponsorContrato> sponsors){
        
        super(nombre, nacinalidad);
        setNumero(numero);
        setSponsors(sponsors);
    }

    public ArrayList<SponsorContrato> getSponsors() {
        return sponsors;
    }

    private void setSponsors(ArrayList<SponsorContrato> sponsors) {
        this.sponsors = sponsors;
    }

    public int getNumero() {
        return numero;
    }

    private void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void agregar(SponsorContrato sponsor) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'agregar'");
    }

    @Override
    public void remover(Sponsor sponsor) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }

    @Override
    public void remover(String sponsor) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }

    @Override
    public void remover(Sponsor sponsor, String ubicacion) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationExcption("Unimplemented method 'remover'");
    }
        
}

