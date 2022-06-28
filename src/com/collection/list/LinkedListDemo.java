package com.collection.list;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.addFirst("first");
		linkedList.addLast("second");
		linkedList.add(0, "third");
		System.out.println(linkedList);
	}
}

//here we have add(index, element) but I think this operation will be costlier for linked list as compared to arraylist