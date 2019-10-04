package com;

import java.util.*;

public class Main {
	
	public static int solution (String a, String b) {
		
		if (b.length()> a.length()) return 0;
		
		a = a.toLowerCase();
		b = b.toLowerCase();
		int i = 0;
		int count = 0;
		int bLength = b.length();
		List<String> anagram = new ArrayList<String>();
		

		// add letter's chain to search in the string.
		for (i= 0; i <bLength; i++) {
			anagram.add(String.valueOf(b.charAt(i)));
		}
		
		for (i = 0; i<a.length();i++) {
			// if the letter is in the chain and not in my word to read, evaluate.
			
			if (valid(a,bLength,i,anagram)) {
				count++;
			}
				
			/*if( anagram.contains(String.valueOf(a.charAt(i)))==true && (word.containsValue(String.valueOf(a.charAt(i)))==false)){
				
				word.put(i,String.valueOf(a.charAt(i)));
				
				// if the chain is in
				if(word.size()==bLength) {
					//if (valid(word,i)){
						count++;
					//}
					word.clear();
				}
			}*/
		}
		
		return count;
	}
	
	// Check if the letters are in sequence.
	public static boolean valid(String a, int bLength, int i, List anagram) {
		Map<Integer, String> word = new HashMap<>();
		int n = i+3;
		while(i<n){
			
			//System.out.println(word.get(i)+" "+i);
			if(i<a.length()) {
				if( anagram.contains(String.valueOf(a.charAt(i)))==true && (word.containsValue(String.valueOf(a.charAt(i)))==false)){
					word.put(i,String.valueOf(a.charAt(i)));
				}
			}else {
				i = i+3;
			}
			i++;
		}
		if(word.size()==bLength) return true;
		else return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "holaaaaaaloa, que buena a mir";
		//String a = "dd”";
		//String a = "“hola, que buena ola la oLaomir””";
		String b = "OAL";
		
		System.out.print(solution(a,b));

	}

}
