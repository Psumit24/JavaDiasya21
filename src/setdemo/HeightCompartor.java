package setdemo;

import java.util.Comparator;

public class HeightCompartor implements Comparator<Student1> {

	@Override
	public int compare(Student1 s1, Student1 s2) {
		// TODO Auto-generated method stub
		if (s1.height < s2.height)

			return 20;
		else if (s1.height > s2.height)

			return -7;
		else
			return 0;

	}

}
