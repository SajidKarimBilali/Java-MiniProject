package com;

import java.util.ArrayList;

public class Travel {

	public boolean isCarDriver(Boolean isValid) {
		return isValid;
	}

	public static String RetrivebyDriverId(ArrayList<Driver> drivers, int driverID) {
		for (Driver listDriver : drivers) {
			if (listDriver.getDriverId() == driverID) {
				return "Driver name is " + listDriver.getDriverName() + " Belonging to the category "
						+ listDriver.getCatagory() + " traveled " + listDriver.getTotalDistance() + " KM so far";
			}
		}
		return "Driver Not Found";

	}

	public static int RetriveCountOfDriver(ArrayList<Driver> drivers, String category) {
		int count = 0;
		for (Driver listDriver : drivers) {

			if (listDriver.getCatagory().equalsIgnoreCase(category)) {

				count++;

			}
		}
		return count;

	}

	public static ArrayList<Driver> retriveDriver(ArrayList<Driver> drivers, String category) {
		ArrayList<Driver> driversList = new ArrayList<>();
		for (Driver listDriver : drivers) {

			if (listDriver.getCatagory().equalsIgnoreCase(category)) {

				driversList.add(listDriver);

			}
		}
		return driversList;
	}

	public static int RetriveMaximumDistanceTravelledDriver(ArrayList<Driver> drivers) {
		ArrayList<Integer> driversList = new ArrayList<>();
		for (Driver listDriver : drivers) {

			driversList.add(listDriver.getTotalDistance());

		}
		int max = driversList.get(1);
		for (Integer value : driversList) {
			if (value > max) {
				max = value;
			}
		}
		return max;
	}

}
