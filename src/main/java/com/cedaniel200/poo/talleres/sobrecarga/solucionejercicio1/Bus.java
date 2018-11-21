package com.cedaniel200.poo.talleres.sobrecarga.solucionejercicio1;

public class Bus {
    private String chofer;
    private String ayudante;
    private int cupoMaximoPasajeros;

    public Bus() {
        this.chofer = "anonimo";
        this.ayudante = "anonimo";
        this.cupoMaximoPasajeros = 24;
    }

    public Bus(String chofer, String ayudante, int cupoMaximoPasajeros) {
        this.chofer = chofer;
        this.ayudante = ayudante;
        this.cupoMaximoPasajeros = cupoMaximoPasajeros;
    }

    public String getChofer() {
        return chofer;
    }

    public void setChofer(String chofer) {
        this.chofer = chofer;
    }

    public String getAyudante() {
        return ayudante;
    }

    public void setAyudante(String ayudante) {
        this.ayudante = ayudante;
    }

    public int getCupoMaximoPasajeros() {
        return cupoMaximoPasajeros;
    }

    public void setCupoMaximoPasajeros(int cupoMaximoPasajeros) {
        this.cupoMaximoPasajeros = cupoMaximoPasajeros;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "chofer='" + chofer + '\'' +
                ", ayudante='" + ayudante + '\'' +
                ", cupoMaximoPasajeros=" + cupoMaximoPasajeros +
                '}';
    }
}