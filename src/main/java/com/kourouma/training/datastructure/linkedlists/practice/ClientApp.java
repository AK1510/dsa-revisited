package com.kourouma.training.datastructure.linkedlists.practice;

import jdk.dynalink.linker.LinkerServices;

public class ClientApp {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(1, 0);
        list.addNode(0, 1);
        list.addNode(1, 2);
       /* list.addNode(3, 2);
        list.addNode(4, 3);
        list.addNode(5, 4);
        list.printList();
        list.addNode(6, 3);
        list.addNode(8, 0);*/
        System.out.println();
        System.out.println();
        System.out.println("---------");

        list.printList();
       // list.deleteNode(1);
        //list.printList();

        list.getDecimalValue();
    }
}
