package com.avuthu.leetcode.easy;

public class SwapNodes {
	/*public static ListNode swapPairs(ListNode head) {
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
    }*/

	public static void main(String[] args) {
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, 
				new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(8, null))))))));
		ListNode currentHead = swapPairs(head);

        ListNode head2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,
                new ListNode(5, new ListNode(6, new ListNode(7, null)))))));
        ListNode currentHead2 = swapPairs(head2);

		System.out.print(currentHead2);
	}

    public static ListNode swapPairs(ListNode head) {
	    if(head == null) {
	        return null;
        }
        ListNode previousNode = null;
        ListNode currentNode = head;
        ListNode nextNode = head.next;

        while(currentNode != null && currentNode.next != null) {
            ListNode temp = nextNode.next;
            if(previousNode != null) {
                previousNode.next = nextNode;
                nextNode.next = currentNode;
                currentNode.next = temp;
            } else {
                head = nextNode;
                nextNode.next = currentNode;
            }
            previousNode = currentNode;
            currentNode = temp;
            if(temp != null) {
                nextNode = currentNode.next;
            }
        }
        return head;
    }

}
