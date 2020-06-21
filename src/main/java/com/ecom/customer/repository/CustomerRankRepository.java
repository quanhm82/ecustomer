/**
 * 
 */
package com.ecom.customer.repository;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ecom.customer.model.CustomerRank;

/**
 * @author quanhoang
 * Rest Repository for rank resource
 */
@RepositoryRestResource(path = "customerRank", itemResourceRel = "customerRank", collectionResourceRel = "customerRanks")
public interface CustomerRankRepository extends PagingAndSortingRepository<CustomerRank, UUID> {

}
