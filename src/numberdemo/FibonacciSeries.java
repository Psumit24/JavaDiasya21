package numberdemo;

import java.util.Scanner;

public class FibonacciSeries {
	int count, num1 = 0, num2 = 1;

	public void fibonacciSeries01() {
		int count = 5;
		System.out.print("Fibonacci Series of " + count + " numbers:");
		int i = 1;
		while (i <= count) {
			System.out.print(num1 + " ");
			int sumofPreNum = num1 + num2;
			num1 = num2;
			num2 = sumofPreNum;
			i++;
		}

	}

	public void fibonacciSeries02() {
		System.out.println("How may numbers you want in the sequence:");
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		sc.close();
		System.out.print("Fibonacci Series of " + count + " numbers:");
		int i = 1;
		while (i <= count) {
			System.out.print(num1 + " ");
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			i++;

		}
	}
	public void m1() {
int count =10;
		System.out.println(count);
		int i=1;
		while(i<=count) {
		System.out.print(num1 + " ");
		int num3=num1+num2;
		num1=num2;
		num2=num3;
		i++;
	}
	}
	public static void main(String[] args) {
		// new FibonacciSeries().fibonacciSeries01();
		new FibonacciSeries().m1();
	}
}
