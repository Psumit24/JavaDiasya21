package setdemo;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Sortedseddem {
	public static void main(String[] args) {

		Integer[] x = { 21, 12, 9, 19, 19, 11, 21, 7, 21, 45, 46, 47 };
		List<Integer> al = Arrays.asList(x);
		System.out.println("Pass array in " + al);
		TreeSet<Integer> ts = new TreeSet<Integer>(al);
		System.out.println("Sorting remove Common elements:-" + ts);

		// TreeSet<Integer> ts =new TreeSet<Integer> ();
		// for (int i = 0; i < x.length; i++) {
		// ts.add(x[i]);
//	}
		System.out.println("Second Max No. From array:-"+ts.headSet(ts.last()).last());

	}

}
