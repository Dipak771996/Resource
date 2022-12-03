package com.BikkadIT.MMT.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.BikkadIT.MMT.model.Passenger;
import com.BikkadIT.MMT.model.Ticket;
import com.BikkadIT.MMT.service.ServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class PassengerController {

	@Autowired
	private ServiceImpl serviceImpl;
	
	@PostMapping(value = "/bookTicket",consumes = "application/json",produces = "application/json")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger) 
	{
		System.out.println(passenger);
		Ticket ticket = serviceImpl.getTicket(passenger);
		
		if(ticket!=null)
		{
			return new ResponseEntity<Ticket>(ticket,HttpStatus.CREATED);
		}
		
		return new ResponseEntity<Ticket>(ticket,HttpStatus.BAD_REQUEST);

		
	}
}
