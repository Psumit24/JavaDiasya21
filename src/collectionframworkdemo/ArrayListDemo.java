
package collectionframworkdemo;

import java.util.ArrayList;

public class ArrayListDemo {//backe end  data base dynamic array-random access possible, insertion/deletion order preserved-costly
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList<Comparable> al = new ArrayList<Comparable>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add("Hello");
		al.add("A");
		al.add(true);
		al.add(60);
		al.add(60);
		ArrayList<Object> ax = new ArrayList<Object>(al);
		ax.add(al);
		ax.add(30);
		//System.out.println(((ArrayList)ax.get(0)).get(1));
	//System.out.println(ax);
		//System.out.println("is Empty:" +al.isEmpty());
		//al.remove((Object) 60);

		//System.out.println(al.get(6)); Random access possible in array list coolection interface array list linklist 
//System.out.println(ax);
	}
}
