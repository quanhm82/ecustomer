package com.ecom.customer.repository;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ecom.customer.model.Customer;

/**
 * @author quanhoang
 * Rest Repository for Customer resource
 */
@RepositoryRestResource(path = "customer", itemResourceRel = "customer", collectionResourceRel = "customers")
public interface CustomerRepository extends PagingAndSortingRepository<Customer, UUID> {

}
