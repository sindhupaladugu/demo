package com.ibm.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ticket {

	@Id
	private int pnr;
	private LocalDate travelDate;
	private double amount;

	@OneToMany
	private List<Passenger> p;

	public int getPnr() {
		return pnr;
	}

	public void setPnr(int pnr) {
		this.pnr = pnr;
	}

	public LocalDate getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(LocalDate travelDate) {
		this.travelDate = travelDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public List<Passenger> getP() {
		return p;
	}

	public void setP(List<Passenger> p) {
		this.p = p;
	}

}