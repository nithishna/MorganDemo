package com.jm.model;

import java.math.BigDecimal;

public class FourWheelerCharge extends Charge {
	private final BigDecimal unitCharge;
	private final BigDecimal standCharge;

	public FourWheelerCharge(BigDecimal unitCharge, BigDecimal standCharge) {
		this.unitCharge = unitCharge;
		this.standCharge = standCharge;
	}

	/*
	 * BillAmount = unitCharge * hour + standardCharge
	 * */
	@Override
	public BigDecimal generateBill(long hour) {
		return this.unitCharge.multiply(new BigDecimal(hour)).add(this.standCharge);
	}

	public BigDecimal getUnitCharge() {
		return unitCharge;
	}

	public BigDecimal getStandCharge() {
		return standCharge;
	}

}
