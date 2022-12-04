/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyectofinal;

/**
 *
 * @author Andre
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      GrafoDirigidoAciclico grafo = new GrafoDirigidoAciclico(4);
      grafo.insertarVertice("0");
      grafo.insertarVertice("1");
      grafo.insertarVertice("2");
      grafo.insertarVertice("3");
      grafo.insertarArista(0, 2);
      grafo.insertarArista(0, 3);
      grafo.insertarArista(1, 3);
      grafo.insertarArista(2, 1);
        
        System.out.println("Total de aristas: "+ grafo.cuantasAristasHay());
        System.out.println("Grado de entrada de vertice 0:"+ grafo.gradoDeEntrada(0));
        System.out.println("Grado de entrada de vertice 1:"+ grafo.gradoDeEntrada(1));
        System.out.println("Grado de entrada de vertice 2:"+ grafo.gradoDeEntrada(2));
        System.out.println("Grado de entrada de vertice 3:"+ grafo.gradoDeEntrada(3));
        
    }
    
}
