package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruck {
	Scanner kb = new Scanner(System.in);
	String[] foodTrucks = new String[5];

	public void input() {

		int i = 0;
		String truckInfo = "";

		while (i < 5) {
			System.out.println("Enter your food trucks, You must have at least 3.");
			System.out.println("You have " + i + " trucks now.");
//			System.out.println("Truck" + (i + 1) + ": ");
			truckInfo = kb.nextLine();
			if (i >= 3 && truckInfo.equalsIgnoreCase("quit")) {
				break;
			} else if (i < 3 && truckInfo.equalsIgnoreCase("quit")) {
				System.out.println("You must have at least 3 trucks!");
			} else {
				foodTrucks[i] = truckInfo;
				i++;
			}

		}
		System.out.println("You now have " + i + " trucks.");
		System.out.println(foodTrucks.toString());
	}

}
