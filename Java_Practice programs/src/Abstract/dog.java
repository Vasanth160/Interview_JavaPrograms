package Abstract;

public class dog extends cat{

	@Override
	public void dog() {
		System.out.println("dog says bark");
		
	}

	@Override
	public void lion() {
		System.out.println("Lion says roar");
		
	}
	 public static void main(String[] args) {
		dog d=new dog();
		d.cat();
		d.dog();
		d.lion();
	}

	


}
