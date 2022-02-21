package setdemo;
	import java.util.Iterator;
	import java.util.TreeSet;
	/**
	 * 
	 * @author sumit
	 *
	 */
	public class Setdemo1 {
		public static void main(String[] args) {
			Student1 s1 = new Student1(56.7f, "Sumit", "9029253484", "sumit.pakhare@gmail.com", 181.0f,95.0f);
			Student1 s2 = new Student1(60.7f, "Sheetal", "9970566202", "sheetal.pakhare@gmail.com", 160.7f,80.0f);
			Student1 s3 = new Student1(44.7f, "Rohit", "9725252525", "rohit.pakhare@gmail.com", 170.0f,75.0f);
			Student1 s4 = new Student1(66.7f, "Amit", "9898989898", "amit.pakhare@gmail.com", 160.0f,85.0f);
			Student1 s5 = new Student1(23.7f, "Prit", "9895253461", "prit.pakhare@gmail.com", 200.2f,50.0f);
		//	TreeSet<Student1> ts = new TreeSet<Student1>(new HeightCompartor());
		//	TreeSet<Student1> ts = new TreeSet<Student1>(new WeightComparator());
			TreeSet<Student1> ts =new TreeSet<Student1>(new NameComparator());
			ts.add(s1);
			ts.add(s2);
			ts.add(s3);
			ts.add(s4);
			ts.add(s5);
			Iterator<Student1> itr = ts.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next().name);
			}
		}
	}


//comaprable -design to provide ability  to the objects to compare themselfs to another object
//comparatore-can externally compare to given object with same data type.	
	