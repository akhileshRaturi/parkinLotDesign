package com.practice.parkingLot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table
public class EstablishmentRegistration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotNull
	private String name;
	@NotNull
	private String address;
	@NotNull
	private double telephone;
	@NotNull
	private int parkingForMotorcycle;
	@NotNull
	private int parkingForCar;
	
	
	
	
	public EstablishmentRegistration() {
		super();
	}

	public EstablishmentRegistration(int id, String name, String address, double telephone, int parkingForMotorcycle,
			int parkingForCar) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.telephone = telephone;
		this.parkingForMotorcycle = parkingForMotorcycle;
		this.parkingForCar = parkingForCar;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getTelephone() {
		return telephone;
	}
	public void setTelephone(double telephone) {
		this.telephone = telephone;
	}
	public int getParkingForMotorcycle() {
		return parkingForMotorcycle;
	}
	public void setParkingForMotorcycle(int parkingForMotorcycle) {
		this.parkingForMotorcycle = parkingForMotorcycle;
	}
	public int getParkingForCar() {
		return parkingForCar;
	}
	public void setParkingForCar(int parkingForCar) {
		this.parkingForCar = parkingForCar;
	}	
}
