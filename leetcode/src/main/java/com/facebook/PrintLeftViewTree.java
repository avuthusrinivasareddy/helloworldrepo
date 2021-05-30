package com.facebook;

import com.common.*;

public class PrintLeftViewTree {
    private static int maxDepth = 0;
    static void printLeftView(Node node, int currentDepth) {
        if(node == null) {
            return;
        }
        if(maxDepth < currentDepth) {
            System.out.print(" "+node.data);
            maxDepth = currentDepth;
        }
        printLeftView(node.left, currentDepth+1);
        printLeftView(node.right, currentDepth+1);

    }


    public static void main(String args[]) {
        /*
          12
       10    30
           25   40
        */
        Node root = new Node(12);
        root.left = new Node(10);
        root.right = new Node(30);
        root.right.left = new Node(25);
        root.right.right = new Node(40);
        printLeftView(root, 1);
    }
 }
