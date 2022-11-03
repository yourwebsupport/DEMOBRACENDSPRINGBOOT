package com.aljabermedical.payload.responsedto;


import java.util.Date;

public interface PassengerResponse {
    long getPassengerId();

    String getRegistrationCode();


    String getPassengerName();

    String getPassportNo();

    String getVisaNo();

    Date getRegistrationDate();

    Date getMedicalExamDate();

    String getMedicalExamType();

    String getAuthorizationStatusName();

    String getMedicalResultStatusName();

}
