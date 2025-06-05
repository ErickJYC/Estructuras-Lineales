package controllers;

import models.Node;

import java.util.EmptyStackException;

public class Stack {
    private Node top;
    private int size;

    public Stack(){
        this.top=null;
        this.size =0;
    }
    // Metodo que ingrese un valor
    public void push(int value){
        Node nuevoNode = new Node(value);
        nuevoNode.setNetx(top);
        top = nuevoNode;
        size++;
    }
    public int pop(){
        if (isEmpty() ){
            throw new EmptyStackException();
        }

        int value = top.getValue();
        top = top.getNetx();
        size--;
        return value;
    }

    public boolean isEmpty (){
        return top == null;
    }
    public int peek(){
        if (isEmpty())
            throw new RuntimeException();
        return top.getValue();
    }
    public void printStack(){
        if (isEmpty()){
            System.out.println("-------");
        }else {
            Node current = top;
            while (current != null){
                System.out.println(current.getValue() + " - ");
                current = current.getNetx();
            }
            System.out.println();
        }

    }
    public int size(){
        return size;
    }
}
