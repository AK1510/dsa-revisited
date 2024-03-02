package com.kourouma.training.datastructure.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    private Node root;

    public BinarySearchTree(Node root) {
        this.root = root;
    }

    public BinarySearchTree() {
        root = null;
    }

    public static Node min(Node root) {

        if ((root == null) || (root.getLeft() == null))
            return null;

        return min(root.getLeft());
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    // Insert into BST
    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {

        Node newNode = new Node(value);

        if (node == null) {
            System.out.println("Successfully added " + value + " at root");
            return newNode;
        } else if (value <= node.getValue()) {
            node.setLeft(insert(node.getLeft(), value));
            System.out.println("Successfully added " + value);

        } else {
            node.setRight(insert(node.getRight(), value));
            System.out.println("Successfully added " + value);

        }
        return node;
    }

    // preOrder
    public void preOrder(Node node) {

        if (node == null) {
            return;
        }
        System.out.print(node.getValue() + " --> ");

        preOrder(node.getLeft());
        preOrder(node.getRight());
    }

    // inOrder traversal
    public void inOrder(Node node) {

        if (node == null) return;

        inOrder(node.getLeft());
        System.out.print(node.getValue() + " --> ");
        inOrder(node.getRight());
    }

    // postOrder traversal
    public void postOrder(Node node) {

        if (node == null) return;

        postOrder(node.getLeft());
        postOrder(node.getRight());
        System.out.print(node.getValue() + " --> ");
    }

    // levelOrder traversal
    public void levelOrder() {

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();
            System.out.print(currentNode.getValue() + " ");

            if (currentNode.getLeft() != null) {
                queue.add(currentNode.getLeft());
            }
            if (currentNode.getRight() != null) {
                queue.add(currentNode.getRight());
            }
        }
    }

    public Node search(Node node, int value) {

        if (node == null) {
            System.out.println("The value " + value + " not found in the BST");
            return null;
        }

        if (node.getValue() == value) {
            System.out.println("The value " + value + " found in the BST");
            return node;
        } else if (value < node.getValue()) {
            return search(node.getLeft(), value);
        } else {
            return search(node.getRight(), value);
        }
    }

    public Node deleteNode(Node root, int value) {

        if (root == null) {
            System.out.println("Value " + value + " not found in BST");
            return null;
        }
        if( value < root.getValue()){

            deleteNode(root.getLeft(), value);
        }else if( value > root.getValue()){

            deleteNode(root.getRight(), value);
        }else {

        }
return null;
    }


}
