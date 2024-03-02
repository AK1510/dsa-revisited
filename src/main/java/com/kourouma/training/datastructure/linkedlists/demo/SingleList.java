package com.kourouma.training.datastructure.linkedlists.demo;

public class SingleList {

    private Node head;
    private Node tail;
    private int length;


    public SingleList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length++;
    }

    public void printList() {
        Node tmp = head;

        while (tmp != null) {
            System.out.print(tmp.getValue() + " --> ");
            tmp = tmp.getNext();
        }
        System.out.println("null");
    }

    public void printList(Node head) {
        Node tmp = head;

        while (tmp != null) {
            System.out.print(tmp.getValue() + " --> ");
            tmp = tmp.getNext();
        }
        System.out.println("null");
    }

    public void appendNode(int value) {
        Node newNode = new Node(value);


        if (head == null) {
            head = newNode;
            tail = newNode;
            length++;
            return;
        }

        Node tmp = head;
        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
        }

        newNode.setNext(null);
        tmp.setNext(newNode);
        length++;
    }

    public Node removeLast() {
        if (head == null || head.getNext() == null) return head;

        Node tmp = head;

        while (tmp.getNext() != null && tmp.getNext().getNext() != null) {
            tmp = tmp.getNext();
        }
        tmp.setNext(null);
        length--;

        if (length == 0) {
            head = null;
            tail = null;
        }

        return tmp;
    }

    public Node removeLastV2() {
        if (head == null || head.getNext() == null) return head;

        Node current = head;
        Node previous = null;

        while (current.getNext() != null) {
            previous = current;
            current = current.getNext();
        }

        if (previous != null) {
            previous.setNext(null);
            length--;
        }

        return current;
    }


    public Node removeMiddle(int position) {

        if (position == 0) return null;
        return null;
    }

    public Node mergeTwoSortedLinkedList(Node list1, Node list2) {

        Node returnNode = new Node(Integer.MIN_VALUE);

        //
        Node headNode = returnNode;

        // Traverse till one of the list reaches the end
        while (list1 != null && list2 != null) {

            if (list1.getValue() <= list2.getValue()) {
                returnNode.setNext(list1);
                list1 = list1.getNext();
            } else {
                returnNode.setNext(list2);
                list2 = list2.getNext();
            }

            returnNode = returnNode.getNext();
        }

        // Append the remaining list
        if (list1 == null) {
            returnNode.setNext(list2);
        } else if (list2 == null) {
            returnNode.setNext(list1);
        }

        return headNode.getNext();
    }


    public Node reverse() {

        Node current = head;
        Node previous = null;
        Node next = null;

        while (current != null) {
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;

        }

        head = previous;
        return head;
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
}
