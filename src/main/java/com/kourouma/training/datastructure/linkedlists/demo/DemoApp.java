package com.kourouma.training.datastructure.linkedlists.demo;

public class DemoApp {

    public static void main(String[] args) {
        SingleList list = new SingleList(1);

        list.appendNode(2);
        list.appendNode(3);
        list.appendNode(4);
        list.appendNode(5);
        list.printList();

        list.reverse();
        list.printList();
    }
}
