package com.jm.model;

import java.util.Date;

public class ParkingLot {

	private SlotManager twoWheelerSlotManager;
	private SlotManager fourWheelerSlotManager;
	private SlotManager heavyDutySlotManager;

	public ParkingLot(long twoWheelerLimit, long fourWheelerLimit, long heavyDutyLimit) {
		this.twoWheelerSlotManager = new SlotManager(twoWheelerLimit);
		this.fourWheelerSlotManager = new SlotManager(fourWheelerLimit);
		this.fourWheelerSlotManager = new SlotManager(heavyDutyLimit);
	}

	public boolean checkIn(Vehicle vehicle) {
		try {
			return allocateSlot(this.getSlotManager(vehicle), vehicle);
		}catch(Exception ex) {
			System.out.println("Invalid vehicle type");
		}		
		return false;
	}

	private SlotManager getSlotManager(Vehicle vehicle) throws Exception {
		switch (vehicle.getType()) {
		case TwoWheeler:
			return this.twoWheelerSlotManager;
		case FourWheeler:
			return this.fourWheelerSlotManager;
		case HeavyDuty:
			return this.heavyDutySlotManager;
		default:
			throw new Exception("Invalid vehicle type");
		}
	}

	private boolean allocateSlot(SlotManager manager, Vehicle vehicle) {
		if (isSlotAvailable(manager)) {
			vehicle.setInTime(new Date());
			manager.allocateVehicleSlot(vehicle);
			return true;
		} else {
			System.out.println("No slot available");
			return false;
		}
	}

	private boolean isSlotAvailable(SlotManager manager) {
		return manager.isFree();
	}

	public void checkOut(Vehicle vehicle) {

	}
}
