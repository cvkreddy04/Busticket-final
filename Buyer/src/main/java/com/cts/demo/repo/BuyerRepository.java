package com.cts.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.cts.demo.pojo.Buyer;

public interface BuyerRepository extends CrudRepository<Buyer,String> {
Iterable<Buyer> findAll();
}
