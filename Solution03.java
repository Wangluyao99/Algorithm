/*
��Ŀ������һ�������������β��ͷ��˳�򷵻�һ��ArrayList��

˼·������ջ�Ƚ�������ص㡣
*/

/*
	public class ListNode{
		int val;
		ListNode next=null;
		ListNode(int val){
			this.val=val;
		}
	}
*/

import java.util.*;
public class Solution03{
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
		Stack<Integer> s =new Stack<Integer>();
		if (listNode = null){
			return new ArrayList();
		}
		s.push(listNode.val);

		while (listNode.next != null){
			listNode=listNode.next;
			s.push(listNode.val);
		}
		ArrayList<Integer> arrayList=new ArrayList<Integer>(s.size());
		while (!s.empty()){
			arrayList.add(s.pop());
		}
		return arrayList;
	}

}

