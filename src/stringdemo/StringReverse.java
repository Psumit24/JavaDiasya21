package stringdemo;

public class StringReverse {
	public void approch1() {
		String s = "Hello";
		String sc = new String("Sumit");
		System.out.println(s);
		s = s.concat(sc);
		System.out.println(s);
		System.out.println(s.indexOf("t"));
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
	}

	public void approch2StringReverse() {
		String st1 = "hello", nt1 = "";
		char ch;
		System.out.println("st1: " + st1);
		for (int i = 0; i < st1.length(); i++) {
			ch = st1.charAt(i);
			nt1 = ch + nt1;

		}
		System.out.println("nt1: " + nt1);
	}

	public void reverseString() {
		String sct = "Sumit";
		char[] try1 = sct.toCharArray();
		System.out.println(try1);
		for (int i = try1.length - 1; i >= 0; i--) {
			System.out.print(try1[i]);
		}

	}

	public static void main(String[] args) {
		new StringReverse().approch1();
		 new StringReverse().approch2StringReverse();
		new StringReverse().reverseString();
	}

}
