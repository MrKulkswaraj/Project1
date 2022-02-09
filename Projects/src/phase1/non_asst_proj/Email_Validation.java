package phase1.non_asst_proj;

import java.util.regex.*;
import java.util.*;

public class Email_Validation {
	public static void main(String args[]) {
		ArrayList<String> email = new ArrayList<String>();
		email.add("my_name1@gmail.co.in");
		email.add("my_name2@orkut.com");
		email.add("my_name3.name@facebook.com");
		email.add("my_name4#@google.co.in");
		email.add("my_name5@youtube.com");
		email.add("my_name6@microsoft.com");
		// Add invalid emails in list
		email.add("@gmail.My_name.com");
		email.add("not_Available#google.co.in");
		// Regular Expression
		String regex = "^(.+)@(.+)$";
		// Compile regular expression to get the pattern
		Pattern p1 = Pattern.compile(regex);
		// Iterate emails array list
		for (String email_Id : email) {
			// Create instance of matcher
			Matcher matcher = p1.matcher(email_Id);
			System.out.println(email_Id + " : " + matcher.matches() + "\n");
		}
	}
}