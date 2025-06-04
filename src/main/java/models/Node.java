package models;

public class Node {
    private int value;
    private Node netx;

    public Node(int value) {
        this.value = value;
        this.netx = null;
    }

    @Override
    public String toString() {
        return "Node{value=" + value + "}";
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNetx() {
        return netx;
    }

    public void setNetx(Node netx) {
        this.netx = netx;
    }
}
