package collectiond;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	void base() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(26);
		list.add(16);
		list.add(1);
		list.add(11);

		for (int x : list) {
			System.out.println(x);
		}

		list.forEach((y) -> System.out.println(y));//Consumer

		// remove -> index
		// remove -> element

		list.remove((Integer) 120); // element -> boolean
		System.out.println("after remove");
		list.forEach(y -> System.out.println(y));

		// 26 16 1 11
		// i
		// remove all the elements who can divide by 4
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 4 == 0) {
				list.remove(i);
				i--;
			}
		}
		System.out.println("after remove");
		list.forEach(y -> System.out.println(y));

//		list.removeAll(subList); //sublist match with list and remove 

	}

	static void removeWithList() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(26);
		list.add(16);
		list.add(1);
		list.add(11);

		List<Integer> subList = new ArrayList<Integer>();
		subList.add(12);
		subList.add(11);

		list.removeAll(subList);
		System.out.println(list);

	}

	static void removeWithCondition() {
		// for
		// base
		// lambda
		// remove all odd numbers from list using lambda
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(26);
		list.add(16);
		list.add(1);
		list.add(11);
		// Predicate
		list.removeIf(i -> i % 2 != 0);
		System.out.println(list);
	}

	static void printAllEven() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(26);
		list.add(16);
		list.add(1);
		list.add(11);
		// Consumer
		list.forEach(i -> {
			if (i % 2 == 0)
				System.out.println(i);
		});
		System.out.println(list);
	}

	public static void main(String[] args) {

//		add
//		get
//		size
//		forearch
//		removeWithList();
//		removeWithCondition();
		printAllEven();
	}
}
