package com.kourouma.training.datastructure.linkedlists.practice;

public class LinkedList {

    public Node head;
    public int length;

    public void printList(){
        Node node = head;

        while (node != null){

            System.out.print( node.value+" --> ");
            node = node.next;
        }

        System.out.println("null");

    }

    public void addNode(int value, int position){

        Node newNode = new Node(value);

        // case 1: At the beginning
       /* if( head == null ){
            head = newNode;
            length++;
            System.out.println(value+" added new node at the beginning of the list");
            return;
        }*/

        if(head == null  || position == 0){
            newNode.next = head;
            head = newNode;
            length++;
            System.out.println(value+" added new node at the beginning of the list");
            return;
        }
        // case 2: At the end

        if(position >= length){
            Node current = head;
            while (current.next != null) current = current.next;
            newNode.next = null;
            current.next = newNode;
            length++;
            System.out.println(value+" added new node at the end of the list");
            return;
        }

        // case 3: In the middle
        Node current = head;
        for(int i = 0; i < position-1; i++){
            current = current.next;
        }
        System.out.println(current);
        newNode.next = current.next;
        current.next = newNode;
        length++;
        System.out.println(value+" added new node in the middle of the list");
    }

    public boolean deleteNode(int position){
        if(head == null || position >= length) return false;

        if(position == 0){
            head = head.next;
            length--;
            return true;
        } else if (position == length - 1) {
            Node current = head;
            for (int i = 0; i < position - 1; i++){
                current = current.next;
            }
            current.next = null;
            length--;
            return true;
        }else {
            Node current = head;
            for (int i = 0; i < position - 1; i++){
                current = current.next;
            }
            current.next = current.next.next;
            length--;

            return true;
        }
    }


    public int getDecimalValue() {
        int decimalValue=0;
        Node tmp= head;
        while(tmp !=null){
           decimalValue = (decimalValue * 2) + tmp.value;
            tmp=tmp.next;
        }
        System.out.println(decimalValue);

        return decimalValue;
    }

    class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }
}
