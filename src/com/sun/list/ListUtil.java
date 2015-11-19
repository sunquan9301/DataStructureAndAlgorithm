package com.sun.list;

public class ListUtil {
	public static void printListInfo(ListNode h){
		while(h!=null){
			System.out.print(h.val+",");
			h=h.next;
		}
	}
}
