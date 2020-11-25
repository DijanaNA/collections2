package collections2;

import java.util.LinkedList;

public class ReverseCharacters {
	public static void main(String[] args) {
		// A B C D E
		// D C B
		LinkedList<Character> list = new LinkedList<Character>();
		LinkedList<Character> result = new LinkedList<Character>();

		list.add('A');
		list.add('B');
		list.add('C');
		list.add('D');
		list.add('E');
		System.out.println(list);

		for (Character character : list) {
			// D C B
			// 1. removeFirst
			// 2. removeLast
			// 3.reverseList
			if (character != 'A' && character != 'E') {
				System.out.println(character);
				result.addFirst(character);
			}
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println(result);

	}
}
