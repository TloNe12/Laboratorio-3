/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activision;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jcgol
 */
public abtract class Tipo extends Soldados {

    private ArrayList<Armas> armas;
    private ArrayList<Tipo> tipo;

    public Tipo() {
    }

    public Tipo(ArrayList<Armas> armas, ArrayList<Tipo> tipo) {
        this.armas = armas;
        this.tipo = tipo;
    }

    public Tipo(ArrayList<Armas> armas, ArrayList<Tipo> tipo, String nombre, int edad, Date tiempo, String rango, double hp, ArrayList<Tipo> tip) {
        super(nombre, edad, tiempo, rango, hp, tip);
        this.armas = armas;
        this.tipo = tipo;
    }

    public ArrayList<Armas> getArmas() {
        return armas;
    }

    public void setArmas(ArrayList<Armas> armas) {
        this.armas = armas;
    }

    public ArrayList<Tipo> getTipo() {
        return tipo;
    }

    public void setTipo(ArrayList<Tipo> tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public void DanoExtra(){
        
    }
}
