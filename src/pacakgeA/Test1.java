package pacakgeA;

public class Test1 {
	public void createPyramid(int height, int type) {
		for (int i = 0; i <= height; i++) {
			for (int space = i; space <= height; space++) {
				System.out.print(" ");
			}
			if (type == 1) {
				for (int ast = 0; ast < i; ast++)
					System.out.print("* ");

			} else if (type == 2) {
				for (int digit = 0; digit <= i; digit++)
					System.out.print(digit + " ");
			} else if (type == 3) {
				for (char character = 'A'; character <= 'A' + i; character++)
					System.out.print(character + " ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		Test1  t = new Test1();
		t.createPyramid(5, 3);
	}
}

