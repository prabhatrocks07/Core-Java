package com.mylearning.programming;

import java.util.Stack;

public class QueueUsingStacks {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
	}
}

class Queue {
	private Stack<Integer> s1 = new Stack<Integer>();
	private Stack<Integer> s2 = new Stack<Integer>();
	
	public void enQueue(Integer x) {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		
		s1.push(x);
		
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}
	
	public Integer deQueue() {
		if(s1.isEmpty()) {
			System.out.println("Q is empty");
			System.exit(0);
		}
		
		Integer x = (Integer) s1.peek();
		s1.pop();
		return x;
	}
}
