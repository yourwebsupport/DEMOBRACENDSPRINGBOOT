package com.aljabermedical.repository;

import com.aljabermedical.models.Passenger;
import com.aljabermedical.payload.responsedto.PassengerResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long>, JpaSpecificationExecutor<Passenger> {
    String COUNT_STRING = """
            SELECT count(*) FROM passenger_info
            """;
    @Query(value = COUNT_STRING, nativeQuery = true)
    long getTotalCountPassenger();

    String PASSENGER_STRING = """
            SELECT
            pi.id "passengerId",
            pi.code "registrationCode",
            pi.name "passengerName",
            pi.passport_no "passportNo",
            pi.visa_no  "visaNo",
            pi.registration_date "registrationDate",
            pmr.medical_exam_date "medicalExamDate",
            CONCAT(rc.medical_exam_type, "  ->  ", rc.rate) "medicalExamType",
            aus.status "authorizationStatusName",
            mr.result "medicalResultStatusName"
            FROM passenger_info pi
            LEFT JOIN passenger_medical_record pmr ON (pmr.passenger_id = pi.id AND pi.status_id =1)
            LEFT JOIN ratecard rc ON (pmr.medical_exam_type_id = rc.id)
            INNER JOIN authorization_status aus ON (aus.id = pi.authorization_status_id)
            LEFT JOIN medical_result mr ON (mr.id = pi.medical_result_id)
            """;
    @Query(value = PASSENGER_STRING, nativeQuery = true)
    List<PassengerResponse> getPassengerList();
}
