package stringdemo;

public class StringPalindrome {
	public static boolean isPalindrome(String str) {
		int i =0, j=str.length()-1;
		while (i<j) {
			if (str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;

	}
	
	 public static void main(String[] args)
	    {
	        String str = "geeks";
	        String str2 = "racecar";
	 
	        // For string 1
	        System.out.print("String 1 :");
	 
	        if (isPalindrome(str))
	            System.out.print("It is a pallindrome");
	        else
	            System.out.print("It is not a pallindrome");
	 
	        // new line for better readability
	        System.out.println();
	 
	        // For string 2
	        System.out.print("String 2:");
	        if (isPalindrome(str2))
	            System.out.print("It is a pallindrome");
	        else
	            System.out.print("It is not a pallindrome");
	    }
	}

