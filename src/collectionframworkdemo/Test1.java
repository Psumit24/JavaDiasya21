package collectionframworkdemo;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		
	
	Scanner in = new Scanner(System.in); 
  while (in.hasNext()) {
        if (in.hasNextInt())
            System.out.println(in.nextInt());
        else 
            in.next();
        
    }
  in.close();
}
}