package collectionframworkdemo;

public class JavaGeneric {
	public static void main(String[] args) {

		int x = 10, y = 20;
		if (Integer.compare(x, y) == 0) {
			System.out.println("Both number are equal");
		} else if (Integer.compare(x, y) < 0) {
			System.out.println(x + " is smaller");
		} else {
			System.out.println(y + " is bigger");

		}
	}
}
