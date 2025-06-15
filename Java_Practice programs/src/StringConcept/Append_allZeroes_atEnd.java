package StringConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;





public class Append_allZeroes_atEnd {

	public static void main(String[] args) {

		//First method
		String number= "156030040802080";
		int ZeroCount=0;
//
		char[] charArray = number.toCharArray();

		String result="";

		for(char value:charArray) {
			if(value=='0')
				ZeroCount++;
			else
				result+=value;

		}

		for (int i=0;i<ZeroCount;i++) {

			result+=0;
		}
		System.out.print(result);
		System.out.println();

		System.out.print("***************************");
		System.out.println();


		/////Another method with Using Int and ArrayList

		int num=1560300409;
		String valueOf = String.valueOf(num);//it is used to changes int value to string value
		char[] charArray2 = valueOf.toCharArray();
		
		int ZerosCount=0;
		StringBuffer nonZero=new StringBuffer();
		for (Character numbers : charArray2) {
			if(numbers=='0')
				ZerosCount++;
			else
				nonZero.append(numbers);
				
		}
		
		for(int i=0;i<ZerosCount;i++) {
			nonZero.insert(i, 0);
		}
		
		System.out.print(nonZero);
			

	}

}
