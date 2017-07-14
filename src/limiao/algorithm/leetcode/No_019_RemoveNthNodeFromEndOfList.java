package limiao.algorithm.leetcode;

/**
 * 19. Remove Nth Node From End of List  
 * Given a linked list, 
 * remove the nth node from the end of list and return its head.
 * For example,
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * Note:
 *   Given n will always be valid.
 *   Try to do this in one pass.
 *   
 * @author seektech
 * Oct 12, 2016 9:50:05 PM
 */
public class No_019_RemoveNthNodeFromEndOfList {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No_019_RemoveNthNodeFromEndOfList instance = new No_019_RemoveNthNodeFromEndOfList();
		No_019_RemoveNthNodeFromEndOfList.ListNode head = instance.new ListNode(1);
		No_019_RemoveNthNodeFromEndOfList.ListNode node1 = instance.new ListNode(2);
		No_019_RemoveNthNodeFromEndOfList.ListNode node2 = instance.new ListNode(3);
		No_019_RemoveNthNodeFromEndOfList.ListNode node3 = instance.new ListNode(4);
		No_019_RemoveNthNodeFromEndOfList.ListNode node4 = instance.new ListNode(5);
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		instance.removeNthFromEnd(head, 2);
	}
	
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	if(head == null) return null;
    	ListNode p1 = head;
    	ListNode p2 = head;
    	for(int i=0; i<n; i++){
    		p1 = p1.next;
    	}
    	if(p1 == null){
    		head = head.next;
    		return head;
    	}
    	while(p1.next !=null){
    		p1 = p1.next;
    		p2 = p2.next;
    	}
    	p2.next = p2.next.next;
    	return head;
    }
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
}
