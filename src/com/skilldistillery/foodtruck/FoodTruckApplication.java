package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApplication {

	private Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args) {
		FoodTruckApplication fta = new FoodTruckApplication();
		FoodTruck[] foodtrucks = fta.createFoodTrucks();
		
		while(true) {
			fta.printMenu(foodtrucks);
		}

	}

	

	public FoodTruck[] createFoodTrucks() {
		FoodTruck[] foodTrucks = new FoodTruck[5];
		String userTruckName;
		int userTruckRating;
		String userFoodType;
		int i = 0;

		while (i < 5) {
			
			System.out.println("Enter your food trucks, You must have at least 3.");
			System.out.println("You have " + i + " trucks now.");
//			System.out.println("Truck" + (i + 1) + ": ");
			System.out.println("\nWhat is the truck name?");
			userTruckName = kb.nextLine();
			
			if (i >= 3 && userTruckName.equalsIgnoreCase("quit")) {
				break;
				
			} else if (i < 3 && userTruckName.toLowerCase().contains("quit")) {
				System.out.println("You must have at least 3 trucks!");
				
			}
			
			System.out.println("\nWhat is the rating of this truck? (Between 1 & 5)");
			userTruckRating = Integer.parseInt(kb.nextLine());

			System.out.println("\nWhat type of food does this truck have?");
			userFoodType = kb.nextLine();

			foodTrucks[i] = new FoodTruck(userTruckName, userTruckRating, userFoodType);
			i++;

		}
		
		return foodTrucks;

	}
	
	public void printMenu(FoodTruck[] foodTrucks) {
		
		System.out.println("=========================");
		System.out.println("\t\tMenu");
		System.out.println("=========================");
		System.out.println("1) - List Trucks");
		System.out.println("2) - Average Rating");
		System.out.println("3) - I dont know");
		System.out.println("4) - I dont know");
		System.out.println("5) - Quit");
		System.out.println("-------------------------");
		System.out.print("choice: ");
		
		
			switch(kb.next()) {
			case "1":
				listTrucks(foodTrucks);
				break;
			case "2":
				averageRating(foodTrucks);
				break;
			case "3":
				break;
			case "4":
				break;
			case "5":
				System.exit(0);
				default:
					System.out.println("* Invalid choice, Try again.");
					break;
			}
			
			
	}
	
	
	public void listTrucks(FoodTruck[] foodTrucks) {
		System.out.println("You now have " + foodTrucks.length + " trucks.");
		for (FoodTruck ft : foodTrucks) {
			if(ft == null) {
				System.out.println("[Empty]");
				continue;
			}
			System.out.println(ft.toString());
		}
	}
	
	public void averageRating(FoodTruck[] foodTrucks) {
		System.out.println("HEY I DIDN't DO THIS YET");
	}

}
