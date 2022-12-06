package com.mycompany.proyectofinal;

/**
 * ✓
 *
 * @author magui, andrea y luis
 */
public class Vertice {

    String nombre;
    int posicion;
    int aristasSalida;
    int aristasEntrada;

    /**
     * Constructor parametrizado
     *
     * @param nombre
     */
    public Vertice(String nombre) {
        this.nombre = nombre;
        posicion = -1;
        aristasSalida = 0;
        aristasEntrada = 0;
    }

    /**
     * Constructor parametrizado
     *
     * @param nom
     * @param pos
     */
    public Vertice(String nom, int pos) {
        this.nombre = nom;
        this.posicion = pos;
    }

    /**
     * Metodo para dar la posicion del vertice
     *
     * @param pos
     */
    public void darPosicion(int pos) {
        this.posicion = pos;
    }

    /**
     * Metodo para obtener nombre del vertice
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para obtener la posicion del vertice
     *
     * @return
     */
    public int getPosicion() {
        return posicion;
    }

    /**
     * Metodo para obtener el grado de salida
     *
     * @return
     */
    public int getAristasSalida() { //retorna el grado de salida
        return aristasSalida;
    }

    /**
     * Metodo para obtener el grado de entrada
     *
     * @return
     */
    public int getAristasEntrada() { //retorna el grado de entrada
        return aristasEntrada;
    }

    /**
     * Metodo para colocar las aristas de salida
     *
     * @param aristasSalida
     */
    public void setAristasSalida(int aristasSalida) { //coloca las aristas de salida
        this.aristasSalida += aristasSalida;
    }

    /**
     * Metodo para colocar las aristas de entrada
     *
     * @param aristasEntrada
     */
    public void setAristasEntrada(int aristasEntrada) { //coloca las aristas de entrada
        this.aristasEntrada = aristasEntrada;
    }

    /**
     * Metodo toString
     *
     * @return
     */
    @Override
    public String toString() {
        return "Vértice: " + nombre + "," + "Posición: " + posicion;
    }

}
