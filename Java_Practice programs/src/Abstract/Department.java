package Abstract;

import java.util.Scanner;

public class Department extends Employee{

	@Override
	void employeeName() {
		String name="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee name");
		name=sc.next();
		System.out.println("Your name "+ name);
		}
	public static void main(String[] args) {
		Department dp=new Department();
		dp.employeeName();
		dp.employeeDesignation("Software Engineer");
	}
	
	
}
