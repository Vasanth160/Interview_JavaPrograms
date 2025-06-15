package StringConcept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Find_DuplicateElement_inArray {

	public static void main(String[] args) {
		
		
		 String name = "Good day good life life is good";
//		 name=name.toLowerCase();
		 System.out.println(name);
	     String[] split = name.split(" ");
	        HashSet<String> seen = new HashSet<>();
	        HashSet<String> duplicate = new HashSet<>();
	        
//	        for (String value : duplicate) {
//				if(!seen.add(value))
//					duplicate.add(value);
//			}

	        for (String value : split) {
	            if (seen.contains(value)) {
	                duplicate.add(value);
	            } else {
	                seen.add(value);
	            }
	        }

	        System.out.println("Duplicate values are:");
	        for (String duplicateValue : duplicate) {
	            System.out.println(" " + duplicateValue);
	        }
//	        
	        
	        //String letter = "VaasanthMoorthy";
//	        char[] charArray = letter.toCharArray();
//	        for (char value : charArray) {
//	            if (seen.contains(value)) {
//	                duplicate.add(value);
//	            } else {
//	                seen.add(value);
//	            }
//	        }
//
//	        System.out.println("Duplicate characters are:");
//	        for (char c : duplicate) {
//	            System.out.println(c);
//	        }
	        
	        String names = "Good day good life life is good";
	        
	        String[] splits = names.toLowerCase().split(" "); // convert to lowercase for accurate comparison
	 
	        HashSet<String> seens = new HashSet<>();
	        HashSet<String> duplicates = new HashSet<>();
	 
	        for (String value : splits) {
	            if (seens.add(value)==false) {
	            	duplicates.add(value); // add to duplicates if already seen
	            }
	        }
	 
	        System.out.println("Duplicate words:");
	        for (String word : duplicates) {
	            System.out.println(word);
	        }
		}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
//		ArrayList<Character> al=new ArrayList<Character>();
//		//Fiding Duplicate character in Array
//		char arr[]= {'a','b','c','b','d','e','a','e'};
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					System.out.print(arr[i]);
//				}
//			}
//			
//		}
		
		
		//Finding Duplicate Strung in Array
//		String name[]= {"Vasanth","Nijanth","Meena","nijanTh"};
//		for(int i=0;i<name.length;i++) {
//			for(int j=i+1;j<name.length;j++) {
//				if(name[i].equalsIgnoreCase(name[j])) {
//					System.out.println("Duplicate Element is "+name[i]);
//				}
//			}
//		}
		//Above both are worst solution,,There is another method to reduce time
		
		
		//it will print only duplicate what if i want to print Unique
		
		
//		
//		for(int i=0;i<cc.length();i++) {
//			char[] charArray=cc.toCharArray();
//			
//			if(se.add(charArray[i])==false)
//				System.out.print(charArray[i]);
//		}
//		
		
		
		
		
		
		
		
		//This will print Duplicate
//		Set<Object> a=new HashSet<Object>();
//		String character="aaabfbbcdddeeeec";
//		int Duplicatecount=0;
//		for(int i=0;i<character.length();i++) {
//			for(int j=i+1;j<character.length();j++) {
//				if(character.charAt(i)==character.charAt(j)) {
//					
//					a.add(character.charAt(i));
//					
//				}
//				
//				
//			}
//		}
//		System.out.println("Duplicate Elements are ");
//		for(Object cha:a) {
//			System.out.print(cha+" ");
//		}
//		System.out.println();
//		
//		
//	}

//}
