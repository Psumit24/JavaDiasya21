package progarmaoct2021;


public class Star01 {
	
public void starPattern1() {
for (int i = 1; i <=5; i++) {
	System.out.println(" ");

for (int j = 1; j <=i; j++) {
	System.out.print(" *");
}
}
}
public static void main(String[] args) {
	new Star01().starPattern1();
}	
}
