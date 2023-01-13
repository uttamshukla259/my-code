
import java.lang.*;
import java.io.*;
import java.util.*;
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

    // insert at head 
    void athead(int x) {
        node last = new node(x);
        if (head == null) {
            head = last;
            return;
        }
        last.next = head;
        head = last;
        // size++;
    }

    // insert at last;
    void atlast(int x) {
        node temp = new node(x);
        if (head == null) {
            head =temp;
            return;
        }
        node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        // size++;
    }

    // print reverse;
    void reverse() {
        if (head == null) {
            return;
        }

        node prev = head;
        node curr = head.next;
        while (curr != null) {
            node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;
    }

    // print;
    void print() {
        if (head == null) {
            return;
        }
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    // delete at index
    void deleteatindex(int x) {
        if (x == 0) {
            head = head.next;
            return;
        }
        int i = 0;
        node curr = head, prev = null;
        while (i < x && curr.next != null) {
            prev = curr;
            curr = curr.next;
            i++;
        }
        prev.next = curr.next;
        return;
    }

    // delet at last
    void deletlast() {
        if (head == null) {
            return;
        }
        // size--;
        if (head.next == null) {
            head = null;
            return;
        }
        node curr = head;
        node last = head.next;
        while (last.next != null) {
            last = last.next;
            curr = curr.next;
        }
        curr.next = null;
    }

    //  insert at index
    // void insertatindex(int val, int index) {
    //     if (head == null) {
    //         list.athead(val);
    //         return;
    //     }
    //     if (index == size) {
    //         atlast(val);
    //         return;
    //     }
    //     node temp = head;
    //     for (int i = 1; i < index; i++) {
    //         temp = temp.next;
    //     }
    //     node newnode = new node(val, temp.next);
    //     temp.next = newnode;
    //     size++;
    // }

    // public int getsize() {
    //     return size;

    // }
    //  compair two ll
    
}

public class revers_a_ll {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        ll list = new ll();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            list.atlast(x);
        }
        
        // list.reverse();
        //  int d = sc.nextInt();
        //  list.deleteatindex(d);
        // list.deletlast();
        // int val = sc.nextInt;
        // int index = sc.nextInt;
        // list.insertatindex(val, index);
        list.print();
    }
}
