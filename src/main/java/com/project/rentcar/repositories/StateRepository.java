package com.project.rentcar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.rentcar.models.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
