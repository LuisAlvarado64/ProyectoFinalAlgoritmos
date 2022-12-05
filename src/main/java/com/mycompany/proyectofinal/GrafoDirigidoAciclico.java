package com.mycompany.proyectofinal;


import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Luis Alvarado aaaaaaaaa
 */
public class GrafoDirigidoAciclico {

    int cantidadVertices;
    Vertice[] todosVertices;
    int aristas = 0;
    Arista aristasTodas[];
    int vActual = 0;
    private LinkedList<Integer> listaAdyacencia[];

    public GrafoDirigidoAciclico(int n) {
        this.cantidadVertices = n;
        todosVertices = new Vertice[n];
        aristasTodas = new Arista[n * n*n];
        listaAdyacencia = new LinkedList[n];
        for (int i = 0; i < n; ++i) {
            listaAdyacencia[i] = new LinkedList();
        }
    }

    //TERMINADO ANDREA
    public int gradoDeEntrada(int indiceVertice) {
        int gradoEntrada = 0;
        if (indiceVertice > cantidadVertices - 1 || indiceVertice < 0) {
            throw new IllegalArgumentException("i está fuera de rango");
        } else {
            for (Arista aristasToda : aristasTodas) {
                if (aristasToda != null && aristasToda.destino.compareTo("" + indiceVertice) == 0) { //compara el vertice con los destinos de todas las aristas para saber si tiene grados de entrada
                    gradoEntrada++;

                }
            }
        }

        return gradoEntrada;
    }

    //TERMINADO ANDREA
    public int gradoDeSalida(int i) {
        int gradoSalida = 0;
        if (i > cantidadVertices - 1 || i < 0) {
            throw new IllegalArgumentException("i está fuera de rango");
        } else {
            for (Arista aristasToda : aristasTodas) {
                if (aristasToda != null && aristasToda.origen.compareTo("" + i) == 0) {//compara el vertice con los origenes de todas las aristas para saber si tiene grados de salida
                    gradoSalida++;
                }
            }
        }
        return gradoSalida;
    }

    //TERMINADO ANDREA
    public int cuantasAristasHay() {
        int nAristas = 0;
        if (aristasTodas == null) {
            nAristas = 0;
        } else {
            for (Arista aristasToda : aristasTodas) {
                if (aristasToda != null) {
                    nAristas++;
                }
            }
        }
        return nAristas;
    }

    //TERMINADO ANDREA
    public boolean adyacente(int i, int j) {
        boolean si = false;
        int v1= encontrarVertice(""+i);
        int v2= encontrarVertice(""+j);
        if(v1==-1 || v2==-1){
        //if ((i > vertices - 1 || i < 0) || (j > vertices - 1 || j < 0)) {
            throw new IllegalArgumentException("i o j están fuera de rango");
        } else {
            for (Arista aristasToda : aristasTodas) {
                if (aristasToda != null && aristasToda.origen.compareTo("" + i) == 0 && aristasToda.destino.compareTo("" + j) == 0) {
                    si = true;
                }
            }
        }
        return si;
    }
    //TERMINADO MAGUI 
    public boolean conectados(int i, int j) {
        boolean conect = false;
        int v1= encontrarVertice(""+i);
        int v2= encontrarVertice(""+j);
       // if ((j > vertices - 1 || j < 0)) {
       if(v1==-1 || v2==-1){
            throw new IllegalArgumentException("j están fuera de rango");
        } else 
        {
            int pos1 = encontrarVertice(Integer.toString(i));
            int pos2 = encontrarVertice(Integer.toString(j));
            if(pos1!=-1 && pos2!=-1)
            {
                for(int m=0;m<aristas;m++)
                {
                    Arista aux = aristasTodas[m];
                    if(aux.getDestino().equals(Integer.toString(i)) && aux.getOrigen().equals(Integer.toString(j)))
                    {
                        conect = true;
                    }
                    if(aux.getOrigen().equals(Integer.toString(i)) && aux.getDestino().equals(Integer.toString(j)))
                    {
                        conect = true;
                    }
                }
            }
            else
            {
                System.out.println("Vertice inexistente");
            }
        }
        return conect;
    }

