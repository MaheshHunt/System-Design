package com.sysd.parking;

public class Vehicle {
	
	private int vehicleNumber;
	
	private VehicleType vehicleType;
	
	private ParkingSpot parkingSpot; 

	/**
	 * @param vehicleType
	 */
	public Vehicle(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(int vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public ParkingSpot getParkingSpot() {
		return parkingSpot;
	}

	public void setParkingSpot(ParkingSpot parkingSpot) {
		this.parkingSpot = parkingSpot;
	} 
	
	
	

}
