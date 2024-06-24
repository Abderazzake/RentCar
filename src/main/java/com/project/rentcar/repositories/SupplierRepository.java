package com.project.rentcar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.rentcar.models.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
