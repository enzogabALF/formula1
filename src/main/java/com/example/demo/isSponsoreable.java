package com.example.demo;

public interface isSponsoreable {
    public abstract void agregar(SponsorContrato sponsor);
    public abstract void remover(Sponsor sponsor);
    public abstract void remover(String sponsor);
    public abstract void remover(Sponsor sponsor, String ubicacion);
}
