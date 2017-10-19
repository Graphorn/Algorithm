package limiao.sword;

/**
 * 结合LeetCode 148. Sort List Sort a linked list in O(n log n) time using
 * constant space complexity.
 * 
 * MergeList，合并两个有序链表，递归和非递归
 */
public class Sw__025_MergeList {
	ListNode mergeIterative(ListNode a, ListNode b) {
		ListNode dummyHead = new ListNode(-1);
		ListNode curr = dummyHead;
		while (a != null && b != null) {
			if (a.val <= b.val) {
				curr.next = a;
				a = a.next;
			} else {
				curr.next = b;
				b = b.next;
			}
			curr = curr.next;
		}
		curr.next = a != null ? a : b;
		return dummyHead.next;
	}

	/**
	 * 和剑指offer上讲解相同
	 */
	public ListNode mergeRecursive(ListNode list1, ListNode list2) {
		if (list1 == null)
			return list2; // 判断到某个链表为空就返回另一个链表。如果两个链表都为空呢？没关系，这时候随便返回哪个链表，不也是空的吗?
		if (list2 == null)
			return list1;
		ListNode list0 = null;// 定义一个链表作为返回值
		if (list1.val < list2.val) {// 判断此时的值，如果list1比较小，就先把list1赋值给list0，反之亦然
			list0 = list1;
			list0.next = mergeRecursive(list1.next, list2);// 做递归，求链表的下一跳的值
		} else {
			list0 = list2;
			list0.next = mergeRecursive(list1, list2.next);
		}
		return list0;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
