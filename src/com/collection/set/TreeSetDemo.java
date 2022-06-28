package com.collection.set;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(1);
		treeSet.add(3);
		treeSet.add(2);
		System.out.println(treeSet);
	}

}

/*
* Hierarchy is as follows: Set -> SortedSet -> NavigableSet -> TreeSet
* This class has more methods added
* Elements are sorted based on default comparator (which mostly sorts in ascending order and uses equals
*/