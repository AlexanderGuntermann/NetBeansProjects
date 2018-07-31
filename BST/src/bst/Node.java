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
public class Node<T extends Comparable<T>> {

    private T key;
    private Node<T> lChild;
    private Node<T> rChild;

    public Node(T key) {
        this.key = key;
    }

    public Node(T key, Node<T> lChild, Node<T> rChild) {
        this(key);
        this.lChild = lChild;
        this.rChild = rChild;
    }

    public void printKey() {
        System.out.println("Key = " + this.getKey()+" ");
    }

    public T getKey() {
        return key;
    }

    public Node<T> getLChild() {
        return lChild;
    }

    public Node<T> getRChild() {
        return rChild;
    }

    public static void main(String[] args) {
    }
}
