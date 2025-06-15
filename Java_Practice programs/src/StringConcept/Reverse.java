package StringConcept;

public class Reverse {
	public static void main(String[] args) {

		
		int num=97; //ASCII value for small a is 97 and A is 65
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(num+j)+" ");
				
				}
			System.out.println();
			}
		
		
		
		
		
		
		int num1=1; 
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) { 
				System.out.print((num1++)+" ");
				
				}
			System.out.println();
			}
			
		
		
		
		
		
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*"+" ");
				
				}
			System.out.println();
			}
		for(int i=0;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*"+" ");
				
				}
			System.out.println();
			}
		}
		

	}

