package com.kourouma.training.datastructure.binarytree;

public class BinarySearchTreeClient {

    public static void main(String[] args) {
       BinarySearchTree binarySearchTree = new BinarySearchTree();

       binarySearchTree.insert(70);
       binarySearchTree.insert(50);
       binarySearchTree.insert(90);
       binarySearchTree.insert(30);
       binarySearchTree.insert(60);
       binarySearchTree.insert(80);
       binarySearchTree.insert(100);
       binarySearchTree.insert(20);
       binarySearchTree.insert(40);

       binarySearchTree.preOrder(binarySearchTree.getRoot());
       System.out.println();
       binarySearchTree.inOrder(binarySearchTree.getRoot());
       System.out.println();
       binarySearchTree.postOrder(binarySearchTree.getRoot());
       System.out.println();
       binarySearchTree.levelOrder();
       System.out.println();
       binarySearchTree.search(binarySearchTree.getRoot(), 40);
       binarySearchTree.search(binarySearchTree.getRoot(), 45);
    }
}
