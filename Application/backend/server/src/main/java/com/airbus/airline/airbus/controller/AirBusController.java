package com.airbus.airline.airbus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airbus.airline.airbus.model.Flight;
import com.airbus.airline.airbus.model.Search;
import com.airbus.airline.airbus.model.ViewDetails;
import com.airbus.airline.airbus.service.SeachService;

@RestController
@RequestMapping("/airbus")
public class AirBusController {
	
	
	@Autowired
	SeachService services;

	@GetMapping("/hello")
	public String test(){
		return "Hello World";
	}
	
	
	
	@PostMapping("/search")
	public ResponseEntity<List<Flight>> search(Search search){
		List<Flight> list = services.searchResult(search);
		return new ResponseEntity<List<Flight>>(list, new HttpHeaders(), HttpStatus.OK);
	}
	
	@PostMapping("/view")
	public void view(ViewDetails view){
		
	}
	
	
}
