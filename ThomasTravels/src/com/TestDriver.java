package com;

import java.util.ArrayList;
import java.util.Scanner;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		// String category = input.next().toLowerCase();
		System.out.println("Add new Entry Of Driver Press 1");
		System.out.println("Find Driver By Id Press 2");
		System.out.println("Find Number Of Drivers By Catagory Press 3");
		System.out.println("Find Perticuler Driver By Catagory Press 4");
		System.out.println("Find maximum distance covered Press 5");

		int choice = input.nextInt();

		Boolean isValid = false;

//		switch (category) {
//		case "car":
//		case "lorry":
//		case "auto":
//			isValid = true;
//			break;
//		default:
//			isValid = false;
//		}

		Travel objTravel = new Travel();
		// Validate driver
		objTravel.isCarDriver(isValid);

		ArrayList<Driver> drivers = new ArrayList<>();
		drivers.add(new Driver("car", 1, "Sudhagar", 200));
		drivers.add(new Driver("auto", 2, "BabuBhai", 500));
		drivers.add(new Driver("car", 3, "Nitesh", 45000));
		drivers.add(new Driver("lorry", 4, "Ustaad", 42000));

		// Adding new Recod
		switch (choice) {
		case 1:
			while (true) {
				// Scanner scanner = new Scanner(System.in);
				System.out.println("Enter Drivers Catagory.");

				String catagory = scanner.nextLine();

				System.out.println("Enter Drivers Id.");

				Integer driverId = scanner.nextInt();

				System.out.println("Enter Drivers Name.");
				scanner.nextLine();
				String driverName = scanner.nextLine();

				System.out.println("Enter Drivers Total Distance.");
				Integer totaldistance = scanner.nextInt();
				scanner.nextLine();
				drivers.add(new Driver(catagory, driverId, driverName, totaldistance));
				for (Driver driver : drivers) {
					System.out.println(" " + driver);
				}
				System.out.println("If you want to exit then Type 'done' .");
				String exit = scanner.nextLine();
				if (exit.equalsIgnoreCase("done")) {
					break;
				}

			}
			break;
		case 2:

			System.out.println("Enter Drivers Id.");

			Integer driverId = scanner.nextInt();
			// Getting searched Drivers
			String message = Travel.RetrivebyDriverId(drivers, driverId);
			System.out.println(message);
			System.out.println("Go Back Menu");

		case 3:

			System.out.println("Enter Drivers Catagory.");

			String catagory = scanner.nextLine();

			// Getting count of Searched Number of list
			int noOfDrivers = Travel.RetriveCountOfDriver(drivers, catagory);
			System.out.println("count of drivers. " + noOfDrivers);
			break;

		case 4:

			System.out.println("Enter Drivers Catagory.");

			String searchedBycatagory = scanner.nextLine();

			// Getting List of searched Category
			ArrayList<Driver> noOfDriversList = Travel.retriveDriver(drivers, searchedBycatagory);
			for (Driver matchingDrivers : noOfDriversList) {
				System.out.println(matchingDrivers.getDriverName() + " - " + matchingDrivers.getCatagory());
			}
			break;

		case 5:

			// Getting MaximumDisttance TravelledDriver
			int maximumTravelledList = Travel.RetriveMaximumDistanceTravelledDriver(drivers);
			System.out.println("the driver " + drivers.get(2).getDriverName() + " who traveled maximum distance is "
					+ maximumTravelledList);
			break;
		default:
			System.out.println("Please Enter Values in mention Order: catagory,Driver Id,Driver Name, Total Distance");

			break;
		}

	}

}
