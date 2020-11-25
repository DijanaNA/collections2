package collections2;

import java.util.LinkedList;

public class OddEvenNumbers2 {
	public static void main(String[] args) {
		// 12345
		// 24135
		// 42531
		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> result = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		System.out.println(list);
		for (Integer integer : list) {
			if (integer % 2 == 0) {
				result.addFirst(integer);
			} else {
				result.addLast(integer);
			}
		}
		System.out.println(result);
	}
}
