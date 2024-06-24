package com.project.rentcar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.rentcar.models.VehicleHire;

@Repository
public interface VehicleHireRepository extends JpaRepository<VehicleHire, Integer> {

}
