package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Time;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ContratoTest {

  @Test
  void CrearContrato(){
    String nombre;
    nombre = "Juan";
    Time fecha;
    String lugar;
    getContrato(agregarContrato(setNombre(nombre), setFechaInicio(fecha), setLugar(lugar)));

    assertEquals(nombre, CrearContrato().getNombre());
    assertEquals(fecha, CrearContrato().getFechaInicio());
    assertEquals(lugar, CrearContrato().GetLugar());
    }

    @Test
    

}
