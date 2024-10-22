package com.example.demo;

public class TestVerificacionDeVueltas {
    void registrar_vuelta_del_piloto_en_circuito() {
        Piloto piloto = new Piloto(0, "Franco Colapinto", "Argentina", null);
        Circuito circuito = new Circuito("Austin", null, 1234, 56, null); // nombre, longitud, cantidad de vueltas
        Equipo equipo = new Equipo("Williams",);
        Vuelta vuelta1 = new Vuelta(piloto, equipo, circuito, 90.5); // 90.5 segundos en la vuelta
        Vuelta vuelta2 = new Vuelta(piloto, equipo, circuito, 88.1); // 90.5 segundos en la vuelta
        Vuelta vuelta3 = new Vuelta(piloto, equipo, circuito, 91.3); // 90.5 segundos en la vuelta
        // Verificar que la vuelta se haya registrado correctamente
        }
}
