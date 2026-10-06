package com.cox.bssweb.hello.common;

import java.util.Comparator;


public class SortByYear implements Comparator<Object> {
	public int compare(Object obj1, Object obj2) {
	    // Make sure that the objects are Car objects
	    Car a = (Car) obj1;
	    Car b = (Car) obj2;
	    
	    // Compare the year of both objects
	    if (a.year < b.year) return -1; // The first car has a smaller year
	    if (a.year > b.year) return 1;  // The first car has a larger year
	    return 0; // Both cars have the same year
	  }
}
