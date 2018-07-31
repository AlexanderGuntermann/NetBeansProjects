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
/*
* List Node
 */


public class ListNode {

    private String data;
    private ListNode next;

    public ListNode(String data) {
        this(data, null);
    }

    public ListNode(String data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "[ " + this.data + " ] --> " + this.next;
    }
}


