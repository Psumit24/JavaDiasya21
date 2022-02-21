package stringdemo;

public class StringUpperLower {
public static void main(String[] args) {
	String str1 = "I am Don BOss";
	int upperCase=0;
	int lowerCase=0;
	int space =0;
	char [] ch = str1.toCharArray();
	for (char chh : ch) {
		if (chh>='A' && chh<='Z') {
			upperCase++;
		}
		else if(chh>='a'&& chh<='z') {
			lowerCase++;	
		}
		else if(chh>=' '&& chh<=' ') {
			space++;	
		}
		else {
			continue;
		}
	}
		System.out.println("Upper Count..."+upperCase);
		System.out.println("Lower Count..."+lowerCase);
		System.out.println("Space Count..."+space);
	
}
}
