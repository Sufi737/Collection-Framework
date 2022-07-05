package com.collection.map;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashmapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> languages = new HashMap<>();

	    // add elements to hashmap
	    languages.put("Java", 8);
	    //adding to same key just overrides the value
	    languages.put("Java", 9);
	    System.out.println(languages);
	    
	    //this is how we iterate hashmap
	    for(Entry<String, Integer> language: languages.entrySet()) {
	    	System.out.println(language.getKey());
	    	System.out.println(language.getValue());
	    }
	}
}

/*
For key lookup hashmap uses hashcode() method of the object type used in key
For value search hashmap uses equals() of the object type used in value. It is legal for two unequal objects to have same hashcode
Which is why HashMap puts two unequal objects having same hashcode in the same bucket as a linked list

If we strictly follow that two unequal objects cannot have same hashcode, then we are limiting ourselves to have only 2^32 buckets
coz a hashcode in Java is an int
*/