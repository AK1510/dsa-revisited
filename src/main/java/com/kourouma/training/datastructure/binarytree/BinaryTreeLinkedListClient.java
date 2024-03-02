package com.kourouma.training.datastructure.binarytree;


public class BinaryTreeLinkedListClient {
    public static void main(String[] args) {

        BinaryNode n5 = new BinaryNode("N5", null, null);
        BinaryNode n6 = new BinaryNode("N6", null, null);
        BinaryNode n7 = new BinaryNode("N7", null, null);
        BinaryNode n8 = new BinaryNode("N8", null, null);
        BinaryNode n9 = new BinaryNode("N9", null, null);
        BinaryNode n4 = new BinaryNode("N4", n8, n9);
        BinaryNode n2 = new BinaryNode("N2", n4, n5);
        BinaryNode n3 = new BinaryNode("N3",n6 ,n7 );
        BinaryNode n1 = new BinaryNode("N1", n2, n3);

        BinaryTreeLinkedList binaryTreeLinkedList = new BinaryTreeLinkedList(n1);

        System.out.println("-----------PreOrder traversal--------------");
        binaryTreeLinkedList.preOrder(binaryTreeLinkedList.getRoot());
        System.out.println();
        System.out.println();
        System.out.println("-----------InOrder traversal--------------");
        binaryTreeLinkedList.inOrder(binaryTreeLinkedList.getRoot());
        System.out.println();
        System.out.println();
        System.out.println("-----------PostOrder traversal--------------");
        binaryTreeLinkedList.postOrder(binaryTreeLinkedList.getRoot());
        System.out.println();
        System.out.println();
        System.out.println("-----------LevelOrder traversal--------------");
        binaryTreeLinkedList.levelOrder(binaryTreeLinkedList.getRoot());
        System.out.println();
        System.out.println();

        System.out.println("-----------Search--------------");
        binaryTreeLinkedList.search("N5");
        binaryTreeLinkedList.search("N10");
        System.out.println("-----------Insertion in tree --------------");

        BinaryTreeLinkedList bt = new BinaryTreeLinkedList();
        bt.insert("n1");
        bt.insert("n2");
        bt.insert("n3");
        bt.insert("n4");
        bt.insert("n5");
        bt.insert("n6");
        bt.insert("n7");
        bt.insert("n8");
        bt.insert("n9");

        bt.levelOrder(bt.getRoot());
        System.out.println();
        System.out.println(bt.getDeepestNode().getValue());
        System.out.println();
        bt.deleteNode("n3");
        System.out.println();
        bt.levelOrder(bt.getRoot());
    }
}
