/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author ricky
 */
public class Cola {
    float numero;
    Cola siguiente;
    
    Cola (float i){ //Constructor de la clase
        numero = i;
        siguiente = null;
    }
}

class colaList{
    protected Cola primero;
    protected Cola ultimo;
    
    public colaList(){ //Constructor, inicializando las variables en nulo
        primero = null;
        ultimo = null;
    }
    
    public boolean colaVacia(){
        if(primero==null)return true;
        else return false;
    }
    
    public void agregarCola(float numero){
        Cola cola;
        cola = new Cola(numero);
        if(colaVacia()){ //
            primero = cola;
        }else{
            ultimo.siguiente = cola;
        }
        ultimo = cola;
    }
    
    public float quitarCola(){
        float auxiliar;
        if(!colaVacia()){
            auxiliar = primero.numero;
            primero = primero.siguiente;
        }else return -1;
        return auxiliar;
    }
    
    public void borrarCola(){
        while(primero!=null){
            primero = primero.siguiente;
        }
    }
}
