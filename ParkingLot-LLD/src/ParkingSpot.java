package com.sysd.parking;

public class ParkingSpot {
	
	private ParkingSpotType parkingSpotType; 
	
	private Vehicle vehicle ;
	
	private boolean free;

	public ParkingSpot(ParkingSpotType spotType) {
		this.parkingSpotType=spotType; 
	}
	public ParkingSpotType getParkingSpotType() {
		return parkingSpotType;
	}

	public void setParkingSpotType(ParkingSpotType parkingSpotType) {
		this.parkingSpotType = parkingSpotType;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	} 
	
	

}
