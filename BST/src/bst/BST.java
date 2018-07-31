/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

/**
 *
 * @author alexguntermann
 */
public class BST<T extends Comparable<T>> {

    private Node<T> root;

    public BST() {
        root = null;
    }

    public BST(T key) {
        new Node<T>(key, null, null);
    }

    public BST(Node<T> root) {
        this.root = root;
    }

    public void iot() {
        iot(root);
    }

    private void iot(Node<T> node) {
        if (node != null) {
            iot(node.getLChild());
            node.printKey();
            iot(node.getRChild());
        }
        
        
    }

    public boolean search(T key) {
        Node<T> node = root;
        while (node != null) {
            if (key == node.getKey()) {
                return true;
            } else if (key.compareTo(node.getKey()) > 0) {
                node = node.getRChild();
            } else {
                node = node.getLChild();
            }
        }

        return false;
    }

}

//            } else if (key.compareTo(node.getKey()) > 0) {
//                node = node.getRChild();
//            } else {
//                node = node.getLChild();
//            }

