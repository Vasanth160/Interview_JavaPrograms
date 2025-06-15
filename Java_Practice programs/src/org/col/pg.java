package org.col;

public class pg extends Department_info{
	
	@Override
	public void ug(double percentage) {
		System.out.println("PG percentage is "+percentage);
	}
	
	@Override
	public void ug(String name, int dnum) {
		System.out.println("Your name " +name );
		System.out.println("Your D.num is "+dnum);
	}
	@Override
	public void ug(String department) {
		System.out.println("Department name is " + department);
	}
	private void lancer() {
		

	}
	public static void main(String[] args) {
		pg p=new pg();
		p.ug("Vasanth",17604045);
		p.ug("CS");
		p.ug(9.8);
	}

	}



