package limiao.algorithm.leetcode;

/**
 * 2. Add Two Numbers
 * You are given two linked lists representing two non-negative numbers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * @author seektech
 * @time Aug 5, 2016 7:32:02 PM
 */
public class No_002_AddTwoNumbers {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int temp = 0;
		ListNode newHead = new ListNode(0);
		ListNode p1 = l1, p2 = l2, p3 = newHead;
		while(p1 != null || p2 != null){
			if(p1 != null){
				temp += p1.val;
				p1 = p1.next;
			}
			if(p2 != null){
				temp += p2.val;
				p2 = p2.next; 
			}
			p3.next = new ListNode(temp%10);
			p3 = p3.next;
			temp /=10;
		}
		return newHead.next;
    }
	public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
	}
}
