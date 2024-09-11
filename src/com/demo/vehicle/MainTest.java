package com.demo.vehicle;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

	public static void main(String[] args) {
		
		/**
		 * Create Car instances
		 */
		Car honda = new Car("Honda", 100);
		System.out.println(honda.getType());
		
		
		/**
		 * For following codes, checkout Java Fundamental Series2, loop Video from hightechdistrict.com
		 */
		Car toyota = new Car("Toyota", 120);
		Car ferrari = new Car("Ferrari", 200);
		
		
		/**
		 * Add Car instances to myCarList.
		 * List is an interface and ArrayList is an concrete class.
		 */
		List<Car> myCarList = new ArrayList();
		myCarList.add(honda);      
		myCarList.add(toyota); 
		myCarList.add(ferrari);  
		System.out.println("myCarList size: "+myCarList.size());
		
		/**
		 * For Loop is suitable when you know how many time you want to loop through
		*/
//		for (int i=0; i<myCarList.size(); i++) {
//			System.out.println("Index: "+ i);
//			Car car = myCarList.get(i);
//			System.out.println(car.getType());
//			//System.out.println(myCarList.get(i).getType());
//		}
		
		
		/**
		 * While Loop is suitable when you don't know how many time you want to loop through
		 */
//		while (!myCarList.isEmpty()) {
//			Car car = myCarList.remove(0);
//			System.out.println(car.getType());
//		}
		
		
		/**
		 * Exercise, Ask AI Assistant about do while loop
		 */
		
	}

}
