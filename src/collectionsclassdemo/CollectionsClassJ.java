package collectionsclassdemo;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassJ {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(70);
	al.add(40);
	al.add(50);
	al.add(60);
	al.add(70);
	System.out.println(al);
	Collections.sort(al);
	System.out.println(al);
}
}
