package com.facebook;

import com.common.Node;

public class BinaryTreeTraversal {
    public static Node createBinaryTree() {
        Node root = new Node(1);
        root.left = new Node(2); root.right = new Node(3);

        root.left.left = new Node(4); root.left.right = new Node(5);
        root.right.left = new Node(6); root.right.right = new Node(7);

        root.left.left.left = new Node(8); root.left.left.right = new Node(9);
        root.left.right.left = new Node(10); root.left.right.right = new Node(11);
        root.right.left.left = new Node(12); root.right.left.right = new Node(13);
        root.right.right.left = new Node(14); root.right.right.right = new Node(15);

        return root;
    }

    public static void visit(Node node) {
        System.out.print(node.data+", ");
    }
/*
          1
     2           3
  4    5      6     7
8  9 10 11 12  13 14  15
 */
    //8, 4, 9, 2, 10, 5, 11, 1, 12, 6, 13, 3, 14, 7, 15
    //left => node => right
    public static void inOrderTraversal(Node node) {
        if(node != null) {
            inOrderTraversal(node.left);
            visit(node);
            inOrderTraversal(node.right);
        }
    }

    //node=>left => right
    public static void preOrderTraversal(Node node) {
        if(node != null) {
            visit(node);
            inOrderTraversal(node.left);
            inOrderTraversal(node.right);
        }
    }

    //left => right => root
    public static void postOrderTraversal(Node node) {
        inOrderTraversal(node.left);
        inOrderTraversal(node.right);
        visit(node);
    }

    public static void depthFirstSearch(Node node, int target) {
        if(node != null) {
            if(node.data == target) {
                System.out.println("value found");
                return;
            } else {
                System.out.print(node.data+",");
                depthFirstSearch(node.left, target);
                depthFirstSearch(node.right, target);
            }

        }

    }

    public static void main(String args[]) {
        //inOrderTraversal(createBinaryTree());
        depthFirstSearch(createBinaryTree(), 12);
    }
}