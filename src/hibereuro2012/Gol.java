/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibereuro2012;

import java.io.Serializable;

/**
 *
 * @author meschoyez
 */
public class Gol implements Serializable {
    private Integer juego;
    private String equipo;
    private String jugador;
    private Integer minuto;
        

//    public Gol(Integer juego, String equipo, String jugador, Integer minuto) {
//        this.juego = juego;
//        this.equipo = equipo;
//        this.jugador = jugador;
//        this.minuto = minuto;
//    }

    /**
     * @return the juego
     */
    public Integer getJuego() {
        return juego;
    }

    /**
     * @param juego the juego to set
     */
    public void setJuego(Integer juego) {
        this.juego = juego;
    }

    /**
     * @return the equipo
     */
    public String getEquipo() {
        return equipo;
    }

    /**
     * @param equipo the equipo to set
     */
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    /**
     * @return the jugador
     */
    public String getJugador() {
        return jugador;
    }

    /**
     * @param jugador the jugador to set
     */
    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    /**
     * @return the minuto
     */
    public Integer getMinuto() {
        return minuto;
    }

    /**
     * @param minuto the minuto to set
     */
    public void setMinuto(Integer minuto) {
        this.minuto = minuto;
    }

    @Override
    public String toString() {
        return "Gol{" + "juego=" + juego + ", equipo=" + equipo + ", jugador=" + jugador + ", minuto=" + minuto + '}';
    }
    
    

}
