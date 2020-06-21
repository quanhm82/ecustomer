package com.ecom.customer.repository;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ecom.customer.model.ShoppingCart;

/**
 * @author quanhoang
 * Rest Repository for ShoppingCart resource
 */
@RepositoryRestResource(path = "shoppingCart", itemResourceRel = "shoppingCart", collectionResourceRel = "shoppingCarts")
public interface ShoppingCartRepository extends PagingAndSortingRepository<ShoppingCart, UUID> {

}
