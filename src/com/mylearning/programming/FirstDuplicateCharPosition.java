package com.mylearning.programming;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateCharPosition {

	public static void main(String[] args) {
		String str = "AZXCVBNMDFFAZ";//"ABCDCF";
		char[] ch = str.toCharArray();
		System.out.println(posFirstDuplicateChar(ch));
	}
	
	private static int posFirstDuplicateChar(char[] ch) {
		Set<Character> set = new HashSet<Character>();
		
		for (int i = 0; i < ch.length; i++) {
			if(set.contains(ch[i])) {
				return i+1;
			} else {
				set.add(ch[i]);
			}
		}
		
		return -1;
	}

}
