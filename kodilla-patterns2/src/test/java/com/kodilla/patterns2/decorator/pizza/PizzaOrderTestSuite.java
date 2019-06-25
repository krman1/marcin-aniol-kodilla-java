package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;
import static org.junit.Assert.*;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {
	
	@Test
	public void testBasicPizzaOrderGetCost() {
		//Given
		PizzaOrder theOrder = new BasicPizzaOrder();
		//When
		BigDecimal calculatedCost = theOrder.getCost();
		//Then
		assertEquals(new BigDecimal(15), calculatedCost);
	}
	
	@Test
	public void testBasicPizzaOrderGetDescription() {
		//Given
		PizzaOrder theOrder = new BasicPizzaOrder();
		//When
		String description = theOrder.getDescription();
		//Then
		assertEquals("Pizza with tomato sos and cheese", description);
	}
	
	@Test
	public void testPizzaWithMashroomGetCost() {
		//Given
		PizzaOrder theOrder = new BasicPizzaOrder();
		theOrder = new MashroomDecorator(theOrder);
		//When
		BigDecimal theCost = theOrder.getCost();
		//Then
		assertEquals(new BigDecimal(16.5), theCost);
	}
	
	@Test
	public void testPizzaWithMashroomsGetDescription() {
		//Given
		PizzaOrder theOrder = new BasicPizzaOrder();
		theOrder = new MashroomDecorator(theOrder);
		//When
		String description = theOrder.getDescription();
		//Then
		assertEquals("Pizza with tomato sos and cheese, mashrooms", description);
	}
	
	@Test
	public void testPizzaWithChickenAndExtraCheeseAndArugulaGetCost() {
		//Given
		PizzaOrder theOrder = new BasicPizzaOrder();
		theOrder = new ChickenDecorator(theOrder);
		theOrder = new ExtraCheeseDecorator(theOrder);
		theOrder = new ArugulaDecorator(theOrder);
		//When
		BigDecimal theCost = theOrder.getCost();
		//Then
		assertEquals(new BigDecimal(22), theCost);
	}
	
	@Test
	public void testPizzaWithChickenAndExtraCheeseAndArugulaDescription() {
		//Given
		PizzaOrder theOrder = new BasicPizzaOrder();
		theOrder = new ChickenDecorator(theOrder);
		theOrder = new ExtraCheeseDecorator(theOrder);
		theOrder = new ArugulaDecorator(theOrder);
		//When
		String description = theOrder.getDescription();
		//Then
		assertEquals("Pizza with tomato sos and cheese, chicken, extra chesse, arugula", description);
	}
	
	@Test
	public void testPizzaWithSalamiGetCost(){
		//Given
		PizzaOrder theOrder = new BasicPizzaOrder();
		theOrder = new SalamiDecorator(theOrder);
		//When
		BigDecimal theCost = theOrder.getCost();
		//Then
		assertEquals(new BigDecimal(17.50), theCost);
	}
	
	@Test
	public void testPizzaWithCheeseCrustGetDescription(){
		//Given
		PizzaOrder theOrder = new BasicPizzaOrder();
		theOrder = new SalamiDecorator(theOrder);
		//When
		String description = theOrder.getDescription();
		//Then
		assertEquals("Pizza with tomato sos and cheese, salami", description);
	}
}