    public String topologicalSort() {
        Pila pila = new Pila();
        String orden = "";
        boolean verticesVisitados[] = new boolean[cantidadVertices];
        for (int i = 0; i < cantidadVertices; i++) {
            verticesVisitados[i] = false;
            
        }

        for (int i = 0; i < cantidadVertices; i++) {
            if (verticesVisitados[i] == false) {
                ordenamientoTopologico(i, verticesVisitados, pila);

            }
        }
        while (pila.estaVacia() == false) {
            orden += pila.pop() + "-";
        }
        return orden;
    }

    private void ordenamientoTopologico(int j, boolean vertices[], Pila pila) {
        vertices[j] = true;
        int k;
        Iterator i = listaAdyacencia[j].iterator();
        
        while (i.hasNext()) {
            k = (int) i.next();
            System.out.println(k);
            if (!vertices[k]) {
                ordenamientoTopologico(k, vertices, pila);
            }

        }

        pila.push(j);
    }

    public boolean tieneCiclos() {
        boolean tiene = false;
        for(int m=0;m<aristas;m++)
        {
            Arista aux = aristasTodas[m];
            tiene = aux.hayCiclo();
            if(tiene==true)
            {
                m=aristas;
            }
        }
        return tiene;

    }

    //TERMINADO ANDREA
    public String mostrarEstructura() {
        String estructura = "";

        for (int i = 0; i < todosVertices.length; i++) {
            estructura += todosVertices[i].nombre + "->";
            if (aristasTodas != null) {
                for (Arista aristasToda : aristasTodas) {
                    if (aristasToda != null && aristasToda.origen.compareTo(todosVertices[i].nombre) == 0) { //tiene aristas
                        estructura += " - " + aristasToda.destino;
                    }

                }
            }
            estructura += "\n";
        }
        return estructura;
    }

    //Agregar una arista ✓ MAGUI
    public boolean insertarArista(int i, int j) {
        boolean sePudo = true;
        int v1= encontrarVertice(""+i);
        int v2= encontrarVertice(""+j);
       // listaAdyacencia[i].add(j);
        listaAdyacencia[v1].add(j);

        if(v1==-1 || v2==-1){
        //if ((i > vertices - 1 || i < 0) || (j > vertices - 1 || j < 0)) {
            throw new IllegalArgumentException("i o j están fuera de rango");
        } else {
            int posicionI = encontrarVertice(Integer.toString(i));
            int posicionJ = encontrarVertice(Integer.toString(j));
            if (posicionI != -1 && posicionJ != -1) {
                aristasTodas[aristas] = new Arista(Integer.toString(i), Integer.toString(j));
                aristas++;
                
            } else {
                System.out.println("Vertice inexistente.");
            }
        }
        return sePudo;
    }

    //TERMINADO ANDREA
    public void eliminarAristas() {
        aristasTodas = null;
        aristasTodas = new Arista[todosVertices.length * todosVertices.length];
    }

    //Agregar vertice ✓ MAGUI
    public void insertarVertice(String nombre) {
        Vertice nuevoV = new Vertice(nombre);
        boolean repetido = false;
        if (vActual < cantidadVertices) {
            for (int i = 0; i < vActual; i++) {
                repetido = todosVertices[i].getNombre().equals(nombre);
            }
            if (repetido == true) {
                System.out.println("Ya existe tal vertice.");
            } else {
                nuevoV.darPosicion(vActual);
                todosVertices[vActual] = nuevoV;
                vActual++;
            }
        } else {
            System.out.println("Ya se ingresaron el máximo de vertices");
        }
    }

    //Buscar y regresar posicion del vertice deseado o si no existe un -1 ✓ MAGUI
    public int encontrarVertice(String nombre) {
        Vertice buscando = new Vertice(nombre);
        int pos = -1;
        for (int k = 0; k < vActual; k++) {
            boolean esta = buscando.getNombre().equals(todosVertices[k].getNombre());
            if (esta == true) {
                pos = k;
            }
        }
        return pos;
    }

}
