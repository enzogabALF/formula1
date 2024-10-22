package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
//import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Alfonso Enzo Gabriel
 */
@SpringBootTest
public class personaTest {
    @Test
    public void personasTest(){
        Persona persona;
        String nombre= "juan";
        String nacionalidad= "argentino";
        persona= new Persona(nombre, nacionalidad);
        assertEquals(nombre, persona.getNombre());
        assertEquals(nacionalidad, persona.getNacionalidad());
        
    }
    @Test
    public void pilotoTest(){
        Piloto piloto;
        String nombre= "juan";
        String nacionalidad= "argentino";
        int numero= 10;
        
        piloto= new Piloto(numero, nombre, nacionalidad, null);
        assertEquals(nombre, piloto.getNombre());
        assertEquals(nacionalidad, piloto.getNacionalidad());
        assertEquals(numero, piloto.getNumero());
    }
    @Test
    public void MecanicoTest(){
        String nombre = "matias";
        String nacionalidad = "español";
        Mecanico mecanico= new Mecanico(nombre, nacionalidad);
        assertEquals(nombre, mecanico.getNombre());
        assertEquals(nacionalidad, mecanico.getNacionalidad());
    }
    @Test
    public void ingenieroTest(){
        Ingeniero ingeniero;
        String nombre= "juan";
        String nacionalidad= "argentino";
        ingeniero= new Ingeniero(nombre, nacionalidad);
        assertEquals(nombre, ingeniero.getNombre());
        assertEquals(nacionalidad, ingeniero.getNacionalidad());
    }
}