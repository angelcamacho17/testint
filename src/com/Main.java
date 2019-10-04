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
		int last = 0;
		List<String> anagram = new ArrayList<String>();
		Map<Integer, String> word = new HashMap<>();

		// add letter's chain to search in the string.
		for (i= 0; i <bLength; i++) {
			anagram.add(String.valueOf(b.charAt(i)));
		}
		
		for (i = 0; i<a.length();i++) {
			// if the letter is in the chain and not in my word to read, evaluate.
			
				
			if( anagram.contains(String.valueOf(a.charAt(i)))==true && (word.containsValue(String.valueOf(a.charAt(i)))==false)){
				
				word.put(i,String.valueOf(a.charAt(i)));
				
				// if the chain is in
				if(word.size()==bLength) {
					//if (valid(word,i)){
						count++;
					//}
					word.clear();
				}
			}
		}
		
		return count;
	}
	
	// Check if the letters are in sequence.
	public static boolean valid(Map word, int n) {
		boolean result = true;
		for (int i =n; i>(n-word.size());i--){
			//System.out.println(word.get(i)+" "+i);
			if (word.get(i) == null) {
				result = false;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String a = "hol, que buena a mir";
		//String a = "dd�";
		String a = "�hola, que buena olalaao Laomir��";
		String b = "OAL";
		
		System.out.print(solution(a,b));

	}

}
