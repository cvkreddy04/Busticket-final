package com.javainuse.dao;

import org.springframework.data.repository.CrudRepository;

import com.javainuse.model.Busticket;




public interface BusticketRepository extends CrudRepository<Busticket,Integer>{
	Iterable<Busticket> findAll();
}

