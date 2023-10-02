/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Juan
 */
public class Brigada {
    private int codBrigada;
    private String nombre;
    private String especialidad;
    private boolean libre;
    private int nroCuartel;
    private boolean estado;

    public Brigada() {
    }

    public Brigada(int codBrigada, String nombre, String especialidad, boolean libre, int nroCuartel, boolean estado) {
        this.codBrigada = codBrigada;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.libre = libre;
        this.nroCuartel = nroCuartel;
        this.estado = estado;
    }

    public Brigada(String nombre, String especialidad, boolean libre, int nroCuartel, boolean estado) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.libre = libre;
        this.nroCuartel = nroCuartel;
        this.estado = estado;
    }



    public int getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(int codBrigada) {
        this.codBrigada = codBrigada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public int getNroCuartel() {
        return nroCuartel;
    }

    public void setNroCuartel(int nroCuartel) {
        this.nroCuartel = nroCuartel;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Brigada{" + "nombre=" + nombre + ", especialidad=" + especialidad + ", libre=" + libre + ", nroCuartel=" + nroCuartel + ", estado=" + estado + '}';
    }
    
}
