package com.project.rentcar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.rentcar.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
