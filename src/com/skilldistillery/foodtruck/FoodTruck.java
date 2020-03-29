package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruck {

	private String truckName;
	private int truckRating;
	private String foodType;

	public FoodTruck(String truckName, int truckRating, String foodType) {
		this.truckName = truckName;
		this.truckRating = truckRating;
		this.foodType = foodType;
	}


	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public int getTruckRating() {
		return truckRating;
	}

	public void setTruckRating(int truckRating) {
		this.truckRating = truckRating;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}


	@Override
	public String toString() {
		return "FoodTruck [truckName=" + truckName + ", truckRating=" + truckRating + ", foodType=" + foodType + "]";
	}

	
	
//	public void input() {
//		String userTruckName;
//		int userTruckRating;
//		String userFoodType;
//		int i = 0;
//
//		while (i < 5) {
//			System.out.println("Enter your food trucks, You must have at least 3.");
//			System.out.println("You have " + i + " trucks now.");
////			System.out.println("Truck" + (i + 1) + ": ");
//			System.out.println("What is the truck name?");
//			userTruckName = kb.nextLine();
//			System.out.println("What type of food does this truck have?");
//			userFoodType = kb.nextLine();
//			System.out.println("What is the rating of this truck? (Between 1 & 5)");
//			userTruckRating = kb.nextInt();
//			if (i >= 3 && truckName.equalsIgnoreCase("quit")) {
//				break;
//			} else if (i < 3 && truckName.equalsIgnoreCase("quit")) {
//				System.out.println("You must have at least 3 trucks!");
//			} else {
//				foodTrucks[i] = new FoodTruck(userTruckName, userTruckRating, userFoodType).toString();
//				i++;
//			}
//
//		}
//		System.out.println("You now have " + i + " trucks.");
//		System.out.println(foodTrucks.toString());
//	}

}
