package com.mycompany.proyectofinal;




/**
 *
 * @author magui, andrea y luis
 */
public class GrafoDirigidoAciclico {

    int cantidadVertices;
    Vertice[] todosVertices;
    int aristas = 0;
    Arista aristasTodas[];
    int vActual = 0;


    /**
     * Constructor parametrizado
     *
     * @param n
     */
    public GrafoDirigidoAciclico(int n) {
        this.cantidadVertices = n;
        todosVertices = new Vertice[n];
        aristasTodas = new Arista[n * n * n];
    }

    //TERMINADO ANDREA
    /**
     * Metodo que regresa el grado de entrada
     *
     * @param nombreVertice
     * @return
     */
    public int gradoDeEntrada(String nombreVertice) {
        int gradoEntrada = 0;
        int v1 = encontrarVertice(nombreVertice);
        if (v1 > cantidadVertices - 1 || v1 < 0) {
            throw new IllegalArgumentException("i está fuera de rango");
        } else {
            for (Arista aristasToda : aristasTodas) {
                if (aristasToda != null && aristasToda.destino.compareTo("" + nombreVertice) == 0) { //compara el vertice con los destinos de todas las aristas para saber si tiene grados de entrada
                    gradoEntrada++;

                }
            }
        }

        return gradoEntrada;
    }

    //TERMINADO ANDREA
    /**
     * Metodo que regresa el grado de salida
     *
     * @param i
     * @return
     */
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
    /**
     * Metodo que regresa cuantas aristas hay
     *
     * @return
     */
    public int cuantasAristasHay() {
        int nAristas = 0;
        if (aristasTodas == null) {
            nAristas = 0;
        } else {
            for (Arista aristasToda : aristasTodas) {
                if (aristasToda != null) {
                    if (aristasToda != null || !(aristasToda.destino.compareTo("" + -1) == 0 && aristasToda.origen.compareTo("" + -1) == 0)) {
                        //System.out.println("no es null");
                        nAristas++;
                    }
                }
            }
        }
        return nAristas;
    }

    //TERMINADO ANDREA
    /**
     * Metodo que indica si dos vertices son adyacentes
     *
     * @param i
     * @param j
     * @return
     */
    public boolean adyacente(int i, int j) {
        boolean si = false;
        int v1 = encontrarVertice("" + i);
        int v2 = encontrarVertice("" + j);
        if (v1 == -1 || v2 == -1) {
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
    /**
     * Metodo que indica si dos vertices estan conectados
     *
     * @param i
     * @param j
     * @return
     */
    public boolean conectados(int i, int j) {
        boolean conect = false;
        int v1 = encontrarVertice("" + i);
        int v2 = encontrarVertice("" + j);
        if (v1 == -1 || v2 == -1) {
            throw new IllegalArgumentException("j están fuera de rango");
        } else {
            int pos1 = encontrarVertice(Integer.toString(i));
            int pos2 = encontrarVertice(Integer.toString(j));
            if (pos1 != -1 && pos2 != -1) {
                for (int m = 0; m < aristas; m++) {
                    Arista aux = aristasTodas[m];
                    if (aux.getDestino().equals(Integer.toString(i)) && aux.getOrigen().equals(Integer.toString(j))) {
                        conect = true;
                    }
                    if (aux.getOrigen().equals(Integer.toString(i)) && aux.getDestino().equals(Integer.toString(j))) {
                        conect = true;
                    }
                }
            } else {
                System.out.println("Vertice inexistente");
            }
        }
        return conect;
    }

    /**
     * Metodo para hacer el topological sort
     */
    public void topologicalSort() {
        int[] gradosEntrada = new int[todosVertices.length];
        int gradoMayor = 0;
        for (int i = 0; i < todosVertices.length; i++) {
            gradosEntrada[i] = gradoDeEntrada(todosVertices[i].getNombre());
        }

        for (int i = 0; i < gradosEntrada.length; i++) {
            if (gradosEntrada[i] > gradoMayor) {
                gradoMayor = gradosEntrada[i];
            }
        }

        for (int i = 0; i < gradoMayor + 1; i++) {
            for (int j = 0; j < gradosEntrada.length; j++) {
                if (gradosEntrada[j] == i) {

                    System.out.print(todosVertices[j].getNombre() + "-");
                }

            }
        }
    }

    /**
     * Metodo que indica si tiene ciclos
     *
     * @return
     */
    public boolean tieneCiclos() {
        boolean tiene = false;

        for (int m = 0; m < aristas; m++) {
            Arista aux = aristasTodas[m];
            tiene = aux.hayCiclo();
            if (tiene == true) {
                m = aristas;
            }
        }

        return tiene;

    }

    //TERMINADO ANDREA
    /**
     * Metodo para mostrar estructura de la lista adyacente
     *
     * @return
     */
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
    /**
     * Metodo para insertar arista entre dos vertices
     *
     * @param i
     * @param j
     * @return
     */
    public boolean insertarArista(int i, int j) {
        boolean sePudo = true;
        int v1 = encontrarVertice("" + i);
        int v2 = encontrarVertice("" + j);

        if (v1 == -1 || v2 == -1) {
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
    /**
     * Metodo para eliminar aristas
     */
    public void eliminarAristas() {
        aristasTodas = null;
        aristasTodas = new Arista[todosVertices.length * todosVertices.length];
    }

    //Agregar vertice ✓ MAGUI
    /**
     * Metodo para insertar vertice
     *
     * @param nombre
     */
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

    //✓ MAGUI
    /**
     * Metodo para Buscar y regresar posicion del vertice deseado o si no existe
     * un -1
     *
     * @param nombre
     * @return
     */
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
