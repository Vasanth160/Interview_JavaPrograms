package StringConcept;

public class Reverse_an_Integer {

	public static void main(String[] args) {
		int num=1221;
		int rev=0;
		int temp=num;
		
		while(num!=0) {
			rev=rev*10+num%10; //1 10+2=12 120+2=122 1220+1=1221
			num=num/10; //122  12 1 0
		}
		System.out.println(rev);
		if(temp==rev) {
			System.out.println("NU,BER IS PLAINDROME");
		}
		else
			System.out.println("Not an palindrome");
		
		
		String name="racecar";
		String temp1=name;
		String reve="";
		for(int i=name.length()-1;i>=0;i--) {
			reve+=name.charAt(i);
		}
		System.out.println(reve);
		if(reve.equals(temp1))
			System.out.println("palindrome");
		else
			System.out.println("Not palindrome");
		
//		StringBuilder rev1=new StringBuilder();
//		for (int i = name.length()-1; i >=0; i--) {
//			rev1.append(name.charAt(i));
//		}
//		System.out.println(rev1);
//		if(name.equals(rev1.toString()))
//			System.out.println("palindrome");
//		else
//			System.out.println("Not an palindrome");
	}
	
}
