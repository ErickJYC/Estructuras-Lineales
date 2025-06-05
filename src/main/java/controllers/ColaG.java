package controllers;

import models.Persona;
import models.NodeGenerico;

import java.util.EmptyStackException;

public class ColaG <T>{
    private NodeGenerico<T> primero;
    private NodeGenerico<T> ultimo;
    public int size;

    public ColaG() {
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }
    public boolean isEmpty(){
        return primero == null;
    }

    public void add(T value){
        NodeGenerico<T> newNode = new NodeGenerico<>(value);
        if (isEmpty()) {
            primero = newNode;
            ultimo = newNode;

        }else {
            ultimo.setNext(newNode);
            ultimo = newNode;
        }
        size++;
    }
    public T remove(){
        if (isEmpty()) {
            throw new IllegalStateException("La cola esta vaia.");
        }
        T value = primero.getValue();
        primero = primero.getNext();
        size--;
        return value;
    }

    public T peek(){
        if (isEmpty())
            throw new EmptyStackException();

        return primero.getValue();
    }


    public void printCola(){
        NodeGenerico<T> current = primero;
        while (current != null){
            System.out.println(current.getValue() + " - ");
            current = current.getNext();
        }
        System.out.println();
    }
    public int size(){
        return size;
    }
    public int findByName(String nombre) {
        int posicion = 0;
        NodeGenerico<T> current = primero;
        while (current != null) {
            if (current.getValue().toString().equals(nombre)) {
                return posicion;
            }
            current = current.getNext();
        }
        return -1;
    }

    public Persona removeByName(String nombre) {
        if (isEmpty()){
            throw new EmptyStackException();
        }
        NodeGenerico<T> actual = primero;
        NodeGenerico<T> anterior = null;

        while (actual != null){
            T valor = actual.getValue();
            if (valor instanceof Persona) {
                Persona persona = (Persona) valor;
                if (persona.getNombre().equalsIgnoreCase(nombre)) {
                    // Si es el primer nodo
                    if (anterior == null) {
                        primero = actual.getNext();
                        if (primero == null) {
                            ultimo = null;
                        }
                    } else {
                        anterior.setNext(actual.getNext());
                        if (actual == ultimo) {
                            ultimo = anterior;
                        }
                    }
                    size--;
                    return persona;
                }
            }
            anterior = actual;
            actual = actual.getNext();
        }
        return null; // Si no se encontró
    }

}
