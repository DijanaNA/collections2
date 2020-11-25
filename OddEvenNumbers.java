package collections2;

import java.util.Iterator;
import java.util.LinkedList;

public class OddEvenNumbers {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> odd = new LinkedList<Integer>();
		LinkedList<Integer> even = new LinkedList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		/*
		 * Iterator i = list.iterator(); int counter = 0; while (i.hasNext()) {
		 * System.out.println("count: " + counter);
		 * System.out.println(list.get(counter)); if (list.get(counter) % 2 == 0) {
		 * even.add(list.get(counter)); } else { odd.add(list.get(counter)); }
		 * 
		 * counter++; }
		 */
		
		for (Iterator i = list.iterator(); i.hasNext();) {
	         System.out.println("i.next()  " + i.next());
	     }
		
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				even.add(list.get(i));
			} else {
				odd.add(list.get(i));
			}
		}

		System.out.println("Even: " + even);
		System.out.println("Odd: " + odd);
	}
}
