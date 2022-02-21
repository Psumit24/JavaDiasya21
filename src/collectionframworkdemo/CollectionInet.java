package collectionframworkdemo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInet {
	public static void main(String[] args) {
//Collection c;
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(80);
		System.out.println("Before al" + al);
		ArrayList<Integer> ax = new ArrayList<Integer>();
		// al.add("Hello");
		// a.add('A');
		ax.add(60);
		// al.add(null);
		// al.add(true);
		ax.add(70);
		ax.add(80);
		ax.add(80);
		ax.addAll(al);
		System.out.println("Array:" + ax);
		ax.toArray();
		// ax.retainAll(al);
		// al.add(null);
		// ax.addAll(al);
		// System.out.println("Retain:" +ax);
		// System.out.println("contain all:" +ax.containsAll(al));
		// ax.removeAll(al);
		// System.out.println("Before" +al);
		// al.clear();
		// System.out.println("After" +al);
		// System.out.println("contain:" +al.contains(20));
		// System.out.println("is Empty:" +al.isEmpty());
		System.out.println(ax);
		al.get(4);
		System.out.println("Get:-" + ax.get(6));
	}

}
