package com.collection.list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Object> stack = new Stack<Object>();
		stack.push(1);
		stack.push(2);
		System.out.println(stack.pop());
		System.out.println(stack.peek()); //returns element at top
	}
}
/*
* Child class of Vector so this is also thread safe
*/