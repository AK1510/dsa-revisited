package com.kourouma.training.datastructure.linkedlists.exercises;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.value + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public Node removeLast() {

        if (length == 0) return null;
        Node tmp = head;
        Node pre = head;

        while (tmp.next != null) {
            pre = tmp;
            tmp = tmp.next;
        }

        tail = pre;
        tail.next = null;

        length--;

        if (length == 0) {
            tail = null;
            head = null;
        }

        return tmp;
    }

    public Node findMiddleNode() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public int countNodes() {
        Node current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    // WRITE REMOVELAST METHOD HERE //
    //                              //
    //                              //
    //                              //
    //                              //
    //////////////////////////////////

    class Node {
        int value;
        Node next;

        Node(int value) {
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