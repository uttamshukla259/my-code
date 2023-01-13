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
//  print
        void print() {
            node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.err.println();
        }
        
        // add at head;
        void addhead(int x) {
            node newnode = new node(x);
            if (head == null) {
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }
        // add last
        void atlast(int x) {
            node temp = new node(x);
            if (head == null) {
                head = temp;
                return;
            }
            node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = last;
        }
        // delet at head;
        void delethead() {
            if (head == null) {
                return;
            }
            head = head.next;
        }

        //  delet at last;
        void deletlast() {
            if (head == null) {
                return;
            }
            if(head.next== null){
                head = null;
                return;
            }
            node curr = head;
            node last = head.next;
            while(last.next!=null){
            last = last.next;
            curr = curr.next;
            }
            curr.next = null;
        }
        //   void reverse
        void reverse() {
            node prev = head;
            node curr = head.next;
            while (curr != null) {
                node next = curr.next;
                curr.next = prev;
                //  upade
                prev = curr;
                curr = next;
            }
            head.next = null;
            head = prev;
        }
         
        // delete at index;

        void deleteatindex(int x) {
            if (x == 0) {
                head = head.next;
                return;
            }
            int i = 0;
            node curr = head,last= head.next;
            while (i < x && last.next != null) {
                last = last.next;
                curr = curr.next;
                i++;
            }
            curr.next = last.next;
            return;
        }

    }



public class linkedlistaccio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ll list = new ll();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            list.atlast(x);
        }
        list.reverse();
        list.print();
    }
}
