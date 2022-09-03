package com.sofka.domain;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.domain.entities.Jugador;
import com.sofka.domain.values.Ronda;
import com.sofka.domain.entities.Tablero;
import com.sofka.domain.values.JuegoId;
import com.sofka.domain.values.JugadorId;

import java.util.Map;

public class Juego extends AggregateEvent<JuegoId> {

    protected Tablero tablero;
    protected Map<JugadorId, Jugador> jugadores;
    protected Ronda ronda;
    protected Jugador ganador;

    public Juego(JuegoId juegoId) {
        super(juegoId);
    }

    public Ronda ronda() {
        return this.ronda;
    }

    public Jugador ganador() {
        return this.ganador;
    }

    public Tablero tablero() {
        return this.tablero;
    }








}
