package com.avuthu.leetcode.easy;
/*
 * Remove duplicates from sorted linked list
 */
class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode previousNode = head;
        ListNode currentNode = head.next;
        ListNode distinctNode = head;
        while(currentNode != null) {
            if(currentNode.val != previousNode.val) {
                distinctNode.next = currentNode;
                distinctNode = currentNode;
                
           } 
           currentNode = currentNode.next;
        }
        return head;
    }
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
	
	public String toString() {
		return val+"ListNode("+next+")";
	}
}