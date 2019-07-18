package com.mylearning.programming;

public class StringSubsequence {

	public static void main(String[] args) {
		String str1 = "AXY";
		String str2 = "YADXCP";
		
		if(isSubsequence(str1, str2)) {
			System.out.println(str1 + " is a subsequence of " +  str2);
		} else {
			System.out.println(str1 + " is not a subsequence of " +  str2);
		}

	}

	private static boolean isSubsequence(String str1, String str2) {
		int m = 0, n = 0;
		
		for (int i = 0; i < str1.length(); i++) {
			for (int j = m; j < str2.length(); j++) {
				if(str1.charAt(i) == str2.charAt(j)) {
					m = j;
					n++;
				}
			}
		}
		
		if(str1.length() == n) {
			return true;
		}
		
		return false;
	}

}
