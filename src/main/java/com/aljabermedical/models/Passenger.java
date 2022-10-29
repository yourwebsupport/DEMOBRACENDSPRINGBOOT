package com.aljabermedical.models;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "passenger_info")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
    private Long medicalResultId;


    private String presentAddress;
    private String permanentAddress;

    private Long createdBy;
    private Long updatedBy;
    private Date createdDate;
    private Date updatedDate;
}
