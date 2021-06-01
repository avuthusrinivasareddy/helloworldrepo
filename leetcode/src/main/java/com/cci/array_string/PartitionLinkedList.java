package com.cci.array_string;

/*Partition: Write code to partition a linked list around a value x, such that all nodes less than x come
        before all nodes greater than or equal to x. lf x is contained within the list, the values of x only need
        to be after the elements less than x (see below). The partition element x can appear anywhere in the
        "right partition"; it does not need to appear between the left and right partitions.
        EXAMPLE
        Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition = 5)
        Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8*/

import com.common.LinkedList;
import com.common.LinkedList.*;

public class PartitionLinkedList {


    static void partition(Node root, int x) {
        Node pointer = root;
        Node xPointer = null;
        while(pointer != null) {
            if(pointer.value == x) {
                xPointer = pointer;
                break;
            }
        }

        if(xPointer == null) {
            return;
        }
        pointer = root;
        while(pointer != null) {
            if(pointer.value < xPointer.value) {

            }
        }
    }

    public static void main(String args[]) {
        LinkedList.Node root = LinkedList.createLinkedList(new int[] {3,5,8,5,5,10,2,1});
        partition(root, 5);
    }


}
