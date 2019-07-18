package com.mylearning.programming;

public class BalancedParentheses {

	public static void main(String[] args) {
		char[] exp = {'{', '(', ')', '}', '[', ']', '('};
		
		if(isParenthesesBalanced(exp)) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not Balanced");
		}

	}
	
	private static boolean isMatchingPair(char char1, char char2) {
		if(char1 == '(' && char2 == ')') {
			return true;
		} else if(char1 == '{' && char2 == '}') {
			return true;
		} else if(char1 == '[' && char2 == ']') {
			return true;
		} else {
			return false;
		}
	}
	
	private static boolean isParenthesesBalanced(char[] exp) {
		MyStack stack = new MyStack();
		
		for (int i = 0; i < exp.length; i++) {
			
			if(exp[i] == '(' || exp[i] == '{' || exp[i] == '[') {
				stack.push(exp[i]);
			}
			
			if(exp[i] == ')' || exp[i] == '}' || exp[i] == ']') {
				if(stack.isEmpty()) {
					return false;
				} else if(!isMatchingPair(stack.pop(), exp[i])) {
					return false;
				}
			}
		}
		
		if(stack.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

}

class MyStack {
	private char[] item;
	private int top;
	private int size;
	
	MyStack() {
		top = -1;
		size = 100;
		item = new char[size];
	}
	
	public void push(char c) {
		if(!isStackFull()) {
			top++;
			item[top] = c;
		} else {
			System.out.println("Stack is full.");
		}
	}
	
	private boolean isStackFull() {
		return top == size -1;
	}
	
	public char pop() {
		if(!isEmpty()) {
			return item[top--];
		} else {
			System.out.println("Underflow error");
			return '\0';
		}
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
}