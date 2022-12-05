package com.mycompany.proyectofinal;

/**
 * ✓
 *
 * @author magui
 */
public class Arista {

    String origen;
    String destino;
    Vertice origenV;
    Vertice destinoV;

    public Arista(String origen, String destino) {
        this.origen = origen;
        this.destino = destino;
    }

    public Arista(Vertice origenV, Vertice destinoV) {
        this.origenV = origenV;
        this.destinoV = destinoV;
    }

    public Vertice getOrigenV() {
        return origenV;
    }

    public Vertice getDestinoV() {
        return destinoV;
    }
    
    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }
//  Regresa si la arista es un ciclo o no  ✓

    public boolean hayCiclo() {
        return destino.equals(origen);
    }
}
