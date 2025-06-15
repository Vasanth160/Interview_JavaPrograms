package StringConcept;

public class Split_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Java is my Favourite";
		String[] split = s.split(" ");
		for (String string : split) {
			System.out.println(string);
		}

	}

}
