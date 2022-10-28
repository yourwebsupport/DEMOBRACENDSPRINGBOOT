package com.aljabermedical.models;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "passenger")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 20)
    private String registrationNo;

    @NotBlank
    @Size(max = 200)
    private String name;

    @NotBlank
    @Size(max = 200)
    private String fatherName;

    @NotBlank
    @Size(max = 200)
    private String motherName;

    private Long countryId;

    private Date dateOfBirth;
    private Long genderId;
    private Long maritalStatusId;
    private Long bloodGroupId;
    private String weight;
    private String height;
    private String profession;
    private String mobileNo;
    private String email;
    private String passportNo;
    private String visaNo;
    private Date visaIssueDate;
    private String passengerPhoto;
    private String passportPhoto;
    private String visaPhoto;
    private String agencyName;
    private String executiveName;
    private String remarks;
    private Integer statusId;
    private Integer medicalStatusId;
    private Long domainStatusId;




//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(  name = "passenger_medical_details",
//            joinColumns = @JoinColumn(name = "passenger_id"),
//            inverseJoinColumns = @JoinColumn(name = "country_id"))

}
