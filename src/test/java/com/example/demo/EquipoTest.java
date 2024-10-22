package com.example.demo;
import static org.junit.jupiter.api.Assertions.*;
//import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Alfonso Enzo Gabriel
 */
@SpringBootTest
public class EquipoTest {
    @Test
    public void crearEquipoVacio(){
        Equipo equipo;
        equipo= new Equipo(null, null, null, null);
        assertEquals(null, equipo.getSponsor());
        assertEquals(null, equipo.getPilotos());
        assertEquals(null, equipo.getMecanicos());
        assertEquals(null, equipo.getIngenieroPrincipal());
    }
}
