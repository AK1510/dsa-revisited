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
//        myLinkedList.append(5);
//        myLinkedList.append(6);
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

//        System.out.println("-------");
//        myLinkedList.printList();
//        System.out.println("-------");
//        myLinkedList.printList(myLinkedList.reverse());

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.push(5); // Success
        singlyLinkedList.push(10); // Success
        System.out.println(singlyLinkedList.size);  // 2
        System.out.println(singlyLinkedList.pop()); // 10

        System.out.println(singlyLinkedList.size);  // 1
        System.out.println(singlyLinkedList.pop()); // 5
        System.out.println(singlyLinkedList.pop()); // The SLL does not exist

    }
}
