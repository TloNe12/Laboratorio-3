/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activision;

import java.util.ArrayList;
import java.util.Date;

// Escuadrones tienen Soldados tienen Armas y Tipos
//Los soldados tienen que tener una arma y un rol
//Todos logran hacer un dano especifico tambien tener un bonus por tipo

public abstract class Soldados {

    private String nombre;
    private int edad;
    private Date tiempo;
    private String rango;
    private double hp;
    private ArrayList<Tipo> tipo;

    public Soldados() {
    }

    public Soldados(String nombre, int edad, Date tiempo, String rango, double hp, ArrayList<Tipo> tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.tiempo = tiempo;
        this.rango = rango;
        if (hp >= 100 || hp <= 400) {
            this.hp = hp;
        }
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getTiempo() {
        return tiempo;
    }

    public void setTiempo(Date tiempo) {
        this.tiempo = tiempo;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public double getHp() {

        return hp;
    }

    public void setHp(double hp) {
        if (hp >= 100 || hp <= 400) {
            this.hp = hp;
        }
    }

    @Override
    public String toString() {
        return "Soldados{" + "nombre=" + nombre + ", edad=" + edad + ", tiempo=" + tiempo + ", rango=" + rango + ", hp=" + hp + '}';
    }

    public void DanoExtra(){}
    
}
