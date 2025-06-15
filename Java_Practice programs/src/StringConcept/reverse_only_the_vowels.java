package StringConcept;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class reverse_only_the_vowels {

	public static void main(String[] args) {


		String name = "equation";  // Given name
		String vowels = "AEIOUaeiou";
		char[] charArray = name.toCharArray();
		System.out.println("Original Name: " + name);
		System.out.print("Reversing Vowels ");

		// Collect all vowels in reverse order
		ArrayList<Character> vowelList = new ArrayList<>();
//		for (char c : charArray) {
//			if (vowels.indexOf(c) != -1) {
//				vowelList.add(c);
//			}
//		}
		
		for(int i=charArray.length-1;i>=0;i--) {
			if(vowels.indexOf(charArray[i])!=-1)
				vowelList.add(charArray[i]);
		}
		
		for (Character ch : vowelList) {
			System.out.print(ch+" ");
		}
		System.out.println();
		//Collections.reverse(vowelList); // Reverse vowels

		// Replace vowels in the original string
		int vowelIndex = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (vowels.indexOf(charArray[i]) != -1) {
				charArray[i] = vowelList.get(vowelIndex++);
			}
		}

		// Print swapped string
		
		
		System.out.println("Modified Name: " + new String(charArray));
	}
}












//		int []num= {2,3,5,6,8};
//		int target=19;
//		for(int i=0;i<num.length;i++) {
//			for(int j=i+1;j<num.length;j++){
//				for(int k=j+1;k<num.length;k++) {
//					if(num[i]+num[j]+num[k]==target) {
//						System.out.println(i+" "+j+" "+k);
//					}
