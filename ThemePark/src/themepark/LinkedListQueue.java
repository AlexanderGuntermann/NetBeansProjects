/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themepark;

/**
 *
 * @author alexguntermann
 */
public class LinkedListQueue {

    private ListNode head;

    public LinkedListQueue() {
        head = null;
    }

    /**
     * Inserts a node into the list in alphabetical order
     *
     * @param key
     * @return true or false
     */
    public boolean insert(String key) {
        // list is empty
        if (head == null) {
            ListNode node = new ListNode(key);
            head = node;
            return true;
        }
        ListNode prev = search(key);
        // We insert after the prev node
        if (prev != null) {
            ListNode nextOfPrev = prev.getNext();
            ListNode node = new ListNode(key, nextOfPrev);
            prev.setNext(node);
        } else {
            // We insert a new first node
            ListNode node = new ListNode(key, head);
            head = node;
        }
        return true;
    }

    public boolean delete(String element) {
        if (head != null) {
            ListNode prev = search(element);
            if (prev != null) {
                prev.setNext(prev.getNext().getNext());
                return true;
            }

        }
        return false;

    }

    public ListNode dequeue() {
        
        if (head != null) {

            ListNode originalHead = head;

            ListNode newHead = head.getNext();

            head = newHead;

            return originalHead;

        }
        return null;
    }

    /**
     * Tries to find the key within the list
     *
     * @param key //*
     */
    public ListNode search(String key) {
        ListNode prev = null, curr = head;
        boolean done = false;
        

        while (curr != null && !done) {
            if (!curr.getData().equals(key)) {
                prev = curr;
                curr = curr.getNext();
            } else {
                done = true;
            }
        }
        return prev;
    }

    /**
     * Displays prints the list content in []'s separated by commas
     */
    public void display() {
        System.out.println(this);
    }

    /**
     * String representation of the linked list
     *
     * @return
     */
    @Override

    public String toString() {
        ListNode curr = head;
        StringBuilder list = new StringBuilder("[");
        while (curr != null) {
            list.append(curr.getData());
            if (curr.getNext() != null) {
                list.append(", ");
            }
            curr = curr.getNext();
        }
        list.append("]");
        return list.toString();
    }
}
