package setdemo;

public class Student implements Comparable<Student> {
	float marks;
	String name;
	String phoneNumber;
	String email;
	float height;
	float weight;

	public Student(float marks, String name, String phoneNumber, String email,float height) {
		super();
		this.marks = marks;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.height=height;
	}

@Override
public int compareTo(Student student) {
	if (this.height<student.height) 
		return -70;
	 else if(this.height>student.height)
		 return 200;
	 else
		 return 0;

	}
}
