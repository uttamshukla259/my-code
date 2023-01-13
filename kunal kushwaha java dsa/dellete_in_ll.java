import java.util.*;

import javax.swing.plaf.synth.SynthStyle;

class node {
    int data;
    node next;

    node(int x) {
        data = x;
        next = null;
    }
}

class ll {
    node head;
    // add at first
    void addfirst(int x) {
        node newnode = new node(x);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    // insert at tail
    void Atlast(int x) {
        node newnode = new node(x);
        if (head == null) {
            head = newnode;
            return;
        }
        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }
    // print function
    void print() {
        node temp = head;
        while (temp != null) {
            System.err.print(temp.data + " ");
            temp = temp.next;
        }
        System.err.println();
    }
    // delete at head;
    void delteAthead(int x) {
        if (head == null) {
            return;
        }
        head = head.next;
    }
    // delete at last;
    void deleteAtlast(int x) {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        node sl = head;
        node l = head.next;
        while (l.next != null) {
            l = l.next;
            sl = sl.next;

        }
        sl.next = null;
    }
}
public class dellete_in_ll {
    public static void main(String[] args) {
    
    
}
}
