package Programs;

import java.util.Scanner;


public class Aggreation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		
		Address ad = new Address("Perumal street");
		Address ad1 = new Address("Murugan street");
		 Name n=new Name("Vasanth", 2, ad);
		 Name n1=new Name("Nijanth", 4, ad1);
		 
		 n.display();
		 n1.display();
		
		}

}
class Address{
	String address="";
	Address(String address) {
		this.address=address;
		System.out.println("Your name is "+ address);
		}
	}
	
 class Name {
	 String name="";
	 int id;
	 Address address;
	 Name(String name,int id, Address address){
		 this.name=name;
		 this.id=id;
		 this.address=address;
	 }
	 void display() {
		 System.out.println(name+""+id);
		 System.out.println(address);
		 
	 }
}