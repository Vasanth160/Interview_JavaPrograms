package PracticePrograms;

public class AppendAllZerosatLast {

	public static void main(String[] args) {
		int numbersWithZero=102030506;
		
		String num = String.valueOf(numbersWithZero);
		
		StringBuilder sb=new StringBuilder();
		int ZerosCount=0;
		String number = "";
		
		for (int i = 0; i < num.length(); i++) {
			if(num.charAt(i)=='0')
				ZerosCount++;
			else
				number+=num.charAt(i);
				sb.append(num.charAt(i));
		}
		
		for (int i = 0; i<ZerosCount; i++) {
			number+=0;
			//sb.insert(0, 0);
			sb.append(0);
		}
		
		System.out.println(sb.toString());
		System.out.println(number);

	}

}
