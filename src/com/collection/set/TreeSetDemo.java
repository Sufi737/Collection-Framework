package com.collection.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(1);
		treeSet.add(3);
		treeSet.add(2);
		System.out.println(treeSet);
		
		TreeSet<Integer> treeSet2 = new TreeSet<Integer>(new CustomComparator());
		treeSet2.add(1);
		treeSet2.add(3);
		treeSet2.add(2);
		System.out.println(treeSet2);
		
		//custom TreeSet methods
		System.out.println(treeSet2.ceiling(2)); //returns smallest element equal to or greater than this element in this set
		System.out.println(treeSet2.descendingSet()); // reverses the set
		System.out.println(treeSet2.first()); //returns root element
		System.out.println(treeSet2.headSet(2));
		System.out.println(treeSet2.tailSet(2));
		System.out.println(treeSet2.pollFirst());
		System.out.println(treeSet2.pollLast());
		
		SortedSet<Integer> treeSet3 = new TreeSet<Integer>();
		
	}

	
}

/*
* Hierarchy is as follows: Set -> SortedSet -> NavigableSet -> TreeSet
* This class has more methods added
* Elements are sorted based on default comparator (which mostly sorts in ascending order and uses equals
* 
* In treeSet2 we have used our own custom comparator which will add elements in descending order
* 
* treeSet3 is created to demonstrate that if we use SortedSet as an up-cast then methods which were  added in
* NavigableSet will not be available. NavigableSet interface has own methods added such as headSet, tailSet, pollFirst, pollLast 
* 
*/