package com.kourouma.training.datastructure.linkedlists.exercises;

public class MainApp {

    public static void main(String[] args) {

        LinkedList myList = new LinkedList(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);
        myList.append(6);
        System.out.println(myList.findMiddleNode());

        myList.display();
        System.out.println(myList.countNodes());
    }
}
