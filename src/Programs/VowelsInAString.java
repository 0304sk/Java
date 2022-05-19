package Programs;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class VowelsInAString {
	
	public static void main(String[] args) {
		/*
		//count the no of vowels in the string
		String s = "Hello World";
		int count = 0;
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			
			char c = ch[i];
			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
			}
			
		}
		System.out.println("The total no of vowels in the String '" +s+ "' is "+count);
		*/
		
		//To count no of vowels in each string
		
		String s = "Welcome to your java class today";
		char[] ch = s.toCharArray();
		Map<Character,Integer> m = new TreeMap<Character,Integer>();
		
		for (int i = 0; i < ch.length; i++) {
			char c= ch[i];
			
			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				
				if (m.containsKey(c)) {
					
					Integer intg = m.get(c);
					m.put(c, intg+1);
				} else {
					m.put(c, 1);
				}
				
			}	
		}
		
		Set<Entry<Character,Integer>> entrySet = m.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			System.out.println(entry);
		}
		}
	}


