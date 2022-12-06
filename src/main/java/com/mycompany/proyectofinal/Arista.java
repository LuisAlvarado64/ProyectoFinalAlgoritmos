package com.mycompany.proyectofinal;

/**
 * ✓
 *
 * @author magui, andrea y luis
 */
public class Arista {

    String origen;
    String destino;
    Vertice origenV;
    Vertice destinoV;

    /**
     * Constructor parametrizado
     *
     * @param origen
     * @param destino
     */
    public Arista(String origen, String destino) {
        this.origen = origen;
        this.destino = destino;
    }

    /**
     * Constructor parametrizado
     *
     * @param origenV
     * @param destinoV
     */
    public Arista(Vertice origenV, Vertice destinoV) {
        this.origenV = origenV;
        this.destinoV = destinoV;
    }

    /**
     * Metodo para obtener el origen del vertice
     *
     * @return
     */
    public Vertice getOrigenV() {
        return origenV;
    }

    /**
     * Metodo para obtener el destino del vertice
     *
     * @return
     */
    public Vertice getDestinoV() {
        return destinoV;
    }

    /**
     * Metodo para obtener el origen
     *
     * @return
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Metood para obtener el destino
     *
     * @return
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Metodo para cambiar origen
     *
     * @param origen
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * Metodo para cambiar destino
     *
     * @param destino
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * Metodo que regresa un booleano para saber si hay ciclo
     *
     * @return
     */
    public boolean hayCiclo() {
        return destino.equals(origen);
    }

    /**
     * Metodo para eliminar arista
     */
    public void eliminarArista() {
        origen = null;
        destino = null;
    }
}
