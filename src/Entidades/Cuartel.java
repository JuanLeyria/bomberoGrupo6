/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Hernan
 */
public class Cuartel {
    private int codigo;
    private String nombre;
    private String direccion;
    private int coordX;
    private int coordY;
    private String telefono;
    private String correo;
    private boolean estado;

    public Cuartel() {
    }

    public Cuartel(int codigo, String nombre, String direccion, int coordX, int coordY, String telefono, String correo, boolean estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.coordX = coordX;
        this.coordY = coordY;
        this.telefono = telefono;
        this.correo = correo;
        this.estado = estado;
    }
    
    
    public Cuartel(String nombre, String direccion, int coordX, int coordY, String telefono, String correo, boolean estado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.coordX = coordX;
        this.coordY = coordY;
        this.telefono = telefono;
        this.correo = correo;
        this.estado = estado;
    }

    public int getCodCuartel() {
        return codigo;
    }

    public void setCodCuartel(int codCuartel) {
        this.codigo = codCuartel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cuartel{" + "codCuartel=" + codigo + ", nombre=" + nombre + ", direccion=" + direccion + ", coordX=" + coordX + ", coordY=" + coordY + ", telefono=" + telefono + ", correo=" + correo + ", estado=" + estado + '}';
    }
    
    
    
}
