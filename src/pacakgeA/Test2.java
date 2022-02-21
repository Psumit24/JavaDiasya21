package pacakgeA;

public class Test2{
	public void createPyramid(int height, int type) {
		for (int i = 0; i < height; i++) {
			for (int space = 0; space <i; space++) {
				System.out.print(" ");
			
			}
			if (type == 1) {
				for (int ast = height; ast > i ; ast--) {
					System.out.print("* ");		
				}
					
				
			} else if (type == 2) {
				for (int digit = height; digit > i; digit--) {
					System.out.print(digit + " ");
				}
			} else if (type == 3) {
			for (char character = (char) ('A'+ height-1); character >= 'A' +i; character--){
					System.out.print(character +" "  );
			}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Test2 t = new Test2();
		t.createPyramid(3, 3);  
	}
}