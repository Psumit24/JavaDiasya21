package collectionframworkSet;

import java.util.LinkedHashSet;

public class CapacityA {
	public static <E> void main(String[] args) {
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		/*hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(60);
		hs.add(70);
		hs.add(70);
		hs.add(70);*/
		hs.add("Null");
		hs.add("Null");
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
	}

}
