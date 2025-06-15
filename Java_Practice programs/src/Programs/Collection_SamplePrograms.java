package Programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collection_SamplePrograms {
	
	public static void main(String[] args) {
		int num = 0;
		Set<Integer> s=new LinkedHashSet();
		s.add(10);
		s.add(20);
		s.add(10);
		s.add(50);
		s.add(20);
		s.add(50);
		for (Integer value : s) {
            System.out.println(value);
        }
		
		List<Integer> li =new LinkedList();
		li.add(100);
		li.add(30);
		li.add(20);
		int size=li.size();
		//System.out.println(li);
		li.addAll(s);
		Integer num1=li.get(2);
		System.out.println(num1);
		System.out.println(li);
		System.out.println(li.get(1));
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
			
		}
		
		 LinkedHashMap<Integer, Integer> myMap = new LinkedHashMap<>();
	        myMap.put(10, 10);
	        myMap.put(20, 20);
	        myMap.put(30, 30);
	        myMap.put(40, 40);
	        myMap.put(50, 50);
	        myMap.put(60, 60);
	        myMap.put(10, 10); // This will overwrite the previous value with key 10
	        myMap.put(50, 50); // This will overwrite the previous value with key 50
	        myMap.put(40, 40); // This will overwrite the previous value with key 40
	        
	        Set<Entry<Integer, Integer>> entrySet = myMap.entrySet();
	        System.out.println(entrySet);
	        
	        // Get an iterator for the entry set of the LinkedHashMap
	        Iterator<Map.Entry<Integer, Integer>> iterator = entrySet.iterator();
	        
	        // Use a while loop to iterate over the LinkedHashMap
	        while (iterator.hasNext()) {
	            Map.Entry<Integer, Integer> entry = iterator.next();
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }
		
		
		
		
		
		
		
		
	}
	 
	
	

}
