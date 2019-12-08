package com.airbus.airline.airbus.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.airbus.airline.airbus.model.Booking;
import com.airbus.airline.airbus.model.Flight;
import com.airbus.airline.airbus.model.Search;
import com.airbus.airline.airbus.model.ViewDetails;

@Component
public class SeachServiceImpl implements SeachService {

	@Override
	public List<Flight> searchResult(Search search) {
		// TODO Auto-generated method stub
		
		
		
		
		return null;
	}

	@Override
	public List<ViewDetails> viewBookings(ViewDetails view) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean bookAllocation(Booking book) {
		// TODO Auto-generated method stub
		return false;
	}

}
