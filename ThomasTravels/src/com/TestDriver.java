package com;

import java.util.ArrayList;
import java.util.Scanner;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String category = input.next().toLowerCase();
		Boolean isValid = false;

		switch (category) {
		case "car":
		case "lorry":
		case "auto":
			isValid = true;
			break;
		default:
			isValid = false;
		}

		Travel objTravel = new Travel();
		// Validate driver
		objTravel.isCarDriver(isValid);

		ArrayList<Driver> drivers = new ArrayList<>();
		drivers.add(new Driver("car", 1, "Sudhagar", 200));
		drivers.add(new Driver("auto", 2, "BabuBhai", 500));
		drivers.add(new Driver("car", 3, "Nitesh", 45000));
		drivers.add(new Driver("lorry", 4, "Ustaad", 42000));

		// Getting searched Drivers
		String message = Travel.RetrivebyDriverId(drivers, 2);
		System.out.println(message);

		// Getting count of Searched Number of list
		int noOfDrivers = Travel.RetriveCountOfDriver(drivers, category);
		System.out.println("count of drivers. " + noOfDrivers);

		// Getting List of searched Category
		ArrayList<Driver> noOfDriversList = Travel.retriveDriver(drivers, category);
		for (Driver matchingDrivers : noOfDriversList) {
			System.out.println(matchingDrivers.getDriverName() + " - " + matchingDrivers.getCatagory());
		}

		// Getting MaximumDisttance TravelledDriver
		int maximumTravelledList = Travel.RetriveMaximumDistanceTravelledDriver(noOfDriversList);
		System.out.println("the driver " + drivers.get(2).getDriverName() + " who traveled maximum distance is"
				+ maximumTravelledList);

	}

}
