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
public class BSTDriver {

    public static void main(String[] args) {

        Node <String> n1, n2, n3, n4, n5, n6;

        n4 = new Node<String>("Hello", null, null);
        n6 = new Node<String>("Pizza", null, null);
        n5 = new Node<String>("This", n6, null);
        n2 = new Node<String>("Coding", null, n4);
        n3 = new Node<String>("Name", n5, null);
        n1 = new Node<String>("Python", n2, n3);

        BST <String> myTree = new BST<String>(n1);

        myTree.iot();
        
        System.out.println("\nIs the word Hello in the tree?");
        boolean found = myTree.search("Hello");

        System.out.printf("%nFound = %b%n \n", found);

        
        System.out.println("Is the word Java in the tree?");
        found = myTree.search("Java");

        System.out.printf("%nFound = %b%n", found);
    }
}
