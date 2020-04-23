package com.jm.model;

import java.math.BigDecimal;

public class TwoWheelerCharge extends Charge{

	private final BigDecimal unitCharge;
	
	public TwoWheelerCharge(BigDecimal unitCharge) {
		this.unitCharge = unitCharge;
	}

	@Override
	public BigDecimal generateBill(long hour) {		
		return unitCharge.multiply(new BigDecimal(hour));
	}

	public BigDecimal getUnitCharge() {
		return unitCharge;
	}
}
