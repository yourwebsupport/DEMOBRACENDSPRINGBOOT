package com.aljabermedical.repository;

import com.aljabermedical.models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long>, JpaSpecificationExecutor<Passenger> {

    Optional<Passenger> findByRegistrationNo(String registrationNo);
    Boolean existsByRegistrationNo(String registrationNo);
}
