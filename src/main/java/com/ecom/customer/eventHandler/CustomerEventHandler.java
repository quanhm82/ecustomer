package com.ecom.customer.eventHandler;

import java.sql.Timestamp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

import com.ecom.customer.model.Customer;
import com.ecom.customer.model.ShoppingCart;
import com.ecom.customer.repository.ShoppingCartRepository;

/**
 * @author quanhoang
 * Entity event handler for Customer
 */
@Component
@RepositoryEventHandler(Customer.class)
public class CustomerEventHandler {
	Logger logger = LoggerFactory.getLogger(CustomerEventHandler.class);
	
	@Autowired
	ShoppingCartRepository shoppingCartRepository;

	@HandleAfterCreate
	public void afterCreateCustomer(Customer c) {
		logger.info("Init Shopping Cart for {}", c.getCustomerId());
		ShoppingCart cart = new ShoppingCart();
		cart.setLastUpdate(new Timestamp(System.currentTimeMillis()));
		cart.setOwner(c);
		
		shoppingCartRepository.save(cart);
	}
}
