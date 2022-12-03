package com.BikkadIT.MMT.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.BikkadIT.MMT.model.Passenger;
import com.BikkadIT.MMT.model.Ticket;

@Service
public class ServiceImpl {

	public Ticket getTicket(Passenger passenger)
	{
		String url="http://localhost:7070/getTicket";
		
		WebClient webClient = WebClient.create();	
	
      Ticket ticket = webClient.post()
		         .uri(url)
		         .contentType(MediaType.APPLICATION_JSON)
		         .accept(MediaType.APPLICATION_JSON)
		         .body(BodyInserters.fromValue(passenger))
		         .retrieve()
		         .bodyToMono(Ticket.class)
		         .block();
      
      return ticket;
	
//	RestTemplate rt=new RestTemplate();
//	Ticket ticket = rt.postForObject(url, passenger, Ticket.class)
	}
}
