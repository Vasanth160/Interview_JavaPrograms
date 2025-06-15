package PracticePrograms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class OccurenceOfCharacterInString {

	public static void main(String[] args) {
		String name="Vasanth life good is good";
		String[] split = name.split(" ");
		
		//char[] charArray = name.toCharArray();
		
		LinkedHashMap<String, Integer> result=new LinkedHashMap<String, Integer>();
		//List<String> li=new ArrayList<String>();
		
		for (String c : split) {
			if(result.containsKey(c))
				result.put(c, result.get(c)+1);
			else
				result.put(c, 1);
			
					}
		
		Set<Entry<String, Integer>> entry = result.entrySet();
		for (Entry<String, Integer> value : entry) {
			if(value.getValue()>=1) {
				System.out.println(value.getKey()+" "+value.getValue());
			}
		}
		
		System.out.println("**********************************");
		//Another way without Hashmap
		String name1="Vasanth life good is good";
		String[] split1 = name1.split(" ");
		List<String> seen=new ArrayList<String>();
		
		for (int i = 0; i < split1.length; i++) {
			String word=split[i];
			if(!seen.contains(word)) {
				seen.add(word);
				int wordcount=1;
				for(int j=i+1;j<split.length;j++) {
					if(word.equals(split[j]))
						wordcount++;
				}
				System.out.println(word+" "+wordcount);
			
			}
			
			}
	}

}
