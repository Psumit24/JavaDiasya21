package stringdemo;

import java.util.Arrays;

public class RemoveDuplicateChar {
	public void removeDuplicateCharFromString(char str[], int lenth) {
		int index = 0;	int j;
		for (int i = 0; i < lenth; i++) {
			for (j = 0; j < i; j++) {
				if (str[i] == str[j]) {
					break;
				}
			}
			if (i == j) {
				str[index++] = str[i];
			}
		}
		System.out.println(String.valueOf(Arrays.copyOf(str, index)));
	}
	public static void main(String[] args) {
		String info = "javaTpoint is the best learning website";
		char str[] = info.toCharArray();
		int len = str.length;
		new RemoveDuplicateChar().removeDuplicateCharFromString(str, len);
	}
}
