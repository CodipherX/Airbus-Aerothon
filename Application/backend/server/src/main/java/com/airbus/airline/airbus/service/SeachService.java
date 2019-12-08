package com.airbus.airline.airbus.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.airbus.airline.airbus.model.Booking;
import com.airbus.airline.airbus.model.Flight;
import com.airbus.airline.airbus.model.Search;
import com.airbus.airline.airbus.model.User;
import com.airbus.airline.airbus.model.ViewDetails;

@Service
public interface SeachService {

	public List<Flight> searchResult(Search search);
	
	public List<ViewDetails> viewBookings(ViewDetails view);
	
	public boolean bookAllocation(Booking book);
}
