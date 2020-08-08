package com.avuthu.leetcode.easy;

public class SwapNodes {
	public static ListNode swapPairs(ListNode head) {
        ListNode currentNode = head;
        ListNode previousNode = null;
        ListNode currentHead = head.next;
        while(currentNode != null) {
            ListNode nodeA = currentNode;
            ListNode nodeB = currentNode.next;
            ListNode nodeC = nodeB.next;
            
            nodeB.next = nodeA;
            nodeA.next = nodeC;
            
            if(previousNode == null) {
            	previousNode = nodeA;
            } else {
            	previousNode.next = nodeB;
            	previousNode = currentNode;
            }
            
            if(nodeC == null) {
                nodeA.next = null;
                break;
            }
            
            currentNode = nodeC;        
        }
        return currentHead;
    }

	public static void main(String[] args) {
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, 
				new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(8, null))))))));
		ListNode currentHead = swapPairs(head);
		
		System.out.print(currentHead);
	}

}
