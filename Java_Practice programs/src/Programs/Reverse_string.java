package Programs;

import java.util.Scanner;

public class Reverse_string {
	public static void main(String[]args) {
		String name="Vasanth";
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		
		}
		System.out.println(rev);
		if(rev.equals(name)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}
	
	

}
