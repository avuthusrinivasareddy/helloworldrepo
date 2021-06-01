package com.common;

public class Node {
    public int data;
    public Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }



    public static void main(String args[]) {
        Integer[][] values = { {1,2,3}, {2,4,5}, {3,6,7}, {4,8,9},  { 5, null, 10}};
    }
}