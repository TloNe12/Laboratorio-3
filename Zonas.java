/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activision;

/**
 *
 * @author jcgol
 */
public class Zonas {

    private String nombre;
    private int tamanio;
    private int coordenadaX;
    private int coordenadaY;

    public Zonas() {
    }

    public Zonas(String nombre, int tamanio, int coordenadaX, int coordenadaY) {
        this.nombre = nombre;
        if (100 <= tamanio || tamanio <= 400) {
            this.tamanio = tamanio;
        }
        if (0 <= coordenadaX || coordenadaX <= 100) {
            this.coordenadaX = coordenadaX;
        }
        if (0 <= coordenadaY || coordenadaY <= 100) {
            this.coordenadaY = coordenadaY;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        if (100 <= tamanio || tamanio <= 400) {
            this.tamanio = tamanio;
        }
        
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        if (0 <= coordenadaX || coordenadaX <= 100) {
            this.coordenadaX = coordenadaX;
        }
        
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
       if (0 <= coordenadaY || coordenadaY <= 100) {
            this.coordenadaY = coordenadaY;
        }
    }

}
