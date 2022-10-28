package com.aljabermedical.service;

import com.aljabermedical.models.Passenger;
import com.aljabermedical.payload.requestdto.PassengerRequest;
import com.aljabermedical.repository.PassengerRepository;
import com.aljabermedical.util.CommonConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerServiceImpl implements PassengerService {
    @Autowired
    PassengerRepository passengerRepository;

    @Override
    public void createPassenger(PassengerRequest request){
        Passenger passenger = Passenger.builder()
                .name(request.getName())
                .fatherName(request.getFatherName())
                .matherName(request.getMatherName())
                .registrationNo(request.getRegistrationNo())
                .profession(request.getProfession())
                .email(request.getEmail())
                .mobileNo(request.getMobileNo())
                .countryId(request.getCountryId())
                .genderId(request.getGenderId())
                .weight(request.getWeight())
                .height(request.getHeight())
                .passportNo(request.getPassportNo())
                .visaNo(request.getVisaNo())
                .visaIssueDate(request.getVisaIssueDate())
                .DOB(request.getDOB())
                .visaPhoto(request.getVisaPhoto())
                .passengerPhoto(request.getPassengerPhoto())
                .statusId(CommonConstant.STATUS_PENDING)
                .domainStatusId(CommonConstant.DOMAIN_STATUS_ACTIVE)
                .medicalStatusId(CommonConstant.MEDICAL_STATUS_UNDEFINED)
                .build();
        passengerRepository.save(passenger);
    }
}
