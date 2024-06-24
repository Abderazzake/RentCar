package com.project.rentcar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.rentcar.models.VehicleModel;

@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {

}
