package com.mycompany.proyectofinal;

/**
 * ✓
 *
 * @author magui
 */
public class Vertice {

    String nombre;
    int posicion;
    int aristasSalida;
    int aristasEntrada;
    public Vertice(String nombre) {
        this.nombre = nombre;
        posicion = -1;
        aristasSalida = 0;
        aristasEntrada = 0;
    }

    public Vertice(String nom, int pos) {
        this.nombre = nom;
        this.posicion = pos;
    }

    public void darPosicion(int pos) {
        this.posicion = pos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public int getAristasSalida() { //retorna el grado de salida
        return aristasSalida;
    }

    public int getAristasEntrada() { //retorna el grado de entrada
        return aristasEntrada;
    }

    public void setAristasSalida(int aristasSalida) { //coloca las aristas de salida
        this.aristasSalida += aristasSalida;
    }

//    public void setAristasEntrada(int aristasEntrada) { //coloca las aristas de entrada
//        this.aristasEntrada += aristasEntrada;
//    }
    
    public void setAristasEntrada(int aristasEntrada) { //coloca las aristas de entrada
        this.aristasEntrada = aristasEntrada;
    }
    
    @Override
    public String toString() {
        return "Vértice: " + nombre + "," + "Posición: " + posicion;
    }

}
