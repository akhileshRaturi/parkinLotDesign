package com.practice.parkingLot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;


@Entity
@Table
public class VehicleRegistration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotNull
	private String Brand;
	@NotNull
	private String color;
	@NotNull
	private String model;
	@NotNull
	private String plate;
	@NotNull
	private String kind;
	
	
	public VehicleRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}


	public VehicleRegistration(int id, @NotNull String brand, @NotNull String color, @NotNull String model,
			@NotNull String plate, @NotNull String kind) {
		super();
		this.id = id;
		Brand = brand;
		this.color = color;
		this.model = model;
		this.plate = plate;
		this.kind = kind;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBrand() {
		return Brand;
	}


	public void setBrand(String brand) {
		Brand = brand;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getPlate() {
		return plate;
	}


	public void setPlate(String plate) {
		this.plate = plate;
	}


	public String getKind() {
		return kind;
	}


	public void setKind(String kind) {
		this.kind = kind;
	}
	
	
	

}
