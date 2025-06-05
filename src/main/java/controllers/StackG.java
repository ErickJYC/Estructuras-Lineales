package controllers;

import models.Node;
import models.NodeGenerico;

import java.util.EmptyStackException;

public class StackG<T> {
    private NodeGenerico<T> top;
    private int size;

    public StackG() {
        this.top = null;
        this.size =0;
    }

    // Metodo que ingrese un valor
    public void push(T value){
        NodeGenerico<T> nuevoNode = new NodeGenerico<>(value);
        nuevoNode.setNext(top);
        top = nuevoNode;
        size++;
    }
    public T pop(){
        if (isEmpty() )
            throw new EmptyStackException();

        T value = top.getValue();
        top = top.getNext();
        return value;
    }
    public boolean isEmpty (){
        return top == null;
    }
    public T peek(){
        if (isEmpty())
            throw new RuntimeException();
        return top.getValue();
    }
    public void printStack(){
        if (isEmpty()){
            System.out.println("-------");
        }else {
            NodeGenerico<T> current = top;
            while (current != null){
                System.out.println(current.getValue() + " | ");
                current = current.getNext();
            }
            System.out.println();
        }

    }
    public int size(){
        return size;
    }
}
