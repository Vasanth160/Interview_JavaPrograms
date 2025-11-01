package StringConcept;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Count_theDuplicateCharacter_fromString {

	public static void main(String[] args) {
//		String name="aaabbcc";
//		char[] ca = name.toCharArray();
//		LinkedHashMap<Character, Integer> mp=new LinkedHashMap<Character, Integer>();
//		for (char c : ca) {
//			if(mp.containsKey(c))
//				mp.put(c, mp.get(c)+1);
//			else
//				mp.put(c, 1);
//		}
//		
//		Set<Entry<Character, Integer>> entrySet = mp.entrySet();
//		for (Entry<Character, Integer> entry : entrySet) {
//			if(entry.getValue()>1)
//				System.out.println(entry.getKey()+":"+entry.getValue());
//		}
		
		
		//Without using HashMap
		String name1="VasanthMoorthy";
		char[] ce = name1.toCharArray();
		int CharArray[]=new int[256];
		for(char value:ce) 
			CharArray[value]++;
		
		for(int i=0;i<CharArray.length;i++) {
			if(CharArray[i]>1)
				System.out.println((char)i+" "+CharArray[i]);


		

	}
}
}





















			//char a[]= {'a','b','a','c','b','b'};//Find Dulpicate Char
			//		char[] ch = name.toCharArray();
			//		Map<Character, Integer> mp=new HashMap<Character, Integer>();
			//		for (Character c : ch) {
			//			if(mp.containsKey(c))
			//				mp.put(c, mp.get(c)+1);
			//			else
			//				mp.put(c, 1);
			//		}
			//
			//		
			//		Set<Entry<Character, Integer>> entrySet = mp.entrySet();
			//		System.out.println("Duplicate character in the Given string ");
			//		//System.out.println("Unique values are ");
			//		for (Entry<Character, Integer> entry : entrySet) {
			////			//This line will print the Duplicate value
			//			if(entry.getValue()>1)
			//				System.out.println(entry.getKey()+" is present for "+entry.getValue()+" times");

			//This line will print the Unique value
			//			if(entry.getValue()==1)
			//				System.out.print(entry.getKey()+" ");		}


		

