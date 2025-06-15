package StringConcept;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;



public class anagrams {

	public static void main(String[] args) throws Exception {
		/*Anagram steps
    	1.Get two strings
    	2.Remove space if any and change the String to lowercase
    	why we changed to lowercase ? while sort the string, Uppercase letter comes front 
    	so while comparing both the string it gives false.
    	3.Compare the length of the string
    	4.Chage the string to char arr
    	5.Sort the charArr
    	6.Compare both the Sorted array

		 */

//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Enter first string:");
//		String str1 = scanner.nextLine();
//
//		System.out.println("Enter second string:");
//		String str2 = scanner.nextLine();
//		//Remove Spaces and changes the String to lowercase
//
//		str1=str1.replaceAll(" ", "").toLowerCase();
//		str2=str2.replaceAll(" ", "").toLowerCase();
//		
//		if(str1.length()!=str2.length()) {
//			throw new Exception("String mismatch");
//		}
//
//		int count[]=new int[26];
//		for (int i = 0; i < str1.length(); i++) {
//			count[str1.charAt(i)-'a']++;
//			count[str2.charAt(i)-'a']--;
//			
//		}
//		
//		boolean isAnagram=true;
//		
//		for(int i=0;i<count.length;i++) {
//			if(count[i]!=0) {
//				isAnagram=false;
//				break;
//			}
//	
//		}
//		
//		if(isAnagram) {
//			System.out.println("isAnagram");
//		}
//		else
//			System.out.println("Not an anagram");
		
		////Anagram with Arrays.sort method
		
		ArrayList<Character> list1=new ArrayList<Character>();
		ArrayList<Character> list2=new ArrayList<Character>();
		
		        Scanner scanner = new Scanner(System.in);
		
		        System.out.println("Enter first string:");
		        String str1 = scanner.nextLine();
		
		        System.out.println("Enter second string:");
		        String str2 = scanner.nextLine();
		      //Remove Spaces and changes the String to lowercase
		        
		        str1=str1.replaceAll(" ", "").toLowerCase();
		        str2=str2.replaceAll(" ", "").toLowerCase();
		        if(str1.length()!=str2.length()) {
		        	throw new Exception("String mismatch");
		        	}
		        
		        
		        char[] arr1 = str1.toCharArray();
		        char[] arr2 = str2.toCharArray();
		        
		        
		        
		        
		        for (char Str1 : arr1) {
		        	list1.add(Str1);
				}
//		        
		        for(char Str2: arr2 ) {
		        	list2.add(Str2);
		        }
		       Collections.sort(list1);
		       Collections.sort(list2);
		        
		       if(list1.equals(list2)) {
		    	   System.out.println("Both are anagrams");
		       }
		       else
		    	   System.out.println("Not an anagrams");
		        
//		    	Arrays.sort(arr1);
//		        Arrays.sort(arr2);
//		        
//		        System.out.println(Arrays.toString(arr1));
//		        System.out.println(Arrays.toString(arr2));
//		        
//		        if(Arrays.equals(arr1, arr2))
//		        	System.out.println("Both are anagrams");
//		        else
//		        	System.out.println("Not` an anagrams");
////		        
		

	}
}
