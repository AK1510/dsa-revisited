package com.kourouma.training.datastructure.linkedlists;

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

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {

        Node newNode = new Node(value);
        if (length == 0) { //
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        length++;
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
            head = null;
            tail = null;
        }

        return tmp;
    }

    public void prepend(int value) {

        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        length++;
    }

    public Node removeFirst() {

        if (length == 0) {
            return null;
        }

        Node tmp = head;

        head = head.next;
        tmp.next = null;
        length--;

        if (length == 0) {
            tail = null;
        }

        return tmp;
    }

    public Node getNode(int index) {
        if (index < 0 || index >= length) return null;
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }

        return tmp;
    }

    public boolean setNode(int index, int value) {

        Node tmp = getNode(index);

        if (tmp != null) {
            tmp.value = value;
            return true;
        }

        return false;
    }

    public boolean insertNode(int index, int value) {

        if (index < 0 || index > length) {
            return false;
        }

        if (index == 0) {
            prepend(value);
            return true;
        }

        if (index == length) {
            append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node tmp = getNode(index - 1);
        newNode.next = tmp.next;
        tmp.next = newNode;
        length++;
        return true;
    }

    public Node removeNode(int index) {

        if (index < 0 || index >= length) return null;

        if (index == 0) return removeFirst();

        if (index == length - 1) return removeLast();

        Node prev = getNode(index - 1);
        Node tmp = prev.next;

        prev.next = tmp.next;
        tmp.next = null;
        length--;

        return tmp;
    }


    public Node reverse(){

          Node current = head;
          Node prev = null;

          while (current != null){
              Node tmp = current.next;
              current.next = prev;
              prev = current;
              current = tmp;
          }

          return prev;
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
