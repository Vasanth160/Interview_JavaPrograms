package org.col;

public class Department_info {
	
	public void ug(String department) {
		System.out.println("Department name is " + department);
	}
	public void ug(String name,int dnum) {
		System.out.println("Your name " +name );
		System.out.println("Your D.num is "+dnum);

	}
	public void ug(double percentage) {
		System.out.println("Your overall UG percentage is "+percentage);

	}
	public static void main(String[] args) {
		Department_info d=new Department_info();
		d.ug("Computer science");
		d.ug("Vasanth", 17604045);
		d.ug(7.4);
	}
	
}
