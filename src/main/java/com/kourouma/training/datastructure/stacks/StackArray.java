package com.kourouma.training.datastructure.stacks;

public class StackArray {

    private int[] array;
    private int topOfStack;

    public StackArray(int size) {
        this.array = new int[size];
        this.topOfStack = -1;
        System.out.println("The StackArray is created with size of: " + size);
    }

    public boolean isEmpty() {
        //return array.length == 0;
        return topOfStack == -1;
    }

    public boolean isFull() {
        if (topOfStack == array.length - 1) {
            System.out.println("StackArray is full");
            return true;
        }

        return false;
    }

    // push
    public void push(int value) {

        if (isFull()) return;

        array[topOfStack + 1] = value;
        topOfStack++;
        System.out.println("The value: " + value + " is successfully inserted");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return Integer.MIN_VALUE;
        } else {
            // int topStack = array[topOfStack];
            //topOfStack--;
            return array[topOfStack--];
        }
    }

    public int peek() {

        if (isEmpty()) {
            System.out.println("The stack is empty");
            return Integer.MIN_VALUE;
        } else {
            return array[topOfStack];
        }
    }

    public void deleteStack() {
        this.array = null;
        System.out.println("The StackArray is deleted successfully");
    }
}
