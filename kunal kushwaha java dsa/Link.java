import java.util.*;
public class Link {
    node head;
    private int size;

    Link(){
        this.size =0;
    }
    class node {
        int data;
        node next;

        node(int x) {
            data = x;
            next = null;
            size++;
        }
    }
    // pirnt 
    void print() {
        node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    //  add at first 
    void addAtFirst(int x) {
        node temp = new node(x);
        if (head == null) {
            head = temp;
            return;
        }
        temp.next = head;
        head = temp;
    }
    // add at last
    void addAtLast(int x) {
        node temp = new node(x);
        if (head == null) {
            temp = head;
            return;
        }
        node current = head;
        while (current.next != null) 
            current = current.next;
            current.next = temp;
        
    }
    // delete at first
    void deleteAtFirst() {
        if (head == null) {
            return;
        }
        size--;
        head = head.next;

    }
    // delete at last
    void deletAtLast() {
        if (head == null) {
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        node secondlast = head, last = head.next;
        while (last.next != null) {
            last = last.next;
            secondlast = secondlast.next;
        }

        secondlast.next = null;
        //    count size;

    }
    
    public int getsize() {
        return size;
    }

    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<Integer>();
        Link list = new Link();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            list.addAtFirst(x);

        }
        list.print();
        l.remove(1);
        // list.print();
        System.err.println(l);
    }
}
