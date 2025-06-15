package StringConcept;

public class Remove_Junk_or_Special_Character {

	public static void main(String[] args) {
		String s="$$$$ %%% addd 677";
		s=s.replaceAll("[^a-zA-Z0-9]",""); //^ This symbol denotes not
		System.out.println(s);

	}

}
