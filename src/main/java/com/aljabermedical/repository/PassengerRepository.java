package com.aljabermedical.repository;

import com.aljabermedical.models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long>, JpaSpecificationExecutor<Passenger> {
    Boolean existsByCode(String code);

    String COUNT_STRING = """
            SELECT count(*) FROM passenger_info
            """;


    @Query(value = COUNT_STRING, nativeQuery = true)
    long getTotalCountPassenger();

}
