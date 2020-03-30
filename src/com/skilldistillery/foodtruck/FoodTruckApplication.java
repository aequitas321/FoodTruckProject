package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApplication {

	private Scanner kb = new Scanner(System.in);
	private FoodTruck[] foodTrucks;

	public static void main(String[] args) {
		FoodTruckApplication fta = new FoodTruckApplication();
		fta.createFoodTrucks();
		fta.printMenu();

	}

	public void createFoodTrucks() {
		FoodTruck[] foodTrucks = new FoodTruck[5];
		String userTruckName;
		int userTruckRating;
		String userFoodType;
		int id = 1;
		int i = 0;

		while (i < 5) {

			System.out.println("Enter your food trucks, You must have at least 3.");
			
			System.out.println("You have " + i + " trucks now.");
			
			System.out.println("\nWhat is the truck name?");
			userTruckName = kb.nextLine();

			if (i >= 3 && userTruckName.equalsIgnoreCase("quit")) {
				break;

			} else if (i < 3 && userTruckName.toLowerCase().contains("quit")) {
				System.out.println("You must have at least 3 trucks!");

			}

			System.out.println("\nWhat is the rating of this truck? (Between 1 & 5)");
			userTruckRating = kb.nextInt();
			kb.nextLine();
			
			System.out.println("\nWhat type of food does this truck have?");			
			userFoodType = kb.nextLine();

			foodTrucks[i] = new FoodTruck(userTruckName, userTruckRating, userFoodType);
			
			i++;

		}

		this.foodTrucks = foodTrucks;

	}

	public void printMenu() {

		System.out.println("=========================");
		System.out.println("\tMenu");
		System.out.println("|=========================|");
		System.out.println("|1) - List Trucks         |");
		System.out.println("|2) - Average Rating      |");
		System.out.println("|3) - Highest Rating      |");
		System.out.println("|4) - Quit                |");
		System.out.println("|_________________________|");
		System.out.print("choice: ");

		switch (kb.next()) {
		case "1":
			listTrucks();
			break;
		case "2":
			averageRating();
			break;
		case "3":
			highestRated();
			break;
		case "4":
			System.out.println("Thank you for using the Food Truck App!");
			System.exit(0);
		default:
			System.out.println("* Invalid choice, Try again.");
			break;
		}

		printMenu();
	}

	public void listTrucks() {
		System.out.println("You now have " + foodTrucks.length + " trucks.");
		
		for (FoodTruck ft : foodTrucks) {
			if (ft == null) {
				continue;
			} else {
				System.out.println(ft.toString());
			}
		}
	}

	public void averageRating() {
		int rateTracker = 0;
		double averageRating = 0;
		
		for (int i = 0; i < foodTrucks.length; i++) {
			if (foodTrucks[i] == null) {
				continue;
			} else {
				int rating = foodTrucks[i].getTruckRating();
				
				averageRating += rating;
				
				rateTracker++;
			}

		}
		double totalAverageRating = averageRating / rateTracker;
		System.out.println("The average rating of these trucks is: " + totalAverageRating);
	}

	public void highestRated() {
		int rating = 0;
		String highestTruck = "";
		
		for (int i = 0; i < foodTrucks.length; i++) {
			if (foodTrucks[i] == null) {
				continue;
			} else if (foodTrucks[i].getTruckRating() > rating) {
				rating = foodTrucks[i].getTruckRating();
				highestTruck = foodTrucks[i].toString();
			}
		}
		
		System.out.println("The highest rated truck is: " + highestTruck);
	}

}
