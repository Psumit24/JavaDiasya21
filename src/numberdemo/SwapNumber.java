package numberdemo;

public class SwapNumber {
	int a=10,b=20,temp;
public void m1() {
temp=a;
a=b;
b=temp;
System.out.println(a);
System.out.println(b);
}
public static void main(String[] args) {
	new SwapNumber().m1();
}
}
