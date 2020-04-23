package com.jm.service;

import com.jm.model.ParkingLot;
import com.jm.model.Vehicle;
import com.jm.model.VehicleType;

public class SampleService {

	public static void main(String args[]) {
		ParkingLot parkingLot = new ParkingLot(2, 5, 10);
		Vehicle vehicle = new Vehicle();
		vehicle.setType(VehicleType.TwoWheeler);
		vehicle.setVehicleNo("UK10");
		parkingLot.checkIn(vehicle);
		parkingLot.checkIn(vehicle);
		
		vehicle = new Vehicle();
		vehicle.setType(VehicleType.TwoWheeler);
		vehicle.setVehicleNo("UK11");
		parkingLot.checkIn(vehicle);
		
		vehicle = new Vehicle();
		vehicle.setType(VehicleType.TwoWheeler);
		vehicle.setVehicleNo("UK12");
		parkingLot.checkIn(vehicle);
	}
}
