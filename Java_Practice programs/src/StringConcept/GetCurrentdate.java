package StringConcept;

import java.time.LocalDate;
import java.time.YearMonth;


public class GetCurrentdate {

	public static void main(String[] args) {
		
		LocalDate today=LocalDate.now();
		System.out.println(today);
		YearMonth MonthandYear=YearMonth.from(today);
		System.out.println(MonthandYear);
		int lastday= MonthandYear.lengthOfMonth();
		System.out.println(lastday);
		
		int dayOfMonth = today.getDayOfMonth();
		System.out.println(dayOfMonth);
		
		if(dayOfMonth==lastday) {
			System.out.println("Run my script");
		}

	}

}
