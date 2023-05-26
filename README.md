# System-Design

Parking Lot System Design 

•	System Design 
•	Scale 
•	APIs 
•	Concurrency 
•	Distributed . 

Use Cases :
	When User enters  we generate a ticket 
	On exit  we generate the price 
Get more details about the problem 
•	What details should be there in  a ticket
o	Vehicle Number , Parking Spot , time of entry , Unique ID for tracking 
•	Allocation of Parking to User 
o	Are there different types of parking 
	Small, Medium , Large This can be type of Vehicle also . 
•	How Parking Spot is decided 
o	It can have different strategies (ex : Heavy vehicles on Lower floors and Lighter vehicles on upper floors . )
•	What is Logic for Generating Price 
o	It can have different strategies depending on type of vehicle etc. 
 

Parking for One Parking lot ( 10 floors * 500 vehicles)  fits in one machine 
•	what if we want to support  for 1 million Parking Lots. 
o	Need to build a distributed solution , but we first build non-distributed solution. 



     






 

Internal APIs 
SlotService   {
  Parkinglot  allocate(VehicleType type);
  Boolean unallocate(long parkingSlotId); 
}
PricingService {
    double  calculate(VehicleType type, Date inTime, Date outTime)
}

Concurrency  (More than one entry/ exit) 
•	Only need to solve for SlotService 
•	Steps to take 
o	Query to find available Slots 
o	Pick Slot to Allocate 
o	Try lock on a slot , If Unavailable Wait. If Fails , Pick another Slot. 
o	Assign Slot to Vehicle , make it occupied . 
o	Unlock 
