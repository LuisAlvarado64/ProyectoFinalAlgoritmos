/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;

/**
 *
 * @author magui
 */
public class Arista 
{
    String origen;
    String destino;

    public Arista(String origen, String destino) 
    {
        this.origen = origen;
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }
    
    public boolean hayCiclo()
    {
        if(destino.equals(origen))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}