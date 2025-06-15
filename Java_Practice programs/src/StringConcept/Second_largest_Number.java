package StringConcept;

import java.util.Arrays;

public class Second_largest_Number {

	public static void main(String[] args) {
		//int[]arr= {3,8,16,90,45,67,90,87, 89};
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		int firstlargestis=arr[arr.length-1];
//		System.out.println(firstlargestis);
//		int secondLrgestis = 0;
//		
//		for(int i=arr.length-3;i>0;i--) {
//			if(arr[i]<firstlargestis) {
//				secondLrgestis=arr[i];
//				break;
//			}
//		}
//		System.out.println(secondLrgestis);
		
		
//		//other way
		int[]arr= {8,3,16,90,45,67,90,7,87, 89};
	int FirstLargest=arr[0];
	int secondLargest=-1;
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i]>FirstLargest)
//				FirstLargest=arr[i];
//		}
//		
//		System.out.println("First largect is "+FirstLargest);
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>secondLargest&&arr[i]<FirstLargest)
//				secondLargest=arr[i];
//		}
//		System.out.println("Second largest element is "+secondLargest);
		
		
		///BestWay is 8,3,16,90,45,67,90,87
		int[]arr1= {8,3,16,90,45,67,90,87, 89};
		int Firstsmallest=arr1[0], secondsmallest=-1;
		for(int i=1;i<arr1.length;i++) {
			if(arr1[i]<Firstsmallest) {
				secondsmallest=Firstsmallest;
				Firstsmallest=arr1[i];
			}
			else if(arr1[i]<secondsmallest&&arr1[i]!=Firstsmallest)
				secondsmallest=arr1[i];
		}
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>FirstLargest) {
				secondLargest=FirstLargest;
				FirstLargest=arr[i];
				
			}
			else if(arr[i]>secondLargest&&arr[i]!=FirstLargest) {
				secondLargest=arr[i];
			}
		}
		System.out.println("FirsLargest "+FirstLargest);
		System.out.println("secondlargest "+secondLargest);
		
		System.out.println("Firstsmallest "+Firstsmallest);
		System.out.println("secondsmallest "+secondsmallest);
	}

}
