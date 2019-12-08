package com.airbus.airline.airbus.model;

import java.util.Date;

public class Flight {

	private int id;
	private String flightNo;
	
	private Destination sourceId;
	private Destination destinationId;
	
	private double price;
	private int seats;
	
	private Date deptTime;
	private Date arrTime;
	
	private Date createdOn;
	private User createdBy;
	
	private Date lastModifiedTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public Destination getSourceId() {
		return sourceId;
	}

	public void setSourceId(Destination sourceId) {
		this.sourceId = sourceId;
	}

	public Destination getDestinationId() {
		return destinationId;
	}

	public void setDestinationId(Destination destinationId) {
		this.destinationId = destinationId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public Date getDeptTime() {
		return deptTime;
	}

	public void setDeptTime(Date deptTime) {
		this.deptTime = deptTime;
	}

	public Date getArrTime() {
		return arrTime;
	}

	public void setArrTime(Date arrTime) {
		this.arrTime = arrTime;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public Date getLastModifiedTime() {
		return lastModifiedTime;
	}

	public void setLastModifiedTime(Date lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}
	
	
	
	
}
