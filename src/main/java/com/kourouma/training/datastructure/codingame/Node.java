package com.kourouma.training.datastructure.arbre;

/**
 * @author akourouma
 * @version 1.0
 * @project datastructures
 * @license GUINEA MARKETPLACE
 * @email kouroumaa@yahoo.fr
 * @since 05/04/2025
 */
public class Node {

    Node left, right;
    int value;

    public Node find(int v) {

        Node current = this;

        while (current != null) {

            if (current.value == v) {
                return current;
            }
            current = v < current.value ? current.left : current.right;

        }

        return null;
    }
}
