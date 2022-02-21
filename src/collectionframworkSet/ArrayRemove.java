package collectionframworkSet;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayRemove {
	public static void main(String[] args) {

		Integer[] x = { 1, 2, 2, 3, 4, 5, 6, 7, 7 };
		HashSet<Integer> hs = new HashSet<Integer>(Arrays.asList(x));
		System.out.println(hs);
		// System.out.println("Unique elements are:" +hs);
		x = new Integer[hs.size()];
		for (int i = 0; i < hs.size(); i++) {
			x[i] = (Integer) hs.toArray()[i];
		}
		Arrays.sort(x);
		System.out.println("After Sorting:" + Arrays.asList(x));
		System.out.println("Secong Max Element: " + x[x.length - 2]);

	}
}
