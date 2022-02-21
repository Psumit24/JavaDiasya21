package stringdemo;

import java.util.Stack;

public class ReverseaStringusingStack {
public static String reverseString(String str) {
	char[] reverString = new char[str.length()];
	Stack<Character> stack = new Stack<Character>();
	for (int i = 0; i < str.length(); i++) {
		stack.push(str.charAt(i));
	}
	int i = 0;
	while (!stack.isEmpty()) {
		reverString[i++] = stack.pop();
	}
	return new String(reverString);
}
public static void main(String[] args) {
	String str1 = "GeeksForGeeks";
	System.out.println(str1+" <Reverse> " +reverseString(str1));
	String str2 = "Hello World";
	System.out.println(str1+" <Reverse> " +reverseString(str2));
}
}
