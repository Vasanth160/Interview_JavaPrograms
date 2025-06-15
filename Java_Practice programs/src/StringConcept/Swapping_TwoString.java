package StringConcept;

public class Swapping_TwoString {

	public static void main(String[] args) {
		String a="Krishnamoorthy";
		String b="Kowsalya";
		System.out.println(a.length());
		System.out.println(b.length());
		System.out.println("Before Swapping ");
		
		//KrishnamoorthyKrishnamoorthy
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		
		System.out.println("After Swapping");
		
		a=a+b;
		b=a.substring(0, a.length()-b.length()); //14
		a=a.substring(b.length());
		
		
		System.out.println(a);
		System.out.println(b);

		int aa=90;
		int bb=60;
		
		 aa=bb+aa;
		 bb=aa-bb;
		 aa=aa-bb;
		 
		 System.out.println(aa);
	     System.out.println(bb);
		
	}

}
