package com.collection.list;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.addElement("hello");
		v.removeElementAt(0);
	}
}

/*
 * Legacy class
 * This class is thread safe (ArrayList and LinkedList are not thread safe) You will see methods are synchronized
 * */