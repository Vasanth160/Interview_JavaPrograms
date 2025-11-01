package StringConcept;

public class Combain_FirstLettoerOfEachString {

	public static void main(String[] args) {
		String text="Automation Test Engineer";

		String[] split = text.split(" ");

		int maxlength=0;
		
		for (String word : split) {
			if(word.length()>maxlength)
				maxlength=word.length();
		}
	
		for(int i=0;i<maxlength;i++) {
			for(String result:split) {
				if(i<result.length()) {
					System.out.print(result.charAt(i));
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
