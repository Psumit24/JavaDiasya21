package demoa;

public class Test1 {
int i=10;
final static int j;
static{j=20;
	}
public static void main(String[] args) {
	Test1 t=new Test1();
	int j=30+2;
	System.out.println(j);
System.out.println(t.i);
}
}
