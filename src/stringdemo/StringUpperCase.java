package stringdemo;

public class StringUpperCase {
	public static void main(String[] args) {

		String s = "i love my shital";
		String[] words = s.split(" ");
		for (int i = 0; i < words.length; i++) {
			words[i] = new String(words[i].replace(words[i].charAt(0), 
					Character.toUpperCase(words[i].charAt(0))));
			System.out.print(words[i] + " ");
		}
	}
}