package com.aljabermedical.payload.requestdto;

import com.aljabermedical.models.Pregnancy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PassengerMedicalDetailsRequest {
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
