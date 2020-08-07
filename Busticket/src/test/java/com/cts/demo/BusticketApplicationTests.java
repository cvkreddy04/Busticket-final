package com.cts.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.cts.demo.controller.BusticketController;
import com.cts.demo.pojo.Busticket;
import com.cts.demo.repo.BusticketRepository;

@SpringBootTest
@ExtendWith(value = SpringExtension.class)
class BusticketApplicationTests {
	 @Autowired
	 private BusticketRepository busticketrepository;
	 @Autowired

	 private BusticketController busticketController;
	 @BeforeEach
	 public void setUp() {
		 Busticket busticket = new Busticket();

		 busticket.setBusno(222);

		 busticket.setName("ven");

		 busticket.setSeats(2);

		 busticket.setPrice(22);

		 busticket.setDate(1998-2-2);

		 busticket.setTime(2);

		 busticket.setSource("Hyd");

		 busticket.setDestination("Chn");
		 
		 busticketrepository.save(busticket);
		 
	 }
		 
	 @AfterEach

	 public void cleanUp() {

		 busticketrepository.deleteAll();

	 }
	 
	 
	 
	@Test
	 void shouldSaveBusticket() {
		
		Busticket busticket = new Busticket();
		
		 busticket.setBusno(212);

		 busticket.setName("ven");

		 busticket.setSeats(2);

		 busticket.setPrice(22);

		 busticket.setDate(1998-2-2);

		 busticket.setTime(2);

		 busticket.setSource("Hyd");

		 busticket.setDestination("Chn");
		 
		 busticketrepository.save(busticket);
		
		 
		 Busticket savedBusticket = busticketController.saveBusticket(busticket);
		 
		 Assertions.assertThat(savedBusticket.getBusno()).isEqualTo(busticket.getBusno());
	
		 Assertions.assertThat(savedBusticket.getName()).isEqualTo(busticket.getName());
		 
		 Assertions.assertThat(savedBusticket.getSeats()).isEqualTo(busticket.getSeats());
		 
		 Assertions.assertThat(savedBusticket.getPrice()).isEqualTo(busticket.getPrice());
		 
		 Assertions.assertThat(savedBusticket.getDate()).isEqualTo(busticket.getDate());
		 
		 Assertions.assertThat(savedBusticket.getTime()).isEqualTo(busticket.getTime());
	
		 Assertions.assertThat(savedBusticket.getSource()).isEqualTo(busticket.getSource());
		 
		 Assertions.assertThat(savedBusticket.getDestination()).isEqualTo(busticket.getDestination());
	}
	
	@Test
	
	void shouldUpdateSavedBusticket() {

		Busticket busticket = new Busticket();
		
		 busticket.setBusno(212);

		 busticket.setName("venky");

		 busticket.setSeats(2);

		 busticket.setPrice(22);

		 busticket.setDate(1998-2-2);

		 busticket.setTime(2);

		 busticket.setSource("Hyder");

		 busticket.setDestination("Chennai");
		 
		 busticketrepository.save(busticket);		 
		 Busticket updatedBusticket = busticketController.updateBusticket(busticket,212);
		 
		 Assertions.assertThat(busticket.getBusno()).isEqualTo(busticket.getBusno());
			
	}
	
	@Test
	
	void shouldDeleteBusticket() {
		
		boolean deletedBusticket = busticketController.deleteBusticket(222);
		 

		 Assertions.assertThat(deletedBusticket).isTrue();
		 
		 Assertions.assertThat(busticketrepository.findAll()).hasSize(0);
	}
	
	
	void shouldRetriveBuyer() {
	
		Busticket foundBusticket=busticketController.findOneInAll3(123);

		Assertions.assertThat(foundBusticket).isNotNull();
	}
	
}
