/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author Danny
 */
public class Pila {
    float numero;
    Pila siguiente;
    
    Pila (float i){ //Constructor de la clase
        numero = i;
        siguiente = null;
    }
}

class pilaList{
    private Pila primeroEntrar;

    public pilaList() { //Constructor
        primeroEntrar = null;
    }
    
    public boolean pilaVacia(){ //Método que comprueba si la pila está vacía, si lo está devuelve true, sino, false
        if(primeroEntrar==null) return true;
        else return false;
    }
    
    public void agregarPila(float numero){ //Método que agrega una nueva pila, recibe como parametro un float
        Pila nuevo;                 
        nuevo = new Pila(numero); 
        nuevo.siguiente = primeroEntrar; //
        primeroEntrar = nuevo;
    }
    
    public float quitarPila(){
        if(pilaVacia()){ //Verifica si la pila está vacía, llamando al método de pilaVacia
            return -1; //Si está vacía devolverá -1
        }
        float auxiliar = primeroEntrar.numero;
        primeroEntrar = primeroEntrar.siguiente;
        return auxiliar;
    }
    
    public void limpiarPila(){
        Pila pila;
        while (!pilaVacia()){ //Mientras no sea null
            pila = primeroEntrar;
            primeroEntrar = primeroEntrar.siguiente;
            pila.siguiente = null;
        }
        
    }
    
}
