package com.javainuse.dao;



import org.springframework.data.repository.CrudRepository;

import com.javainuse.model.Buyer;



public interface BuyerRepository extends CrudRepository<Buyer,String> {
Iterable<Buyer> findAll();
}

