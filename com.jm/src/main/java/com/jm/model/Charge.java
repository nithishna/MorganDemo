package com.jm.model;

import java.math.BigDecimal;

public abstract class Charge {

	private long id;
	private long noOfHours;
	private boolean isFloor;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getNoOfHours() {
		return noOfHours;
	}
	public void setNoOfHours(long noOfHours) {
		this.noOfHours = noOfHours;
	}
	public boolean isFloor() {
		return isFloor;
	}
	public void setFloor(boolean isFloor) {
		this.isFloor = isFloor;
	}
	public abstract BigDecimal generateBill(long hour);
}
