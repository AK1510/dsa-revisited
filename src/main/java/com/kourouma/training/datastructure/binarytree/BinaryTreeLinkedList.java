package com.kourouma.training.datastructure.binarytree;


import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class BinaryTreeLinkedList {

    private BinaryNode root;

    public BinaryTreeLinkedList() {
    }

    public BinaryTreeLinkedList(BinaryNode root) {
        this.root = root;
    }

    public BinaryNode getRoot() {
        return root;
    }

    public void setRoot(BinaryNode root) {
        this.root = root;
    }

    // Preorder traversal
    public void preOrder(BinaryNode node) {

        if (node == null) {
            return;
        }
        System.out.print(node.getValue() + " ");

        preOrder(node.getLeft());
        preOrder(node.getRight());
    }

    // Inorder traversal
    public void inOrder(BinaryNode node) {

        if (node == null) {
            return;
        }

        inOrder(node.getLeft());
        System.out.print(node.getValue() + " ");
        inOrder(node.getRight());
    }

    // PostOrder traversal
    public void postOrder(BinaryNode node) {

        if (node == null) {
            return;
        }

        postOrder(node.getLeft());
        postOrder(node.getRight());
        System.out.print(node.getValue() + " ");

    }


    // Level Order traversal
    public void levelOrder(BinaryNode node) {

        if (node == null) return;
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            BinaryNode binaryNode = queue.remove();
            System.out.print(binaryNode.getValue() + " ");
            if (binaryNode.getLeft() != null) {
                queue.add(binaryNode.getLeft());
            }

            if (binaryNode.getRight() != null) {
                queue.add(binaryNode.getRight());
            }
        }
    }

    // Seach a value in a tree
    public void search(String value) {

        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            BinaryNode currentNode = queue.remove();

            if (currentNode.getValue() == value) {

                System.out.println(" The value " + value + " is found in the tree");
                return;
            } else {

                if (currentNode.getLeft() != null) {
                    queue.add(currentNode.getLeft());
                }
                if (currentNode.getRight() != null) {
                    queue.add(currentNode.getRight());
                }
            }
        }
        System.out.println(" The value " + value + " is not found in the tree");
    }

    // Insert a value into the tree
    public void insert(String value) {

        BinaryNode newNode = new BinaryNode();
        newNode.setValue(value);

        if (root == null) {
            root = newNode;
            System.out.println("Successfully added " + value + " at root");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            BinaryNode currentNode = queue.remove();

            if (currentNode.getLeft() == null) {
                currentNode.setLeft(newNode);
                System.out.println("Successfully added " + value);
                break;
            } else if (currentNode.getRight() == null) {
                currentNode.setRight(newNode);
                System.out.println("Successfully added " + value);
                break;
            } else {
                queue.add(currentNode.getLeft());
                queue.add(currentNode.getRight());
            }
        }
    }

    public BinaryNode getDeepestNode() {

        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode currentNode = null;
        while (!queue.isEmpty()) {
            currentNode = queue.remove();

            if (currentNode.getLeft() != null) {
                queue.add(currentNode.getLeft());
            }
            if (currentNode.getRight() != null) {
                queue.add(currentNode.getRight());
            }
        }
        return currentNode;
    }

    public BinaryNode getDeepestNode2() {

        if (root == null) return null;
        BinaryNode currentNode = null;
        while (root.getLeft() != null) {
            currentNode = root.getLeft();
            root = currentNode;
        }
        return currentNode;
    }

    // Delete deepest node
    public void deleteDeepestNode() {

        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode previousNode, currentNode = null;

        while (!queue.isEmpty()) {

            previousNode = currentNode;
            currentNode = queue.remove();

            if (currentNode.getLeft() == null) {
                previousNode.setRight(null);
                return;
            } else if (currentNode.getRight() == null) {
                previousNode.setLeft(null);
                return;
            }

            queue.add(currentNode.getLeft());
            queue.add(currentNode.getRight());
        }

    }

    // Delete given node
    public void deleteNode(String value) {

        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            BinaryNode current = queue.remove();

            if (Objects.equals(current.getValue(), value)) {
                current.setValue(getDeepestNode().getValue());
                deleteDeepestNode();
                System.out.println("The node " + current.getValue() + " is deleted");
                return;

            } else {
                if (current.getLeft() != null) queue.add(current.getLeft());
                if (current.getRight() != null) queue.add(current.getRight());
            }
        }
        System.out.println("The node doesn't exist in this BT");
    }

    public void deleteBT() {
        root = null;
        System.out.println("Tree is successfully deleted!");
    }
}
