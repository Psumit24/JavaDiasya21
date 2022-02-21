package setdemo;

import java.util.Comparator;

public class WeightComparator implements Comparator<Student1>{
	
	@Override
	public int compare(Student1 s1, Student1 s2) {
		// TODO Auto-generated method stub
	
	
		if (s1.weight < s2.weight)

			return 20;
		else if (s1.weight > s2.weight)

			return -7;
		else
			return 0;
	}
}
