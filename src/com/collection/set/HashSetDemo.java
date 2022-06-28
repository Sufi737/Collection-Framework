package com.collection.set;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("hello");
		set.add("hello"); //adding duplicates will not work but will also not throw error
		set.add("new");
		System.out.println(set);
	}

}

/*
* Implementation class of Set interface
* As Set interface does not have any new methods apart from Collection interface methods, so does this class
* It internally uses hash table as a data structure. So it adds our values as a key and a default value as a value
* So in above example the internal hash table will be like ["hello"] -> 1
* Insertion order is not guaranteed, as internally it uses array where index is determined by hashCode()
* But this is faster as compared to TreeSet for insertion and removal operations (TreeSet uses log(n) complexity)
*/