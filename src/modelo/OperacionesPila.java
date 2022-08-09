/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author juan_est.fernandez
 */
public class OperacionesPila {
    
    public <T extends Base> Pila<T> pilaDuplicada(Pila<T> pilaOriginal){
        
        Pila<T> piladuplicada=new Pila<>();
        Pila<T> pilaauxiliar=new Pila<>();
        
        while (!pilaOriginal.estaVacia()){
            T elemento= pilaOriginal.desapilar();
            pilaauxiliar.apilar(elemento);
        }
      
        while (!pilaauxiliar.estaVacia()){
            T elemento = pilaauxiliar.desapilar();
            T copiaelemento = (T) elemento.copy();
            pilaOriginal.apilar(elemento);
            piladuplicada.apilar(copiaelemento);
        }
        return piladuplicada;
    }
    
}
