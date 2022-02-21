package collectionsclassdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayMapMax {
	public static void main(String[] args) {

		List<String> al = new ArrayList<String>();

		al.add("Sachin");
		al.add("Rohit");
		al.add("Sumit");
		al.add("9029253484");
		al.add("9970566202");
		al.add("1234567890");
		al.add("s@p.gmail.com");
		al.add("r@p.gmail.com");
		al.add("ss@p.gmail.com");

		System.out.println(al);
		List<Integer> ax = new ArrayList<Integer>();
		ax.add(1);
		ax.add(2);
		ax.add(3);
		System.out.println(ax);
		@SuppressWarnings("rawtypes")
		HashMap<List, List> students = new HashMap<>();
		students.put(ax, al);
		System.out.println("Student>>>" + students);
		Set<?> keys = students.entrySet();
		Iterator<?> itr = keys.iterator();
		while (itr.hasNext()) {
			@SuppressWarnings({ "rawtypes", "unchecked" })
			Map.Entry<List, ArrayList<?>> entry = (Map.Entry<List, ArrayList<?>>) itr.next();
			System.out.println("Entry>>>:" + entry);
			ArrayList<?> ay = (ArrayList<?>) entry.getKey();
			ArrayList<?> az = entry.getValue();
			System.out.println(entry.setValue(az));
			System.out.println("ay.." + ay);
			az.get(0);
			System.out.println("az.." + az.get(2));

			for (int i = 0; i < ay.size(); i++) {
				al.iterator().next();
				System.out.println(ay.get(i) + "=" + az.get(i));
			}
		}
	}
}
