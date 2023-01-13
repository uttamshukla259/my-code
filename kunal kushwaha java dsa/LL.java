public class LL {
    class node {
        int data;
        node next;

        node(int val) {
            data = val;
            next = null;
        }
    }


        node head ;

        void print() {
            node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void insertAtHead(int data) {
            node temp = new node(data);
            if (head == null) {
                head = temp;
                return;
            }
            temp.next = head;
            head = temp;
        }

        void deleteAtFirst() {
            if (head == null)
                return;
            else
                head = head.next;
        }

        void deleteAtTail() {
            if (head == null) {
                return;
            }
                if (pre == null) {
                head = head.next;
                return;
            }
            node curr = head, pre = null;
            while (curr.next != null) {
                pre = curr;
                curr = curr.next;
            }
           
            pre.next = null;

        }

        void insertAtTail(int data) {
            node temp = new node(data);

            if (head == null) {
                head = temp;
                return;
            }
            node curr = head;
            while (curr.next != null)
                curr = curr.next;

            curr.next = temp;

        }
    

    public class Main {
        public static void main(String[] args) {
        LL list = new LL();
            list.insertAtHead(5);
            list.insertAtHead(1); 
            list.insertAtHead(21);
            list.insertAtTail(123);
            list.deleteAtTail();
            list.print();
        }
    }
}
