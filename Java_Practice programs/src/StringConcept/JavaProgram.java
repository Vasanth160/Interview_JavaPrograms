package StringConcept;

import java.util.HashSet;
import java.util.LinkedHashSet;



public class JavaProgram {




	public static void main(String[] args) {
		//		String name ="Good day good life life is good";
		//
		//		String split[]= name.split(" "); 
		//
		//		HashSet<String>seen=new HashSet<>();
		//		LinkedHashSet<String>duplicate=new LinkedHashSet<>();
		//
		//		for(String value:split){
		//		if(seen.add(value)){
		//		     duplicate.add(value);
		//		}
		//		}
		////		else
		////		  seen.add(value);
		////		}
		//
		//		System.out.println("Duplicate values is " );
		//		for(String duplicatevalue: duplicate){
		//			System.out.println(" "+duplicatevalue);
		//
		//	}


		String name ="Good day good life life is good";

		String split[]= name.split(" "); 
		
		for(int i=0;i<split.length;i++) {
			boolean isDuplicate=false;
			
			for(int j=i+1;j<split.length;j++) {
				if(split[i].equalsIgnoreCase(split[j])) {
					isDuplicate=true;
					break;
				}
					
				
			}
			if (!isDuplicate) {
                System.out.print(split[i] + " ");
            }
		}
		

	}
}


