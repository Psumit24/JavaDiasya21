package progarmaoct2021;


public class Star02 {
public void starPattern02() {
for (int i = 1; i <=5; i++) {
	System.out.println(" ");
	for (int j = 5; j >=i; j--) {
		System.out.print("*");
	}
}
}
public static void main(String[] args) {
	new Star02().starPattern02();
}
}
