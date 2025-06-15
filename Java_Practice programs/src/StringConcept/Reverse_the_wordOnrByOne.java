package StringConcept;

public class Reverse_the_wordOnrByOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "The java code is good";
        String[] words = input.split(" ");

        StringBuilder combain=new StringBuilder();
        // Loop from last word to the first
        for (int i = words.length - 1; i >= 0; i--) {
            // 1. Reverse the current word and add it to the beginning
           String reversed = new StringBuilder(words[i]).reverse().toString();
           combain.insert(0, reversed+" ");
           //System.out.println(combain);
           StringBuilder fullline=new StringBuilder(combain);
           
           
           for(int j=0;j<i;j++) {
        	   fullline.append(words[j]+" ").toString();
           }
           System.out.println(fullline);
        }
        
//        String name = "Vasanth Moorty";
//        StringBuilder ne = new StringBuilder();
//
//        for (int i = 0; i < name.length(); i++) {
//            if ((name.charAt(i) == ' ')) {
//                ne.append('_');
//            } else {
//                ne.append(name.charAt(i));
//            }
//        }
//        System.out.println(ne.toString());
	}

	}


