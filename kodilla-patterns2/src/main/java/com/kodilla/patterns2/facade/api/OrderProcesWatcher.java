package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class OrderProcesWatcher {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(com.kodilla.patterns2.facade.api.OrderProcesWatcher.class);
	
	@Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..)) " +
			" && args(orderDto,id) && target(object)")
	public void logEvent(OrderDto orderDto, Long id, Object object) {
		LOGGER.info("Class: " + object.getClass() + ", order id: " + id + ", first prod id: " + orderDto.getItems().get(0).getProductId());
	}
}
