package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class ChildSeatDecorator extends AbstractTaxiDecorator {
	
	public ChildSeatDecorator(TaxiOrder order) {
		super(order);
	}
	
	@Override
	public BigDecimal getCost() {
		return super.getCost().add(new BigDecimal(2));
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + " + child seat";
	}
}
