package com.cox.bssweb.hello;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.cox.bssweb.hello.common.Car;
import com.cox.bssweb.hello.common.SortByYear;

public class Sort2 {
	public static void main(String[] args) { 
	    // Create a list of cars
	    ArrayList<Car> myCars = new ArrayList<Car>();    
	    myCars.add(new Car("BMW", "X5", 1999));
	    myCars.add(new Car("Honda", "Accord", 2006));
	    myCars.add(new Car("Ford", "Mustang", 1970));

	    // Use a comparator to sort the cars
	    Collections.sort(myCars, (obj1, obj2) -> {
	    	  Car a = (Car) obj1;
	    	  Car b = (Car) obj2;
	    	  if (a.year < b.year) return -1;
	    	  if (a.year > b.year) return 1;
	    	  return 0;
	    	});

	    // Display the cars
	    for (Car c : myCars) {
	      System.out.println(c.brand + " " + c.model + " " + c.year);
	    }
	  } 
}
