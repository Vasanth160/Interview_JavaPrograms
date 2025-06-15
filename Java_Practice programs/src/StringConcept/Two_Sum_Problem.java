package StringConcept;

import java.util.Scanner;

public class Two_Sum_Problem {

	public static void main(String[] args) {
		// Input: nums = [2, 7, 11, 15], target = 9  
		//Output: [0, 1]  // Because nums[0] + nums[1] = 2 + 7 = 9
		
		Scanner sc=new Scanner(System.in);
		int num[]=new int[4];
		System.out.println("Enter the "+num.length+" numbers");
		for(int i=0;i<num.length;i++) {
			 num[i]=sc.nextInt();
		}
		System.out.println("Enter the Target number");
		int targetNum=sc.nextInt();
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]+num[j]==targetNum) {
					System.out.println("Index value of numbers is "+i+" "+j);
					System.out.println("The number is "+num[i]+" "+num[j]);
				}
			}
		}

	}

}
