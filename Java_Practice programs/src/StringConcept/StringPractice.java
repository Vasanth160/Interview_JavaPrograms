package StringConcept;

import java.util.ArrayList;
import java.util.Scanner;

public class StringPractice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1 ="Hello";
		String s2=s1 +",World ," ;
		String upperCase = s1.toUpperCase();
		
		System.out.println(upperCase);
		
		StringBuffer sb=new StringBuffer("Java");
		int hashCode = sb.hashCode();
		
		sb.append(" Welcome");
		StringBuffer reverse = sb.reverse();
		System.out.println(reverse);
		
		String name= "";
//		
		System.out.println("Enetr the String value u need to reverse");
		name=sc.nextLine();
		//System.out.print("Indexes of character s are ");
		int count=0;
		String rev="";
		ArrayList<Character> al=new ArrayList<Character>();
		for(int i=0;i<name.length();i++) {
			for(int j=i+1;j<name.length();j++) {
				if(name.charAt(i)==name.charAt(j)) {
					al.add(name.charAt(i));
					count++;
				}
			}
			
			
			
			
			
			
			
			
		}
		System.out.println("Duplicate character are "+ al);
		System.out.println("Number of time present is "+count);
		
//			 rev+=name.charAt(i);
//			if(name.charAt(i)=='s') {
//				count++;
//				System.out.print(i+ " ");
//			}
//		}
//		System.out.print(rev);
//		
		
//		String course="Selenium Automationtool";
//		int indexOf = course.lastIndexOf("o");
//		String replace = course.replace("tool", "fool");
//		System.out.println(replace);
		
		
		
		
		
		
		
	}
	
	
	

	
	
	
	
}

