package com.kourouma.training.datastructure.linkedlists.demo;

public class Node {
    private int value;
    private Node next;


    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node initialLink) {
        this.value = value;
        next =  initialLink;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
