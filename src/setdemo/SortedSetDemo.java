package setdemo;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * 
 * @author sumit
 *
 */
public class SortedSetDemo {

	public static void main(String[] args) {
		Student s1 = new Student(56.7f, "Sumit", "9029253484", "sumit.pakhare@gmail.com", 181.0f);
		Student s2 = new Student(60.7f, "Sheetal", "9970566202", "sheetal.pakhare@gmail.com", 160.7f);
		Student s3 = new Student(44.7f, "Rohit", "9725252525", "rohit.pakhare@gmail.com", 170.0f);
		Student s4 = new Student(66.7f, "Amit", "9898989898", "amit.pakhare@gmail.com", 160.0f);
		Student s5 = new Student(23.7f, "Prit", "9895253461", "prit.pakhare@gmail.com", 80.2f);
		TreeSet<Student> ts = new TreeSet<Student>();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		Iterator<Student> itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().name);
		}
	}
}
//