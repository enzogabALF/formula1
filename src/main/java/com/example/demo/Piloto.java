package com.example.demo;

public class Piloto extends Persona implements isSponsoreable{
    int numero;
        public Piloto(int numero, String nombre, String nacinalidad){
        
        super(nombre, nacinalidad);
        setNumero(numero);
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
        throw new UnsupportedOperationException("Unimplemented method 'agregar'");
    }

    @Override
    public void remover(Sponsor sponsor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }

    @Override
    public void remover(String sponsor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }

    @Override
    public void remover(Sponsor sponsor, String ubicacion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationExcption("Unimplemented method 'remover'");
    }
        
}

