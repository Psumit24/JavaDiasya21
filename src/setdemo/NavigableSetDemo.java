package setdemo;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class NavigableSetDemo {
	public static void main(String[] args) {

		Integer[] x = { 21, 12, 9, 19, 19, 11, 21, 7, 21, 45, 46, 47 };
		List<Integer> al = Arrays.asList(x);
		System.out.println("Pass array in " + al);
		TreeSet<Integer> ts = new TreeSet<Integer>(al);

		System.out.println("Sorting remove Common elements:-" + ts.lower(ts.last()));
		System.out.println("Sorting remove Common elements:-" + ts.floor(ts.last()));
		System.out.println("Sorting remove Common elements:-" + ts.size());
		System.out.println("Sorting remove Common elements:-" + ts.first());
		System.out.println("Sorting remove Common elements:-" + ts.pollLast());
	}
}
