package com.aljabermedical.repository;

import com.aljabermedical.models.Passenger;
import com.aljabermedical.models.PassengerMedicalDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface PassengerMedicalDetailsRepository extends JpaRepository<PassengerMedicalDetails, Long>, JpaSpecificationExecutor<PassengerMedicalDetails> {
    Optional<PassengerMedicalDetails> findById(Long id);
}