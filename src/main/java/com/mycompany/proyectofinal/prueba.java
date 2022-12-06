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
        GrafoDirigidoAciclico grafo = new GrafoDirigidoAciclico(5);
        grafo.insertarVertice("1"); //Inserta vertice
        grafo.insertarVertice("2"); //Inserta vertice
        grafo.insertarVertice("3"); //Inserta vertice
        grafo.insertarVertice("4"); //Inserta vertice
        grafo.insertarVertice("5"); //Inserta vertice

        grafo.insertarArista(1, 2); //Inserta arista
        grafo.insertarArista(1, 4); //Inserta arista
        grafo.insertarArista(2, 1); //Inserta arista
        grafo.insertarArista(3, 1); //Inserta arista
        grafo.insertarArista(4, 3); //Inserta arista
        grafo.insertarArista(5, 1); //Inserta arista
        grafo.insertarArista(5, 4); //Inserta arista
        grafo.insertarArista(5, 3); //Inserta arista

        System.out.println("Total de aristas: " + grafo.cuantasAristasHay()); //Muestra el total de aristas

        System.out.println("Estructura Lista Adyacente\n" + grafo.mostrarEstructura()); //Muestra estructura de lista adyacente
        System.out.println("Ciclos: " + grafo.tieneCiclos()); // Muestra si tiene ciclos

        System.out.println("Topological");
        grafo.topologicalSort(); //Muestra el topological sort

    }

}
