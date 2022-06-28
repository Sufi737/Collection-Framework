package com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<String>();
		list.add(1);
		list.add("String");
		System.out.println(list);
	}

}

/*
* ArrayList is an implementation class of List\
* Based on 0-based indexing
* Can store heterogenous objects (ideally it accepts a generic argument though)
* Growable in size
*/