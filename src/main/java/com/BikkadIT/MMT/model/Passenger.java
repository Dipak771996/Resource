package com.BikkadIT.MMT.model;

public class Passenger {

	private String firstName;

	private String lastName;

	private String journeyFrom;

	private String journeyTo;

	private String doj;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJourneyFrom() {
		return journeyFrom;
	}

	public void setJourneyFrom(String journeyFrom) {
		this.journeyFrom = journeyFrom;
	}

	public String getJourneyTo() {
		return journeyTo;
	}

	public void setJourneyTo(String journeyTo) {
		this.journeyTo = journeyTo;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "Passenger [firstName=" + firstName + ", lastName=" + lastName + ", journeyFrom=" + journeyFrom
				+ ", journeyTo=" + journeyTo + ", doj=" + doj + "]";
	}

	
}
