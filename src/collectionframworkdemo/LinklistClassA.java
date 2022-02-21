package collectionframworkdemo;

import java.util.LinkedList;

public class LinklistClassA {//back end data structure doubly link list, random access not possible, insertion/deletion order preserved-easy
public static void main(String[] args) {

	@SuppressWarnings("rawtypes")
	LinkedList<Comparable> l = new LinkedList<Comparable>();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(40);
	l.add("Hello");
	l.add("Hello");
	//l.add(0, 55);
	
//	LinkedList al = new LinkedList();
	//al.add(50);
	//al.add(60);
//	al.add(70);
	//al.add(20);
//	al.add(null);
//	al.add(l);
	System.out.println(l);
System.out.println(l.indexOf(30));
	System.out.println(l.set(0, 20));
	
	//System.out.println(l.get(2));//random access not possible but insertion and deletion possible 
	//System.out.println(l.addAll(2, al));
//System.out.println(al.removeFirst());
//System.out.println(al.removeLast());
//System.out.println(al.indexOf(20));
//System.out.println(al.subList(0, 4));
}
}
