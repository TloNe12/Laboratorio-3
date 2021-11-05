/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activision;
import java.util.ArrayList;
/**
 *
 * @author jcgol
 */
public class Escuadron {
    private String nombre;
    private ArrayList<Zonas> zonas = new ArrayList();
    private ArrayList<Soldados> soldados = new ArrayList();
    
    
    
    
    
    
    
    public void listarSoldado(){
        int pos=0;
        for (Soldados sl : soldados) {
            System.out.println(pos+"\t" + sl);
            pos++;
        }
    }
    
    public void listarZona(){
        int pos=0;
        for (Zonas zona : zonas) {
            System.out.println(pos+"\t" + zona);
            pos++;
        }
        
        
        
    }
    
}
