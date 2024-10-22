package com.example.demo;

import java.util.ArrayList;

public class Carrera{
    String fecha;
    Circuito circuito; 
    ArrayList<Piloto> participantes;   
    public Carrera(String fecha, Circuito circuito, ArrayList<Piloto> participantes) {
        setFecha(fecha);
        setCircuito(circuito);
        setParticipantes(participantes);
    }
    public ArrayList<Piloto> getParticipantes() {
        return participantes;
    }
    public void setParticipantes(ArrayList<Piloto> participantes) {
        this.participantes = participantes;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public Circuito getCircuito() {
        return circuito;
    }
    public void setCircuito(Circuito circuito) {
        this.circuito = circuito;
    }
}
