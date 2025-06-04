package controllers;

import models.Node;
import models.NodeGenerico;

import java.util.EmptyStackException;

public class ColaG <T>{
    private NodeGenerico primero;
    private NodeGenerico ultimo;
    public int size;

    public ColaG() {
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }

    public NodeGenerico getPrimero() {
        return primero;
    }

    public void setPrimero(NodeGenerico primero) {
        this.primero = primero;
    }

    public NodeGenerico getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodeGenerico ultimo) {
        this.ultimo = ultimo;
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
    }
    public Object remove(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        T value = (T) primero.getValue();
        primero = primero.getNext();
        size--;
        return null;
    }

    public int peek(){
        if (isEmpty())
            throw new EmptyStackException();

        return (int) primero.getValue();
    }

    public boolean isEmpty(){
        return primero == null;
    }

    public void print(){
        while (primero != null){
            System.out.println(primero.getValue() + " - ");
            primero = primero.getNext();
        }
    }

}
