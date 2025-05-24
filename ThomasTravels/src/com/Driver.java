package com;

public class Driver {
	String Catagory;
	int DriverId;
	String driverName;
	Integer TotalDistance;

	public Driver() {
	}

	public Driver(String catagory, int driverId, String driverName, Integer totalDistance) {
		super();
		Catagory = catagory;
		DriverId = driverId;
		this.driverName = driverName;
		TotalDistance = totalDistance;
	}

	public String getCatagory() {
		return Catagory;
	}

	public void setCatagory(String catagory) {
		Catagory = catagory;
	}

	public int getDriverId() {
		return DriverId;
	}

	public void setDriverId(int driverId) {
		DriverId = driverId;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public Integer getTotalDistance() {
		return TotalDistance;
	}

	public void setTotalDistance(Integer totalDistance) {
		TotalDistance = totalDistance;
	}

}
