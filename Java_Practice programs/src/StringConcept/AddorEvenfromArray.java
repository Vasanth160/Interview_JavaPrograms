package StringConcept;

import java.util.ArrayList;
import java.util.Scanner;

public class AddorEvenfromArray {
	public static void main(String[] args) {
		
		int num =100;
		System.out.println("Even nums are ");
		ArrayList<Integer> oddnum=new ArrayList<Integer>();
		ArrayList<Integer> evennum=new ArrayList<Integer>();
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				evennum.add(i);
			}
			else
				oddnum.add(i);
		}
		
		
		for (Integer integer : evennum) {
			System.out.print(" "+ integer);
		}
		
		System.out.println();
		System.out.print("Odd nums are ");
		
		for (Integer integer : oddnum) {
			System.out.print(" "+integer);
		}
		
		
		
//		String s ="VASANTH Moorthy is a good boy";
////		String[] split = s.split(" ");
////		System.out.println(split.length);
//		
//		int count = 1;
//		
//		for (int i = 0; i <=s.length() - 1; i++)
//		{
//		if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
//		
//		count++;
//		
//		}
//		System.out.println("Number of words in a string = " + count);
	}

}
