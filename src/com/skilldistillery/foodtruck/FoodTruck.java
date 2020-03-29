package com.skilldistillery.foodtruck;

public class FoodTruck {

	private String truckName;
	private int truckRating;
	private String foodType;
	private int id;
	private static int uniqueId = 1;
	

	public FoodTruck(String _truckName, int truckRating, String foodType) {
		
		truckName = _truckName;
		this.truckRating = truckRating;
		this.foodType = foodType;
		this.id = uniqueId;
		uniqueId++;
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
		return " Truck Name= " + truckName + ", Truck Rating= " + truckRating + ", Food Type= " + foodType + ", ID= " 
				+ id ;
	}

}
