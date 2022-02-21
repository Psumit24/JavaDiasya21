package stringdemo;
public class DuplicateCharAddition {
public void m() {
	String s = "SSSsssUUUUuuMMMMmmIIIiiTTTtt";
	for (int i = 0; i < s.length(); i++) {
		int count =1;
		while (s.charAt(i)==s.charAt(i+1)) {
			count++;
			i++;
			if ((i+1)==s.length()) 
				break;
			}
			System.out.print(s.charAt(i)+""+count);
		}
		
	}
public static void main(String[] args) {
	new DuplicateCharAddition().m();
}
}

