package numberdemo;

public class SumOfArrayElement {
	public static void main(String[] args) {
		int sum = 0;
		int a[] = { 10, 20, 30 };
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		/*
		 * Scanner s = new Scanner(System.in);
		 * System.out.print("Enter no. of elements you want in array:"); n =
		 * s.nextInt(); int a[] = new int[n];
		 * System.out.println("Enter all the elements:"); for (int i = 0; i < n; i++) {
		 * a[i] = s.nextInt(); sum = sum + a[i]; s.close();}
		 */

		System.out.println("Sum:" + sum);
	}

}
