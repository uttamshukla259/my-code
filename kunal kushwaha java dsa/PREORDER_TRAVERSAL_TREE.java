// import java.util.*;

// class node {
//     int data;
//     node left;
//     node rigth;

//     node(int x) {
//         this.data = x;
//         left = null;
//         rigth = null;
//     }
// }


// public class PREORDER_TRAVERSAL_TREE {
//     public static void main(String[] args) {
        
//     }
// }
import java.io.*;
import java.util.*;

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

class BST {
    Node root;

    BST() {
        root = null;
    }

    Node insert(Node node, int val) {
        if (node == null) {
            node = new Node(val);
            return node;
        }
        if (val < node.val) {
            node.left = insert(node.left, val);
        } else {
            node.right = insert(node.right, val);
        }
        return node;
    }
}

public class PREORDER_TRAVERSAL_TREE {
    public static void preOrderTraversal(Node node) {
        if (node == null)
            return;
        System.out.print(node.val + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BST tree = new BST();
        for (int i = 0; i < n; i++) {
            tree.root = tree.insert(tree.root, sc.nextInt());
        }
        preOrderTraversal(tree.root);
    }
}
