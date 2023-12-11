package com.practice.parkingLot.service;

import org.springframework.stereotype.Service;
import com.practice.parkingLot.repository.EstablishmentRegistrationRepository;

@Service
public class EstablishmentRegistrationService {

	
	private final EstablishmentRegistrationRepository establishmentRegistrationRepository;
	
	public EstablishmentRegistrationService(EstablishmentRegistrationRepository establishmentRegistrationRepository) {
		this.establishmentRegistrationRepository = establishmentRegistrationRepository;
		
	}
	
	public long getParkingForMotorcycle() {
		return establishmentRegistrationRepository.count();
	}
}
