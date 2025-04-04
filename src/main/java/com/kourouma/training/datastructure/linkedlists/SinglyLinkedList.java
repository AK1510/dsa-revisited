package com.kourouma.training.datastructure.linkedlists;

public class SinglyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public SinglyLinkedList() {
    }

    public SinglyLinkedList(int value) {

       Node newNode = new Node(value);

       head = newNode;
       tail = newNode;

       size++;
    }
    public void push(int value){

        Node newNode  = new Node();
        newNode.value = value;


        if( head == null){
            head = newNode;
            tail = newNode;
            size++;
            return;
        }

        Node tmp = head;

        while( tmp.next != null){
            tmp = tmp.next;
        }

        newNode.next = null;
        tmp.next = newNode;
        tail = newNode;
        size++;
    }

    public Node pop() {
        if (head == null) {
            System.out.println("The SLL does not exist");
            return null;
        }
        Node nodeToRemove;
        Node current;
        if(head==tail) {
            nodeToRemove = head;
            head=tail=null;

        }else{

            current = head;
            while(current.next != tail){
                current= current.next;
            }

            nodeToRemove = current.next;
            current.next=null;
            tail= current;

        }
        size--;
        return nodeToRemove;
    }


    class Node {
        public int value;
        public Node next;

        public Node() {
        }

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value + " ";
        }
    }
}
