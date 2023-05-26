/**
 * 
 */
package com.sysd.parking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Addula Umamahesh
 *
 */
public class ParkingLot {
	
	private List<CompactSpot> compactSpotList=new ArrayList<>();
	
	private List<LargeSpot> largeSpotList=new ArrayList<>();;
	
	private List<BikeSpot> bikeSpotList=new ArrayList<>();;
	
	private int compactSpots;
	
	private int largeSpots;
	
	private int bikeSpots;

	
	
	/**
	 * @param compactSpots
	 * @param largeSpots
	 * @param bikeSpots
	 */
	public ParkingLot(int compactSpots, int largeSpots, int bikeSpots) {
		this.compactSpots = compactSpots;
		this.largeSpots = largeSpots;
		this.bikeSpots = bikeSpots;
	}

	public void parkVehicle(Vehicle vehicle) {
		
		if(vehicle.getVehicleType().equals(VehicleType.TRUCK)) {
			  if(largeSpots > 0)
			      parkYourLargeVehicle(vehicle);
		      else 
			      System.out.println("Sorry All largeSpots are full ");
		} else if(vehicle.getVehicleType().equals(VehicleType.CAR)) {
			if(compactSpots > 0) 
				 parkYourCompactVehicle(vehicle);
			else if(largeSpots > 0) 
				  parkYourLargeVehicle(vehicle);
			else 
			      System.out.println("Sorry neither large nor compact Spots are Available ");
		} else if(vehicle.getVehicleType().equals(VehicleType.BIKE)) {
			if(bikeSpots > 0 )
				parkYourBikeVehicle(vehicle);
			else if(compactSpots > 0) 
				parkYourCompactVehicle(vehicle);
			else if(largeSpots > 0 ) 
				parkYourLargeVehicle(vehicle);
			else 
				 System.out.println("Sorry neither large nor compact or Bike spots are Available ");
		}
		
			
	}
	
	
	private void parkYourBikeVehicle(Vehicle vehicle) {
		BikeSpot bikeSpot = new BikeSpot(ParkingSpotType.BIKE);
		bikeSpot.setFree(false);
		bikeSpot.setVehicle(vehicle);
		vehicle.setParkingSpot(bikeSpot);
		
		bikeSpotList.add(bikeSpot);
		bikeSpots--; 
		
	}

	private void parkYourLargeVehicle(Vehicle vehicle) {
		LargeSpot largeSpot = new LargeSpot(ParkingSpotType.LARGE);
		largeSpot.setFree(false);
		largeSpot.setVehicle(vehicle);
		vehicle.setParkingSpot(largeSpot);
		
		largeSpotList.add(largeSpot);
		System.out.println(" We have successfully parked your "+vehicle.getVehicleType());
		largeSpots--; 
		
	}
	
	private void parkYourCompactVehicle(Vehicle vehicle) {
		CompactSpot compactSpot = new CompactSpot(ParkingSpotType.COMPACT);
		compactSpot.setFree(false);
		compactSpot.setVehicle(vehicle);
		vehicle.setParkingSpot(compactSpot);
		
		compactSpotList.add(compactSpot);
		compactSpots--; 
		
	}
	
	public void unParkVehicle(Vehicle vehicle) {
		System.out.println("we are about to Unpark or remove vehicle of type"+vehicle.getVehicleType());
		ParkingSpot parkingSpot = vehicle.getParkingSpot();
		if(vehicle.getVehicleType().equals(VehicleType.TRUCK)) {
			if(largeSpotList.remove(parkingSpot)) {
				System.out.println("we have succesully reoved vehicle ");
				largeSpots++; 
			}else 
				System.out.println("We dont have vehicle parked at this parking lot ");
			
		}else if(vehicle.getVehicleType().equals(VehicleType.CAR)) {
			if(compactSpotList.remove(parkingSpot)) {
				System.out.println("WE have succesfully removed vehicle ");
				compactSpots++; 
			}else 
				System.out.println("we dont have vehcile parked at this parking lot");
		}else if(vehicle.getVehicleType().equals(VehicleType.BIKE)) {
			if(bikeSpotList.remove(parkingSpot)) {
				System.out.println("WE have succesfully removed vehicle ");
				bikeSpots++; 
			}else 
				System.out.println("we dont have vehcile parked at this parking lot");
		}
			
		
		
	}

	public List<CompactSpot> getCompactSpotList() {
		return compactSpotList;
	}

	public void setCompactSpotList(List<CompactSpot> compactSpotList) {
		this.compactSpotList = compactSpotList;
	}

	

	public List<LargeSpot> getLargeSpotList() {
		return largeSpotList;
	}

	public void setLargeSpotList(List<LargeSpot> largeSpotList) {
		this.largeSpotList = largeSpotList;
	}

	public List<BikeSpot> getBikeSpotList() {
		return bikeSpotList;
	}

	public void setBikeSpotList(List<BikeSpot> bikeSpotList) {
		this.bikeSpotList = bikeSpotList;
	}

	public int getCompactSpots() {
		return compactSpots;
	}

	public void setCompactSpots(int compactSpots) {
		this.compactSpots = compactSpots;
	}

	public int getLargeSpots() {
		return largeSpots;
	}

	public void setLargeSpots(int largeSpots) {
		this.largeSpots = largeSpots;
	}

	public int getBikeSpots() {
		return bikeSpots;
	}

	public void setBikeSpots(int bikeSpots) {
		this.bikeSpots = bikeSpots;
	}
	
	
	

}
