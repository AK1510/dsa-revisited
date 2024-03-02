package com.kourouma.training.datastructure.linkedlists;

public class SinglyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList( int value) {

       Node newNode = new Node(value);

       head = newNode;
       tail = newNode;

       size++;
    }

    private
    class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value + " ";
        }
    }
}
