package controllers;

import models.Node;

import java.util.EmptyStackException;

public class Cola {
    private Node primero;
    private Node ultimo;
    public int size;

    public Cola() {
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }

    public Node getPrimero() {
        return primero;
    }

    public void setPrimero(Node primero) {
        this.primero = primero;
    }

    public Node getUltimo() {
        return ultimo;
    }

    public void setUltimo(Node ultimo) {
        this.ultimo = ultimo;
    }

    public void add(int value){
        Node newNode = new Node(value);
        if (isEmpty()) {
            primero = newNode;
            ultimo = newNode;

        }else {
            ultimo.setNetx(newNode);
            ultimo = newNode;
        }
    }
    public int remove(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        int value = primero.getValue();
        primero = primero.getNetx();
        size--;
        return value;
    }

    public int peek(){
        if (isEmpty())
            throw new EmptyStackException();

        return primero.getValue();
    }

    public boolean isEmpty(){
        return primero == null;
    }

    public void print(){
            while (primero != null){
                System.out.println(primero.getValue() + " - ");
                primero = primero.getNetx();
            }
        }

    }
