package com.jm;

import org.junit.Test;

import com.jm.model.ParkingLot;
import com.jm.model.Vehicle;
import com.jm.model.VehicleType;

import junit.framework.Assert;

public class ParkingLotTest {

	@Test
	public void testCheckInSuccess() {
		ParkingLot parkingLot = new ParkingLot(1, 1, 1);
		Vehicle vehicle = new Vehicle();
		vehicle.setType(VehicleType.TwoWheeler);
		vehicle.setVehicleNo("UK10");
		Assert.assertEquals(true, parkingLot.checkIn(vehicle));
		
		vehicle = new Vehicle();
		vehicle.setType(VehicleType.TwoWheeler);
		vehicle.setVehicleNo("UK11");
		Assert.assertEquals(false, parkingLot.checkIn(vehicle));
		
		vehicle = new Vehicle();
		vehicle.setType(VehicleType.FourWheeler);
		vehicle.setVehicleNo("UK12");
		Assert.assertEquals(true, parkingLot.checkIn(vehicle));
		
		vehicle = new Vehicle();
		vehicle.setType(VehicleType.FourWheeler);
		vehicle.setVehicleNo("UK13");
		Assert.assertEquals(false, parkingLot.checkIn(vehicle));		
		
	}
}
