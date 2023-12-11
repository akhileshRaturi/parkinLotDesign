package com.practice.parkingLot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.parkingLot.service.EstablishmentRegistrationService;

@RestController
@RequestMapping("/parking")
public class EstablishmentRegistrationController {

	@Value("${parkingSpaceForMotorcycle}")
	private int motorCycle;
	
	private final EstablishmentRegistrationService establishmentRegistrationService;
	
	public EstablishmentRegistrationController(EstablishmentRegistrationService establishmentRegistrationService) {
		this.establishmentRegistrationService = establishmentRegistrationService;
	}
	
	@GetMapping("/motorcycle")
	private long getParkingForMotorcycle() {
		long motorCycles =  establishmentRegistrationService.getParkingForMotorcycle();
		return Math.abs(motorCycle - motorCycles);
	}
	
}
