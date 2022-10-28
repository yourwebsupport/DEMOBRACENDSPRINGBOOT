package com.aljabermedical.models;

import lombok.*;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "passenger_medical_details")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class PassengerMedicalDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long passengerId;
    private Date dateOfExam;
    private long medicalExamType;
    private String bloodPressure;
    private String haemoglobin;
    private String bilirubin;
    private String sgpt;
    private String sgot ;
    private Long pregnancyId;
    private String pulse;
    private String esr ;
    private String tc;
    private String neutrophils;
    private String lymphocytes ;
    private String monocytes ;
    private String basophils ;
    private String eosinophils;
    private String sugarRandom ;
    private String urea ;
    private String creatinine ;
    private String ent ;
    private String skin ;
    private String albumin ;
    private String ecg ;
    private Long domainStatusId;
    private Integer medicalStatusId;

}
