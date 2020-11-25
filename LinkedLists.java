package collections2;

import java.util.LinkedList;

public class LinkedLists {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.addFirst(1);//1
		list.addFirst(2);//2->1
		list.addFirst(3);//3->2->1
		
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list);
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.addLast(1);//1
		list2.addLast(2);//1->2
		list2.addLast(3);//1->2->3
		System.out.println(list2);
	}
}
