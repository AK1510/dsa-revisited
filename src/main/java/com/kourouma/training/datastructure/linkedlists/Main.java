package com.kourouma.training.datastructure.linkedlists;

public class Main {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
//
//        myLinkedList.printList();
//        System.out.println("--------");
        myLinkedList.append(5);
        myLinkedList.append(6);
        // 2 items- returns 2 nodes
        //System.out.println(myLinkedList.removeFirst());
        // 1 item- returns 1 node
        //System.out.println(myLinkedList.removeFirst());
        // 0 item- returns null
        //System.out.println(myLinkedList.removeFirst());

      //  myLinkedList.printList();
        //myLinkedList.prepend(1);
       // myLinkedList.printList();

        //System.out.println(myLinkedList.getNode(2) );


        //myLinkedList.printList();
        //System.out.println(myLinkedList.setNode(2,7));

        System.out.println("-------");
        myLinkedList.printList();
        System.out.println("-------");
        myLinkedList.printList(myLinkedList.reverse());


    }
}
