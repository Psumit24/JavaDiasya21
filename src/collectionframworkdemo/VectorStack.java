package collectionframworkdemo;

import java.io.Closeable;
import java.util.Iterator;
import java.util.Vector;

public class VectorStack {
	public static void main(String[] args) {
		//ArrayList al = new ArrayList<>();
		Vector<Integer> al = new Vector<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		for (Object o : al) {
			//al.add(21);
			//System.out.println((int) o);
			//al.remove(3);
		//Enumeration en =al.elements();
		//while (en.hasMoreElements()) {
			//System.out.println(en.nextElement());
		//}
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
		
		
			Object in =itr.next();
		//al.remove(0);
			
			System.out.println(in);
		}
		}
		//System.out.println(al);
		//ListIterator ltr = al.listIterator();
		//while (ltr.hasNext()) {
		//	System.out.println(ltr.hasNext());
		//al.remove(30);
		//System.out.println(al);
		//}
		//}
	}}

