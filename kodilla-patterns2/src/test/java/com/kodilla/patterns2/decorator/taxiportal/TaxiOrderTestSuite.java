package com.kodilla.patterns2.decorator.taxiportal;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TaxiOrderTestSuite {
	
	@Test
	public void testBasicTaxiOrderGetCost() {
		//Given
		TaxiOrder theOrder = new BasicTaxiOrder();
		
		//When
		BigDecimal calcuatedCost = theOrder.getCost();
		//Then
		assertEquals(new BigDecimal(5),calcuatedCost);
	}
	
	@Test
	public void testBasicTaxiOrderGetDescription() {
		//Given
		//Given
		TaxiOrder theOrder = new BasicTaxiOrder();
		
		//When
		String description = theOrder.getDescription();
		
		//Then
		assertEquals("Drive a course",description);
	}
	@Test
	public void testTaxNetworkiOrderGetCost() {
		//Given
		TaxiOrder theOrder = new BasicTaxiOrder();
		theOrder= new TaxiNetworkOrderDecorator(theOrder);
		
		//When
		BigDecimal calcuatedCost = theOrder.getCost();
		//Then
		assertEquals(new BigDecimal(40),calcuatedCost);
	}
	
	@Test
	public void testTaxiNey4tworkOrderGetDescription() {
		//Given
		//Given
		TaxiOrder theOrder = new BasicTaxiOrder();
		theOrder= new TaxiNetworkOrderDecorator(theOrder);
		//When
		String description = theOrder.getDescription();
		
		//Then
		assertEquals("Drive a course by Taxi Network",description);
	}
	
	@Test
	public void testMyTaxiWithChildSeatsCost() {
		//Given
		TaxiOrder theOrder = new BasicTaxiOrder();
		theOrder= new MyTaxiNetworkOrderDecorator(theOrder);
		theOrder = new ChildSeatDecorator(theOrder);
		
		//When
		BigDecimal calcuatedCost = theOrder.getCost();
		//Then
		Assert.assertEquals(new BigDecimal(37),calcuatedCost);
	}
	
	@Test
	public void testMyTaxiWithChildSeatDesc() {
		
		//Given
		TaxiOrder theOrder = new BasicTaxiOrder();
		theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
		theOrder = new ChildSeatDecorator(theOrder);
		
		//When
		String description = theOrder.getDescription();
		
		//Then
		Assert.assertEquals("Drive a course by MyTaxi Network + child seat", description);
	}
	
	@Test
	public void testUberWithTwoChildSeatCost() {
		//Given
		TaxiOrder theOrder = new BasicTaxiOrder();
		theOrder= new MyTaxiNetworkOrderDecorator(theOrder);
		theOrder = new ChildSeatDecorator(theOrder);
		theOrder = new ChildSeatDecorator(theOrder);

		//When
		BigDecimal calcuatedCost = theOrder.getCost();
		//Then
		assertEquals(new BigDecimal(39),calcuatedCost);

	}

	@Test
	public void testUberWithTwoChildSeatDesc() {

		//Given
		TaxiOrder theOrder = new BasicTaxiOrder();
		theOrder= new MyTaxiNetworkOrderDecorator(theOrder);
		theOrder = new ChildSeatDecorator(theOrder);
		theOrder = new ChildSeatDecorator(theOrder);

		//When
		String description = theOrder.getDescription();

		//Then
		assertEquals("Drive a course by MyTaxi Network + child seat + child seat",description);
		
	}
	@Test
	public void testVipTaxiWithChildSeatExpressGetCost() {
		
		//Given
		TaxiOrder theOrder = new BasicTaxiOrder();
		theOrder= new MyTaxiNetworkOrderDecorator(theOrder);
		theOrder = new VipCarDecorator(theOrder);
		theOrder = new ChildSeatDecorator(theOrder);
		System.out.println(theOrder.getCost());
		
		//When
		BigDecimal theCost = theOrder.getCost();
		
		//Then
		assertEquals(new BigDecimal(47), theCost);
		
	}
	@Test
	public void testVipTaxiWithChildSeatExpressGetDescription() {
		
		//Given
		TaxiOrder theOrder = new BasicTaxiOrder();
		theOrder= new TaxiNetworkOrderDecorator(theOrder);
		theOrder = new VipCarDecorator(theOrder);
		theOrder = new ChildSeatDecorator(theOrder);
		System.out.println(theOrder.getDescription());
		
		//When
		String description = theOrder.getDescription();
		
		//Then
		assertEquals("Drive a course by Taxi Network variant VIP + child seat",description);
		
	}
}
