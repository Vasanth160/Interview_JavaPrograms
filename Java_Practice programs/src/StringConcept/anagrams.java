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

		
		String str1 = "Listen";

		String str2="selent";
		

		str1=str1.replaceAll(" ", "").toLowerCase();
		str2=str2.replaceAll(" ", "").toLowerCase();
		
		if(str1.length()!=str2.length()) {
			throw new Exception("String mismatch");
		}

		int count[]=new int[256];
		for (int i = 0; i < str1.length(); i++) {
			count[str1.charAt(i)]++;  
			count[str2.charAt(i)]--;
			
		}
		
		/*🧠 Step-by-step table:
		i	str1.charAt(i)	Index (- 'a')	  count[]++	  str2.charAt(i) Index (- 'a')	count[]--	      count[] after this step
		
		0	'l'	              11			count[11] = 1	's'				18			count[18] = -1      count[11]=1, count[18]=-1
		1	'i'				   8			count[8] = 1	'e'				 4			count[4] = -1		count[8]=1, count[4]=-1
		2	's'				  18	        count[18] = 0	'l'	            11	        count[11] = 0	    count[18]=0, count[11]=0
		3	't'	              19			count[19] = 1	'e'				4			count[4] = -2		count[19]=1, count[4]=-2
		4	'e'	               4			count[4] = -1	'n'				13			count[13] = -1		count[4]=-1, count[13]=-1
		5	'n'	              13			count[13] = 0	't'				19			count[19] = 0		count[13]=0, count[19]=0 */
		
		boolean isAnagram=true;
		
		for(int i=0;i<count.length;i++) {
			if(count[i]!=0) {
				isAnagram=false;
				break;
			}
	
		}
		
		if(isAnagram) {
			System.out.println("isAnagram");
		}
		else
			System.out.println("Not an anagram");
		
		////Anagram with Arrays.sort method
		
		ArrayList<Character> list1=new ArrayList<Character>();
		ArrayList<Character> list2=new ArrayList<Character>();
		
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
