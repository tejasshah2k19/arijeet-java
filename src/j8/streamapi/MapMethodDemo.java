package j8.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethodDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(10);
		list.add(2);
		list.add(5);
		list.add(3);

		// convert
		List<Integer> sqrOfAllData = list.stream().map((t) -> t * t).collect(Collectors.toList());
		System.out.println(list);
		System.out.println(sqrOfAllData);

		System.out.println( list.stream().filter((t)->t%2==0). collect(Collectors.toList()));
	}
}
