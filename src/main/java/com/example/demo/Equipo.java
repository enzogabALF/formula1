package com.example.demo;
import java.util.ArrayList;


public class Equipo implements isSponsoreable{
    public ArrayList<SponsorContrato> sponsor;
    public ArrayList<Piloto> pilotos;
    public ArrayList<Mecanico> mecanicos;
    public Ingeniero ingenieroPrincipal;

    public Equipo(ArrayList<SponsorContrato> sponsor, ArrayList<Piloto> pilotos, ArrayList<Mecanico> mecanicos, Ingeniero ingenieroPrincipal) {
        setSponsor(sponsor);
        setPilotos(pilotos);
        setMecanicos(mecanicos);
        setIngenieroPrincipal(ingenieroPrincipal);
    }
    public ArrayList<Piloto> getPilotos(){
        return pilotos;
    }
    public ArrayList<Mecanico> getMecanicos(){
        return mecanicos;
    }
    public Ingeniero getIngenieroPrincipal(){
        return ingenieroPrincipal;
    }









    public ArrayList<SponsorContrato> getSponsor() {
        return sponsor;
    }
    private void setSponsor(ArrayList<SponsorContrato> sponsor) {
        this.sponsor = sponsor;
    }
    private void setPilotos(ArrayList<Piloto> pilotos){
        this.pilotos = pilotos;
    }
    private void setMecanicos(ArrayList<Mecanico>mecanicos){
        this.mecanicos = mecanicos;
    }
    private void setIngenieroPrincipal(Ingeniero ingenieroPrincipal){
        this.ingenieroPrincipal = ingenieroPrincipal;
    }
    public void agregarMecanico(Mecanico mecanico){
        mecanicos.add(mecanico);
    }
    public void agregarPiloto(Piloto piloto){
        pilotos.add(piloto);
    }
    public void agregarSponsor(SponsorContrato sponsorContrato){
        sponsor.add(sponsorContrato);
    }
    public void agregarIngeniero(Ingeniero ingeniero){
        ingenieroPrincipal = ingeniero;
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
        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }
    

}
