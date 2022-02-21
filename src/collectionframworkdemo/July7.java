package collectionframworkdemo;

import java.util.Vector;

public class July7 {
public void add(int a,int b){
}
public static void main(String[] args) {
	July7 d = new July7();
	d.add(5, 6);
	
	@SuppressWarnings("rawtypes")
	Vector<Comparable> v = new Vector<Comparable> ();
	v.add(10);
	v.add(20);
	v.add(30);
	v.add(null);
	v.add(40);
	v.add("Hello");
	v.add(50);
	v.add(60);
	v.add(20);
	v.add(21);
	v.add(22);
	v.add(23);
System.out.println(v);
}


}
