package com.cts.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.cts.demo.pojo.Busticket;


public interface BusticketRepository extends CrudRepository<Busticket,Integer>{
	Iterable<Busticket> findAll();
}
