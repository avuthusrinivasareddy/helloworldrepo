package com.common;

public class LinkedList {
    public static class Node {
        public Node(int value) {
            this.value = value;
        }
        public int value;
        public Node next;

        public String toString() {
            Node current = this;
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            while(current != null) {
                sb.append(current.value);
                current = current.next;
                if(current != null) {
                    sb.append(',');
                }
            }
            sb.append(']');
            return sb.toString();
        }
    }

    public static Node createLinkedList(int[] values) {
        Node root = null;
        Node current = null;
        for(int value: values) {
            if(root == null) {
                root = new Node(value);
                current = root;
            } else {
                Node node = new Node(value);
                current.next = node;
                current = node;
            }
        }
        return root;
    }

    public static void printLinkedList(Node root) {
        while(root != null) {
            System.out.print(root.value+" ");
            root = root.next;
        }
        System.out.print('\n');
    }

    public static Node reverseLinkedList(Node root) {
        Node current = root.next;
        Node previous = root;
        while(current != null) {
            Node next = current.next;
            current.next = root;
            previous.next = next;
            root = current;
            current=next;
        }
        return root;
    }

    public static Node sortLinkedList(Node root) {
        Node i = root;
        Node iPrevious = null;
        Node iNext = root.next;
        while (iNext != null) {
            Node j = iNext;
            Node jPrevious = i;
            while(j!=null) {
                Node jNext = j.next;
                if(i.value > j.value) {
                    if(iPrevious == null) {
                        //swapping with root node
                        j.next=i.next;
                        if(jPrevious != i) {
                            jPrevious.next = i;
                        }
                        i.next = jNext;
                        root = j;
                    }
                }
            }
        }
    }

    public static void main(String args[]) {
        Node root = createLinkedList(new int[] {1,2,3,4,5,6,7,8,9});
        printLinkedList(root);
        Node newRoot = reverseLinkedList(root);
        printLinkedList(newRoot);
    }
}
