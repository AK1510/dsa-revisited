package com.kourouma.training.datastructure.stacks;

public class MainApp {

    public static void main(String[] args) {

        StackArray newStackArray = new StackArray(4);

        System.out.println(newStackArray.isEmpty());
        System.out.println(newStackArray.isFull());

        newStackArray.push(1);
        newStackArray.push(2);
        newStackArray.push(3);
        newStackArray.push(4);
        newStackArray.push(5);
        System.out.println(newStackArray.peek());
        System.out.println(newStackArray.peek());
    }
}
