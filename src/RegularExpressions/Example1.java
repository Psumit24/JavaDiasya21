package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {
public static void main(String[] args) {
	Pattern pattern = Pattern.compile("w3school",Pattern.CASE_INSENSITIVE);
	Matcher matcher = pattern.matcher("Visit W3schools!");
	boolean matchfound=matcher.find();
	if (matchfound) {
		 System.out.println("Match found");
    } else {
      System.out.println("Match not found");
	}
}
}
