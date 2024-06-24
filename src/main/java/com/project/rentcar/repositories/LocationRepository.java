package com.project.rentcar.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.rentcar.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
