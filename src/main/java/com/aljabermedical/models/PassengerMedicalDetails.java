package com.aljabermedical.models;

import lombok.*;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "passenger_medical_record")
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
    private Date medicalExamDate;
    private long medicalExamTypeId;
    private Double bp;
    private Double pulse;
    private Double weight;
    private Double height;
    private Pregnancy pregnancy;
    private Double haemoglobin;
    private Double bilirubin;
    private Double sgpt;
    private Double sgot ;

    private Double esr ;
    private Double tc;
    private Double neutrophils;
    private Double lymphocytes ;
    private Double monocytes ;
    private Double basophils ;
    private Double eosinophils;
    private Double sugarRandom ;
    private Double urea ;
    private Double creatinine;
    private Double ent;
    private Double skin;
    private Double albumin;
    private Double ecg;
    private Long statusId;
    private Long medicalResultId;

    private Long createdBy;
    private Long updatedBy;
    private Date createdDate;
    private Date updatedDate;
}
