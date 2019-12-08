package com.airbus.airline.airbus.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.airbus.airline.airbus.model.Flight;
import com.airbus.airline.airbus.model.Search;
import com.airbus.airline.airbus.model.ViewDetails;

@Component
public class AirBusDaoImpl implements AirBusDao {

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private final static String SEARCH_LENGTH = "Select ";  
	
	
	@Override
	public List<Flight> fetchFlight(Search search) {
		// TODO Auto-generated method stub
		
		
		return null;
	}

	@Override
	public List<ViewDetails> viewBookingsForAdmin(ViewDetails view) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ViewDetails> viewBookingsForUser(ViewDetails view) {
		// TODO Auto-generated method stub
		return null;
	}

}
