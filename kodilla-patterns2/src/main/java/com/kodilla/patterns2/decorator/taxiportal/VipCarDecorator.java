package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class VipCarDecorator extends AbstractTaxiDecorator {
	
	public VipCarDecorator(TaxiOrder order) {
		super(order);
	}
	
	@Override
	public BigDecimal getCost() {
		return super.getCost().add(new BigDecimal(10));
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + " variant VIP";
	}
	
}
