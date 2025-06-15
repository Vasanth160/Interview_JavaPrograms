package Programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class ReverseString {

	public static void main(String[] args) {
//		int a=10;
//		int b=20;
//		a=a-b; //-10
//		b=a+b; //10
//		a=b-a; //20
//		System.out.println(a+" "+b);
		
		
		//Prime number
//		int num=14;
//		int count=0;
//		for(int i=1;i<=num;i++){
//			if(num%i==0) 
//				count++;}
//		if(count==2)
//			System.out.println("Prime Number");
//		else
//			System.out.println("Not a arime");
//				
		
//		//Finonacci series
//		int firstnum=0;
//		int secondnum=1;
//		int next=0;
//		for(int i=1;i<=8;i++) {
//			System.out.print(firstnum+" ");
//			next=firstnum+secondnum; //1,2,3
//			firstnum=secondnum; //1,1,2
//			secondnum=next; //3
//		}
		
		//Reverse a Number
//		int num=2345;
//		System.out.println(num%10);
//		System.out.println(num/10);
//		int rev=0;
//		while(num!=0) {
//			rev=rev*10; //0 , 50
//			rev=rev+num%10;
//			num=num/10; 
//		}
//		
//		System.out.println(rev);
			
//		int num=0;
//		for(int row=6;row>=0;row--) {
//			for(int column=0;column<=row;column++) {
//				System.out.print(num+" ");
//				num++;
//			}
//			System.out.println();
//		}
		
		String name="Vasanth QA";
		String lowerCase =name.substring(0, 9)+ name.substring(9, 10).toLowerCase();
		lowerCase.toCharArray();
		System.out.println(lowerCase);
		char[] charArray = name.toCharArray();
		Set<Character> se= new LinkedHashSet<Character>();
		

	}
	}

