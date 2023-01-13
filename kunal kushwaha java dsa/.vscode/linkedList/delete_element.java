
import java.util.*;
import java.lang.*;
import java.io.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class LinkedList {
    Node head;

    // add at last
    void addLast(int x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

    // delete at ith index

    void deleteNode(int index) {
        if (index == 0) {
            head = head.next;
            return;
        }
        int i = 0;
        Node curr = head, prev = null;

        while (i < index && curr.next != null) {
            prev = curr;
            curr = curr.next;
            i++;
        }

        prev.next = curr.next;
        return;
    }

    // print the LL
    void print() {
        if (head == null)
            return;

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class delete_element {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList a = new LinkedList();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            a.addLast(x);
        }
        int index = sc.nextInt();
        a.deleteNode(index);
        a.print();

    }
}

