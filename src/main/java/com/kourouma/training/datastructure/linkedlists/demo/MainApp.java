package com.kourouma.training.datastructure.linkedlists.demo;

public class MainApp {

    public static void main(String[] args) {

        SingleList list = new SingleList(1);
        //list.printList();
       /* list.appendNode(2);
        list.appendNode(3);
        list.appendNode(4);

        list.printList();*/
        //list.removeLast();
        //list.removeLast();
        //list.printList();

        SingleList list1 = new SingleList(1);
        list1.appendNode(3);
        list1.appendNode(6);
        list1.appendNode(10);
        list1.printList();
        SingleList list2 = new SingleList(4);
        list2.appendNode(7);
        list2.appendNode(9);
        list2.printList();

        Node headNode = list1.mergeTwoSortedLinkedList(list1.getHead(), list2.getHead());

        list1.printList(headNode);
    }
}
