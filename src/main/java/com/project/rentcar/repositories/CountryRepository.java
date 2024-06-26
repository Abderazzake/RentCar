package com.project.rentcar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.rentcar.models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
