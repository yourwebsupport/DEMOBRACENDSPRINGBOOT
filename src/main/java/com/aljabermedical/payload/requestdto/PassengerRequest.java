package com.aljabermedical.payload.requestdto;

import com.aljabermedical.models.Country;
import com.aljabermedical.models.Gender;

import java.util.Date;

public class PassengerRequest {

    private String registrationNo;
    private String name;
    private String fatherName;
    private String matherName;
    private Long countryId;
    private Date DOB;
    private Long genderId;
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
    private Integer medicalStatusId;

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMatherName() {
        return matherName;
    }

    public void setMatherName(String matherName) {
        this.matherName = matherName;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public Long getGender() {
        return genderId;
    }

    public void setGender(Long genderId) {
        this.genderId = genderId;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getVisaNo() {
        return visaNo;
    }

    public void setVisaNo(String visaNo) {
        this.visaNo = visaNo;
    }

    public Date getVisaIssueDate() {
        return visaIssueDate;
    }

    public void setVisaIssueDate(Date visaIssueDate) {
        this.visaIssueDate = visaIssueDate;
    }

    public String getPassengerPhoto() {
        return passengerPhoto;
    }

    public void setPassengerPhoto(String passengerPhoto) {
        this.passengerPhoto = passengerPhoto;
    }

    public String getPassportPhoto() {
        return passportPhoto;
    }

    public void setPassportPhoto(String passportPhoto) {
        this.passportPhoto = passportPhoto;
    }

    public String getVisaPhoto() {
        return visaPhoto;
    }

    public void setVisaPhoto(String visaPhoto) {
        this.visaPhoto = visaPhoto;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getExecutiveName() {
        return executiveName;
    }

    public void setExecutiveName(String executiveName) {
        this.executiveName = executiveName;
    }

    public Integer getMedicalStatusId() {
        return medicalStatusId;
    }

    public void setMedicalStatusId(Integer medicalStatusId) {
        this.medicalStatusId = medicalStatusId;
    }


}
