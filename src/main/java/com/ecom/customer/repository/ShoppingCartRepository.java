package com.ecom.customer.repository;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecom.customer.model.ShoppingCart;

/**
 * @author quanhoang
 * Rest Repository for ShoppingCart resource
 */
@RepositoryRestResource(path = "shoppingCart", itemResourceRel = "shoppingCart", collectionResourceRel = "shoppingCarts")
public interface ShoppingCartRepository extends PagingAndSortingRepository<ShoppingCart, UUID> {
	
	@RestResource(path = "byCustomerId")
	ShoppingCart findByOwner_customerId(@RequestParam UUID customerId);
	
	@Override
	@RestResource(exported = false)
	void delete(ShoppingCart arg0);

	@Override
	@RestResource(exported = false)
	void deleteAll();

	@Override
	@RestResource(exported = false)
	void deleteAll(Iterable<? extends ShoppingCart> arg0);

	@Override
	@RestResource(exported = false)
	void deleteById(UUID arg0);

	@Override
	@RestResource(exported = false)
	<S extends ShoppingCart> S save(S arg0);

	@Override
	@RestResource(exported = false)
	<S extends ShoppingCart> Iterable<S> saveAll(Iterable<S> arg0);

}
