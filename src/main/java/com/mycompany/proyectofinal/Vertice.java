/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;

/**
 *
 * @author magui
 */
public class Vertice {
    String nombre;
    int posicion;

    public Vertice(String nombre) {
        this.nombre = nombre;
        posicion=-1;
    }
    public Vertice(String nom, int pos) 
    {
        this.nombre = nom;
        this.posicion = pos;
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
    
    
    
}
