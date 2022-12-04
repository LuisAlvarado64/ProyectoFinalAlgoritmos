/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;

import java.util.LinkedList;

/**
 *
 * @author magui
 */
public class Vertice {
    String nombre;
    int posicion;
    LinkedList<Object> listaAd;

    public Vertice(String nombre) {
        this.nombre = nombre;
        posicion=-1;
        listaAd = new LinkedList();
    }
    public Vertice(String nom, int pos) 
    {
        this.nombre = nom;
        this.posicion = pos;
        listaAd = new LinkedList();
    }
    public void darPosicion(int pos)
    {
        this.posicion = pos;
    }
    public String getNombre()
    {
        return nombre;
    }
    public int getPosicion() 
    {
        return posicion;
    }

    @Override
    public String toString() {
        return "Vértice: " + nombre + "," + "Posición: " + posicion;
    }
    
    
    
}
