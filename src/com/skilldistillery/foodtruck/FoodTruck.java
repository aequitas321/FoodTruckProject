package com.skilldistillery.foodtruck;

public class FoodTruck {

	private String truckName;
	private int truckRating;
	private String foodType;
	private int id = 1;
	

	public FoodTruck(String truckName, int truckRating, String foodType, int id) {
		this.truckName = truckName;
		this.truckRating = truckRating;
		this.foodType = foodType;
		this.id = id;
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
		return "FoodTruck [truckName= " + truckName + ", truckRating= " + truckRating + ", foodType= " + foodType + "ID= " 
				+ id + "]";
	}

}
