package collectionframworkSet;

import java.util.HashSet;

public class HashSetA {
public static void main(String[] args) {
	@SuppressWarnings("rawtypes")
	HashSet<Comparable> hs = new HashSet<Comparable>(10,0.80f);
	hs.add(10);
	hs.add(10);
	hs.add(20);
	hs.add("ABC");
	hs.add(3.14f);
	hs.add(true);
	hs.add(128l);
	hs.add(null);
	hs.add(null);
	//boolean isInserted =hs.add(128l);
	System.out.println(hs);
	//System.out.println(isInserted);
}
}
