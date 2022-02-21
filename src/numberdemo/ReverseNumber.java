package numberdemo;

import java.util.Scanner;

public class ReverseNumber {
	int number, reverse = 0;

	public void reverseNumber1() {
		int number = 12345;
		while (number != 0) {
			int reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number = number / 10;
		}
		System.out.println("Reverse Number is:" + reverse);
	}

	public void reverseNumber2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number>>:");
		number = sc.nextInt();
		System.out.println("Enter the Number is:" + number);
		sc.close();
		while (number != 0) {
			int reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number = number / 10;
		}
		System.out.println("Reverse Number is  :" + reverse);
	}

	public static void main(String[] args) {
		new ReverseNumber().reverseNumber1();
		new ReverseNumber().reverseNumber2();
	}
}
