package com.leetcode.merge_list;

/**
 * 力扣第21题，合并两个有序链表
 * 解题思路：使用递归，每次将最小的数排好序
 * 递归要素：
 * ①终止条件：设两个链表分别为l1和l2，则终止条件为当l1和l2其中一个为空的时候终止
 * ②本层处理逻辑：将l1.val与l2.val进行比较，并取小的那个与已经排好的链表头进行连接
 * ③返回值：返回排序好的链表头
 * @author dumaokun
 *
 */
public class Solution {

	public static void main(String[] args) {

		ListNode node13 = new ListNode(2);
		ListNode node12 = new ListNode(1,node13);
		ListNode node11 = new ListNode(0,node12);
		
		ListNode node23 = new ListNode(4);
		ListNode node22 = new ListNode(3,node23);
		ListNode node21 = new ListNode(2,node22);
		
		ListNode result = mergeTwoLists(node11, node21);
		while (result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
	}
	
	/**
	 * 合并两个有序链表
	 * @param l1：链表1
	 * @param l2：链表2
	 * @return 合并好的链表的头节点
	 */
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		//1.终止条件：当l1、l2其中一个为空，则返回另一个
		if (l1 == null) return l2;
		if (l2 == null) return l1;
		
		if (l1.val < l2.val) {
			//2：每次递归，取两个链表中的最小值的小者，并与已经生成好的链表头进行连接
			l1.next = mergeTwoLists(l1.next, l2);
			//3：返回值：返回排序好的链表头
			return l1;
		} else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
    }
}
