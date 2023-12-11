package com.practice.parkingLot.repository;

import org.springframework.data.repository.CrudRepository;
import com.practice.parkingLot.entity.VehicleRegistration;

public interface VehicleRegistrationRepository extends CrudRepository<VehicleRegistration, Integer>{

}
