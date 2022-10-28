package com.aljabermedical.service;

import com.aljabermedical.models.Passenger;
import com.aljabermedical.payload.requestdto.PassengerRequest;
import com.aljabermedical.repository.PassengerRepository;
import com.aljabermedical.util.CommonConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PassengerServiceImpl implements PassengerService {
    @Autowired
    PassengerRepository passengerRepository;

    @Override
    public void createPassenger(PassengerRequest request){
        Passenger passenger = Passenger.builder()
                .name(request.getName())
                .fatherName(request.getFatherName())
                .motherName(request.getMotherName())
                .registrationNo(request.getRegistrationNo())
                .profession(request.getProfession())
                .email(request.getEmail())
                .mobileNo(request.getMobileNo())
                .countryId(request.getCountryId())
                .genderId(request.getGenderId())
                .maritalStatusId(request.getMaritalStatusId())
                .bloodGroupId(request.getBloodGroupId())
                .weight(request.getWeight())
                .height(request.getHeight())
                .passportNo(request.getPassportNo())
                .visaNo(request.getVisaNo())
                .visaIssueDate(request.getVisaIssueDate())
                .dateOfBirth(request.getDateOfBirth())
                .visaPhoto(request.getVisaPhoto())
                .passengerPhoto(request.getPassengerPhoto())
                .passportPhoto(request.getPassportPhoto())
                .remarks(request.getRemarks())
                .agencyName(request.getAgencyName())
                .executiveName(request.getExecutiveName())
                .statusId(CommonConstant.STATUS_PENDING)
                .domainStatusId(CommonConstant.DOMAIN_STATUS_ACTIVE)
                .medicalStatusId(CommonConstant.MEDICAL_STATUS_UNDEFINED)
                .build();
        passengerRepository.save(passenger);
    }

    @Override
    public long getTotalCountPassenger() {
        return passengerRepository.getTotalCountPassenger();
    }

    @Override
    public Boolean existsByRegistrationNo(String registrationNo){
        return passengerRepository.existsByRegistrationNo(registrationNo);
    }
}
