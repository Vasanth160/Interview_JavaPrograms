package InmakesInternship;

public class DigitalMarketing extends Multimedia {

	public void content(String content) {
		System.out.println(content);

	}
	public void searchEngine(String search) {
		System.out.println(search);

		String name1="VasanthMoorthy";
		char[] ce = name1.toCharArray();
		int CharArray[]=new int[256];
		for(char value:ce) 
			CharArray[value]++;
		
		for(int i=0;i<CharArray.length;i++) {
			if(CharArray[i]>1)
				System.out.println((char)i+" "+CharArray[i]);


	}
}

