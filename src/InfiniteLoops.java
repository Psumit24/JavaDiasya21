public class InfiniteLoops {
	public void m1() {
for (;;) {
	System.out.println("A");
}
	}
public static void main(String[] args) {
	String x = "abc";
	String y = "abc";
	x.concat(y);
	System.out.println(x);
	new InfiniteLoops().m1();
}
}
