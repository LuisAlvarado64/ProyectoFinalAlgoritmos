//<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyectofinal;

/**
 *
 * @author Andrea
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GrafoDirigidoAciclico grafo = new GrafoDirigidoAciclico(4);
        grafo.insertarVertice("1");
        grafo.insertarVertice("4");
        grafo.insertarVertice("2");
        grafo.insertarVertice("3");
//        grafo.insertarArista(0, 2);
//        grafo.insertarArista(0, 3);
        grafo.insertarArista(1, 3);
        grafo.insertarArista(1, 2);
        grafo.insertarArista(3, 2);
        grafo.insertarArista(3, 4);
        grafo.insertarArista(4, 1);

        System.out.println("Total de aristas: " + grafo.cuantasAristasHay());
//        System.out.println("Grado de entrada de vertice 0:"+ grafo.gradoDeEntrada(0));
//        System.out.println("Grado de entrada de vertice 1:"+ grafo.gradoDeEntrada(1));
//        System.out.println("Grado de entrada de vertice 2:"+ grafo.gradoDeEntrada(2));
//        System.out.println("Grado de entrada de vertice 3:"+ grafo.gradoDeEntrada(3));
//        System.out.println("Arista entre 0 y 1: "+ grafo.adyacente(0, 1));
        System.out.println(grafo.mostrarEstructura());
        System.out.println("Es adyacente 0 y 1: " + grafo.adyacente(4, 1));
        System.out.println("Ordenamiento topológico: " + grafo.topologicalSort());
//        System.out.println("Borrar aristas");
//        grafo.eliminarAristas();
//        System.out.println("Total de aristas: "+ grafo.cuantasAristasHay());
//        System.out.println(grafo.mostrarEstructura());
//        grafo.insertarArista(0, 2);
//        grafo.insertarArista(0, 3);
//        grafo.insertarArista(1, 3);
//        grafo.insertarArista(2, 1);
//        System.out.println("Total de aristas: "+ grafo.cuantasAristasHay());
//        System.out.println(grafo.mostrarEstructura());
//        System.out.println("Grado de salida de vertice 0:"+ grafo.gradoDeSalida(0));
//        System.out.println("Grado de salida de vertice 1:"+ grafo.gradoDeSalida(1));
//        System.out.println("Grado de salida de vertice 2:"+ grafo.gradoDeSalida(2));
//        System.out.println("Grado de salida de vertice 3:"+ grafo.gradoDeSalida(3));
//        
        //System.out.println(grafo.todosVertices[0].nombre);
    }

}
