package StringConcept;

import java.util.LinkedHashSet;

public class remove_duplicate_characters_notFirstOccurence {
	public static void main(String[] args) {
		
//		String input="Vasanth QA";
//		LinkedHashSet<Character> se=new LinkedHashSet<Character>();

//		//StringBuilder s=new StringBuilder();
//		//String name=input.substring(0, 9)+input.substring(9, 10).toLowerCase();
//		
//		char[] charArray = input.toCharArray();
//		
//		for (char c : charArray) {
//			if(!se.contains(c)) {
//				se.add(c);
//				//s.append(c);
//			}
//		}
//		for (char c : se) {
//			System.out.print(c);
//		}
//		System.out.println();
//		
//		String Myname="Vasanth";
//		
//		char[] charArray2 = Myname.toCharArray();
//		for (char c : charArray2) {
//			if(!seen.contains(c))
//				seen.add(c);
//		}
//		System.out.print("Final output ");
//		for (char value : seen) {
//			System.out.print(value);
//		}
		String input = "Vasanth QA";
		LinkedHashSet<Character> seen=new LinkedHashSet<Character>();
		char[] charArray = input.toCharArray();
		for (char c : charArray) {
			char lowerCase = Character.toLowerCase(c);
			if(!seen.contains(lowerCase))
				seen.add(c);
		}
		for (char result : seen) {
			System.out.print(result);
		}
    }
	
	}


