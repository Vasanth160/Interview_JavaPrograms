package PracticePrograms;

public class combainEachLetterfromString {

	public static void main(String[] args) {
		
		String Job="Automation Test Engineer";
		String[] split = Job.split(" ");
		
		int maxlength=0;
		for (String word : split) {
			if(word.length()>maxlength)
				maxlength=word.length();
		}
		
		for(int i=0;i<maxlength;i++) {
			for (String words : split) {
				if(i<words.length())
					System.out.print(words.charAt(i));
				else
					System.out.print(" ");
			}
			System.out.println();
		}
			

	}

}
