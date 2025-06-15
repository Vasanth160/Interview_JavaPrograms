import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class collectionpractice {
	public static void main(String[] args) {
		Set<Integer> s =new HashSet<Integer>(Arrays.asList(10,30,10,40,50,60));
		Iterator<Integer> itr = s.iterator();
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			System.out.println(integer);
		}
		Set<Integer> s1=new HashSet<Integer>(Arrays.asList(30,40,70,80));
		s1.removeAll(s);
		System.out.println(s1);
		
		
		/*Map eXCERCISE Description : Create a HashMap with the below key and values
		Key : 10, 20, 30, 40, 50, 60, 10, 50, 40
		Values : java, sql, oops, Sql, oracle, DB, selenium, psql, Hadoop. */
		
		Map<Integer, String> mp=new LinkedHashMap<Integer, String>();
		mp.put(10,"Java");
		mp.put(20,"Selenium");
		mp.put(40,"Oops");
		mp.put(30, "Oracle");
		System.out.println(mp);
		String keyvalue = mp.get(20);
		System.out.println(keyvalue);
		Collection<String> values = mp.values();
		System.out.println(values);
		Iterator<Entry<Integer, String>> iterator = mp.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<java.lang.Integer, java.lang.String> entry = iterator.next();
			System.out.print(entry.getKey()+" ");
			System.out.println(entry.getValue());
			
		}
		Scanner sc=new Scanner(System.in);
		Integer[] array= {10,20,30,40};
		for (int i = array.length-1; i>=0 ; i--) {
			System.out.println(array[i]);
			
		}
		
		List<Integer> li= Arrays.asList(array);
		System.out.println(li);
		
		Integer min = Collections.min(li);
		Integer max = Collections.max(li);
		System.out.println(min+" "+max);
//		int size=array.length;
//		System.out.println(size);
//		
//		for(int i=1;i<=5;i++) {
//			System.out.print("Enter the number "+i+":  " );
//			array[i]=sc.nextInt();
//			if(i==5) {
//				break;
//			}
//			
//		}
//
//		
//		for (int i = 1; i <=5; i++) {
//			System.out.println("Element stored in index "+i+" is "+array[i]);
//		}
		
		 
		
//		for (Entry<Integer, String> entry : entrySet) {
//			System.out.print(entry.getKey()+" ");
//			System.out.println(entry.getValue());
//			
//		}
		
	}
	
	
	
	

	

}
