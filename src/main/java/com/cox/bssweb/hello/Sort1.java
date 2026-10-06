package com.cox.bssweb.hello;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.cox.bssweb.hello.common.Car;
import com.cox.bssweb.hello.common.SortByYear;

public class Sort1 {
	
	
	public static void main(String[] args) { 
	    // Create a list of cars
	    ArrayList<Car> myCars = new ArrayList<Car>();    
	    myCars.add(new Car("BMW", "X5", 1999));
	    myCars.add(new Car("Honda", "Accord", 2006));
	    myCars.add(new Car("Ford", "Mustang", 1970));

	    // Use a comparator to sort the cars
	    Comparator<Object> myComparator = new SortByYear();
	    Collections.sort(myCars, myComparator);

	    // Display the cars
	    for (Car c : myCars) {
	      System.out.println(c.brand + " " + c.model + " " + c.year);
	    }
	  } 
}
