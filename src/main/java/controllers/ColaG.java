package controllers;

import models.Node;
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

}
