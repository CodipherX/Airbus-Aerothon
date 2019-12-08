package com.airbus.airline.airbus.dao;

import java.util.List;

import com.airbus.airline.airbus.model.Flight;
import com.airbus.airline.airbus.model.Search;
import com.airbus.airline.airbus.model.ViewDetails;

public interface AirBusDao {
	
	public List<Flight> fetchFlight(Search search);
	
	public List<ViewDetails> viewBookingsForAdmin(ViewDetails view);
	
	public List<ViewDetails> viewBookingsForUser(ViewDetails view);

}
