package com.project.rentcar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.rentcar.models.VehicleMaintenance;

@Repository
public interface VehicleMaintenanceRepository extends JpaRepository<VehicleMaintenance, Integer>{
	
	

}
