package collectionframworkSet;

import java.util.HashSet;
import java.util.Hashtable;

public class HashCodeTableA {
public static void main(String[] args) {
	@SuppressWarnings("rawtypes")
	Hashtable<Comparable, Comparable> hs= new Hashtable<Comparable, Comparable>();
	HashSet d;
	//intital default capacity 11
	hs.put(1, "ABC");
	hs.put(1, "XYZ");
	hs.put("A", 3.14f);
	hs.put(true, 3.84f);
	hs.put("N", 3.14f);
	//hs.put("B", null);
	hs.put(1, "ABC");
	hs.put(5, "ZXY");
	//hs.put(null, 3.14f);-NullPointerException
	try {
		// TODO: handle exception
	hs.put(null, 3.14f);
	}
	catch (Exception e) {
		System.out.println(hs);
	}
}
}
