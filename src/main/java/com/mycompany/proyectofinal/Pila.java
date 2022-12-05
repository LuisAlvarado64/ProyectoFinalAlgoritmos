package com.mycompany.proyectofinal;

/**
 *
 * @author Luis Alvarado
 */
public class Pila<T> {

    T[] pila;
    int tope = -1;

    public Pila(int tamanio) {
        pila = (T[]) new Object[tamanio];
    }

    public Pila() {
        pila = (T[]) new Object[50];
    }

    public void push(T dato) {
        if (estaLlena()) {
            System.out.println("Desbordamiento");
        } else {
            tope++;
            pila[tope] = dato;
        }

    }

    public T pop() {
        T dato = null;
        if (estaVacia()) {
            System.out.println("Subdesbordamiento");
        } else {
            dato = pila[tope];
            tope--;
        }
        return dato;
    }

    public T peek() {
        T dato = null;
        if (estaVacia()) {
            System.out.println("Subdesbordamiento");
        } else {
            dato = pila[tope];
        }
        return dato;
    }

    public boolean estaLlena() {
        return pila.length == tope;
    }

    public boolean estaVacia() {
        return tope == -1;
    }

}
