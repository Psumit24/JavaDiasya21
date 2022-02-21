package numberdemo;

import java.util.Scanner;

public class FindFactorialNo {
	int i, fact = 1;

	public void factorialNo() {
		int number = 5;
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Facrorial of Number:" + fact);
	}

	public void inputFromScann() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");  
		int number = sc.nextInt();
		System.out.println("Enter number:...."+number);
		for (i = 1; i <= number; i++) {
			fact = fact * i;
			sc.close();
		}
		System.out.println("Facrorial of Number:" + fact);
		
	}

	public static void main(String[] args) {
		 new FindFactorialNo().factorialNo();
		new FindFactorialNo().inputFromScann();
	}
	
}