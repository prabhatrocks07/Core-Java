package com.mylearning.programming;

//https://www.geeksforgeeks.org/given-two-strings-find-first-string-subsequence-second/

public class SubsequenceRecursive {

	public static void main(String[] args) {
		
		String str1 = "AXY";
		String str2 = "ADXCPY";
		
		int m = str1.length();
		int n = str2.length();
		
		boolean isSubsequence = isSubsequence(str1, str2, m, n);
		
		if(isSubsequence) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
	
	//Using Recursion
	/*private static boolean isSubsequence(String str1, String str2, int m, int n) {
		
		if(m == 0) {
			return true;
		}
		
		if(n == 0) {
			return false;
		}
		
		if(str1.charAt(m-1) == str2.charAt(n-1)) {
			return isSubsequence(str1, str2, m-1, n-1);
		}
		
		//If last characters are not matching
		return isSubsequence(str1, str2, m, n-1);

	}*/
	
	// Using single for loop
	private static boolean isSubsequence(String str1, String str2, int m, int n) {
		
		int j = 0;
		
		for (int i = 0; i < n & j < m; i++) {
			if(str1.charAt(j) == str2.charAt(i)) {
				j++;
			}
		}
		
		return (m == j);

	}

}
