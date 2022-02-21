package stringdemo;

public class StringNumberAddition {
	int result = 0;
	String s = "TEST12 SU11M123";

	public void stringAddtion01() {
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				result = result + s.charAt(i) - 48;
			}
		}
		System.out.println("Additions:" + result);
	}

	public void stringAddition02() {
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				result = result + Character.getNumericValue(s.charAt(i));
				//result=result+s.charAt(i);
			}
		}
		System.out.println("Additions:" + result);
	}

	public static void main(String[] args) {
		new StringNumberAddition().stringAddtion01();
	}
}