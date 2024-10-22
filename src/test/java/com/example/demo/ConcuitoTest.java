package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
//import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Alfonso Enzo Gabriel
 */
@SpringBootTest
public class ConcuitoTest {
    @Test
    public void Circuito(){
        Circuito circuito;
        String nombre= "nombre";
        String pais= "pais";
        //Sponsor spon;
        //spon= new Sponsor("fravega");
        //ArrayList<SponsorContrato> sponsor;
        //sponsor.add(spon);
        circuito= new Circuito(nombre, pais,0,0 ,null);
        assertEquals(nombre, circuito.getNombre());
        assertEquals(pais, circuito.getPais());
    }

}
