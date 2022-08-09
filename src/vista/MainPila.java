/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.Productos;
import modelo.OperacionesPila;
import modelo.Pila;

/**
 *
 * @author juan_est.fernandez
 */
public class MainPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pila<Productos> pilaP= new Pila<>();       
        pilaP.apilar(new Productos("arroz", 2, 5000));
        pilaP.apilar(new Productos("panela", 4, 12000));
        pilaP.apilar(new Productos("panalhuevos", 1, 12000));
        pilaP.apilar(new Productos("frijoles", 3, 15000));
        System.out.println("Pila Original \n"+pilaP.toString());
        
//        pilaP.desapilar();
//        System.out.println("Pila \n"+pilaP.toString());
        
        Pila<Productos> pd= OperacionesPila.pilaDuplicada(pilaP);
            System.out.println("Pila Duplicada \n"+pd.toString());
    }           
}
