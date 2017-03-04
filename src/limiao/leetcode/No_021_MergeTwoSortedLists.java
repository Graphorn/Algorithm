package limiao.leetcode;

/**
 * 21. Merge Two Sorted Lists
 * @author seektech
 * @time Dec 7, 2016 4:45:50 PM
 */
public class No_021_MergeTwoSortedLists {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	public static void main(String[] args) {
		
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(-1);
		ListNode re = head;
		while(l1 != null && l2 !=null){
			if(l1.val < l2.val){
				head.next = l1;
				head = head.next;
				l1 = l1.next;
			}else{
				head.next = l2;
				head = head.next;
				l2 = l2.next;
			}
		}
		if(l2 != null){
			head.next = l2;
		}
		if(l1 != null){
			head.next = l1;
		}
		return re.next;
    }
	
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
}
