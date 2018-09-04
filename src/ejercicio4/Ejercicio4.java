/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ricky
 */
public class Ejercicio4 {
    static int ingreso;
    static String pilaTotal = "";
    static String colaTotal = "";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ingreso = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño de la pila:"));
        if(ingreso>0){
            Resultado();
        }
    }
    
    public static void Resultado(){
        pilaList pila = new pilaList();
        colaList cola = new colaList();
        float numPila;
        for(int i=0; i<ingreso; i++){
            numPila = Float.parseFloat(JOptionPane.showInputDialog(null, "Número "+(i+1)));
            pila.agregarPila(numPila);
            cola.agregarCola(numPila);
        }
        System.out.println("PILA: ");
        for(int a=0; a<ingreso; a++){ //LOS DOS FOR DE POR GUSTO, SE PUDO HABER DEJADO EN UNO MISMO
            float quitarPila = pila.quitarPila(); //Se separó las pilas de la cola para que en la consola se pudieran imprimir en orden
            imprimir(""+quitarPila);
            pilaTotal = pilaTotal + " | " +quitarPila;
        }
        System.out.println("La COLA es:");
        for(int a=0; a<ingreso; a++){
            float quitarCola = cola.quitarCola();
            imprimir(""+quitarCola);
            colaTotal = colaTotal + " | " + quitarCola;
        }

        JOptionPane.showMessageDialog(null, "                       <---- Primero en salir\n"+"PILA ingresada: " + pilaTotal+"\n"+
                "COLA: " + colaTotal);
    }

    public static void imprimir(String mensaje){
        System.out.println(mensaje);
        
    }
}
 