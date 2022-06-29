package com.collection.set;

import java.util.Comparator;

public class CustomComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer a, Integer b) {
		if (a > b) {
			return -1;
		} else if (a < b) {
			return 1;
		} else {
			return 0;
		}
	}

}

/*
* Here we are changing the default natural sorting order. 
* When comparing two elements if this method returns -1 then element is added before
* So when a > b, a will always be added before b, which means elements greater will always be before smaller elements
*/