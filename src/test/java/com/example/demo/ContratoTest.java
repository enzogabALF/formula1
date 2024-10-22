package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


//import java.sql.Time;

//import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ContratoTest {
  @Test
  public void sponsorTest(){
    Sponsor sponsor;
    String nombre= "juan";
    sponsor= new Sponsor(nombre);
    assertEquals(nombre, sponsor.getNombre());
  }
  @Test
  public void contraroSponsorTest(){
    SponsorContrato sponsorContrato;
    Sponsor spon;
    String fechaInicio= "10/11/2023";
    String fechaFinalizacion= "";
    String ubicacion= "casco lado Izquierdo";
    String nombre= "gatorade";
    spon= new Sponsor(nombre);
    
    sponsorContrato= new SponsorContrato(spon, fechaInicio, fechaFinalizacion, ubicacion);
    assertEquals(nombre, sponsorContrato.getSponsor().getNombre());
    assertEquals(ubicacion, sponsorContrato.getUbicacion());
    assertEquals(fechaInicio, sponsorContrato.getFechaInicio());
    assertEquals(fechaFinalizacion, sponsorContrato.getFechaFinalizacion());
  }

}
