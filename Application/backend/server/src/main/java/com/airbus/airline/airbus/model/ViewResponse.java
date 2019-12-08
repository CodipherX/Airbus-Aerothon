package com.airbus.airline.airbus.model;

public class ViewResponse {
	
	private String flightName;
	private String srcCode;
	private String destCode;
	
	private Transaction taTransaction;
	private Booking booking;
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getSrcCode() {
		return srcCode;
	}
	public void setSrcCode(String srcCode) {
		this.srcCode = srcCode;
	}
	public String getDestCode() {
		return destCode;
	}
	public void setDestCode(String destCode) {
		this.destCode = destCode;
	}
	public Transaction getTaTransaction() {
		return taTransaction;
	}
	public void setTaTransaction(Transaction taTransaction) {
		this.taTransaction = taTransaction;
	}
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	
	

}
