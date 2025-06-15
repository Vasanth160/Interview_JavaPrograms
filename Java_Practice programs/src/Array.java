import java.util.Scanner;


public class Array {

	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
		int sum=0;
		int odd=0;
		int even=0;
//		System.out.println("Enter the num of string need to create");
//		int n=sc.nextInt();
//		int arr[]=new int[n];
//		
//		System.out.println("Length of the array is "+ n);
//		System.out.println("Enter all the " +n+" Values");
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//			}
//		for(int i=0;i<n;i++) {
//			sum+=arr[i];
//		}
//		System.out.println("Total value is "+sum);
		
//		int arr[]= {1,2,3,4,5,6,7};
//		for(int i=0;i<=arr.length-1;i++) {
//			if(arr[i]%2==0)
//				odd++;
//			else
//				even++;
//		}
//		System.out.println(odd);
//		System.out.println(even);
//		
		
		// Largest and Smallest from Array
		
		int arr[]= {12,56,22,34,53,1,-54};
		int smallestnum=arr[0];
		int largestnum=arr[0];
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]<smallestnum) {
				smallestnum=arr[i];
			}
			if(arr[i]>=largestnum) {
				largestnum=arr[i];
			}
		}
		System.out.println("Smallest Num is "+smallestnum);
		System.out.println("Largest Num is "+largestnum);
	}

}
