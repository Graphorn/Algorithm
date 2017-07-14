package limiao.algorithm.leetcode;

/**
 * 24. Swap Nodes in Pairs
 * @author seektech
 * @time Dec 7, 2016 8:34:26 PM
 */
public class No_024_SwapNodesInPairs {

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
    public ListNode swapPairs(ListNode head) {
    	if(head==null || head.next==null) return head;
    	
    	ListNode f = new ListNode(-1);// 利用f将每对转换后的对象串联起来
    	f.next = head;
    	ListNode s = f;
    	
    	while(head.next != null){
    		ListNode tmp = head.next;
    		head.next = tmp.next;
    		tmp.next = head;
    		f.next = tmp;
    		if(head.next != null && head.next.next != null){
    			f = head;
    			head = head.next;
    		}
    		else break;
    	}
    	
        return s.next;
    }
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
}
