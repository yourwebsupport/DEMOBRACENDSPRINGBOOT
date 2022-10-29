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
public class PassengerRequest {

    private String code;
    private String name;
    private String fatherName;
    private String motherName;
    private Long countryId;
    private Date dob;
    private Long genderId;
    private Long maritalStatusId;
    private Long bloodGroupId;
    private String profession;
    private String mobile;
    private String email;
    private String photo;

    private String passportNo;
    private Date passportIssueDate;
    private Date passportExpiryDate;
    private String passportPhoto;

    private String visaNo;
    private Date visaIssueDate;
    private Date visaExpiryDate;
    private String visaPhoto;

    private Date registrationDate;

    private String agencyName;
    private String executiveName;
    private String remarks;
    private Long statusId;
    private Long authorizationStatusId;
    private Long domainStatusId;
    private Long medicalResultId;


    private String presentAddress;
    private String permanentAddress;

    private Long createdBy;
    private Long updatedBy;
    private Date createdDate;
    private Date updatedDate;



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

}
