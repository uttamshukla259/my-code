public class all_about_LL {
    class node {
        int data;
        node next;

        node(int x) {
            data = x;
            next = null;
        }
    }
       
    node head;
     
    // print ll
    void print() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.err.println();
    }
    // add at head
    void addfirst(int x) {
        node temp = new node(x);
        if (head == null) {
            head = temp;
            return;
        }
        temp.next = head;
        head = temp;
    }
     
    // add at last;
    void addlast(int x) {
        node temp = new node(x);
        if (head == null) {
            head = temp;
            return;
        }
        
    }
}
