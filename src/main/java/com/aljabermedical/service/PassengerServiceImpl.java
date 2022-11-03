package com.aljabermedical.service;

import com.aljabermedical.models.Passenger;
import com.aljabermedical.models.PassengerMedicalDetails;
import com.aljabermedical.models.Pregnancy;
import com.aljabermedical.payload.requestdto.PassengerRequest;
import com.aljabermedical.payload.responsedto.PassengerResponse;
import com.aljabermedical.repository.PassengerMedicalDetailsRepository;
import com.aljabermedical.repository.PassengerRepository;
import com.aljabermedical.util.CommonConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PassengerServiceImpl implements PassengerService {
    @Autowired
    PassengerRepository passengerRepository;

    @Autowired
    PassengerMedicalDetailsRepository passengerMedicalDetailsRepository;

    @Override
    public void createPassenger(PassengerRequest request){
        Passenger passenger = Passenger.builder()
                .name(request.getName())
                .fatherName(request.getFatherName())
                .motherName(request.getMotherName())
                .code(request.getCode())
                .registrationDate(request.getRegistrationDate())
                .profession(request.getProfession())
                .email(request.getEmail())
                .mobile(request.getMobile())
                .countryId(request.getCountryId())
                .genderId(request.getGenderId())
                .maritalStatusId(request.getMaritalStatusId())
                .bloodGroupId(request.getBloodGroupId())
                .dob(request.getDob())
                .photo(request.getPhoto())

                .passportNo(request.getPassportNo())
                .passportPhoto(request.getPassportPhoto())
                .passportIssueDate(request.getPassportIssueDate())
                .passportExpiryDate(request.getPassportExpiryDate())

                .visaNo(request.getVisaNo())
                .visaPhoto(request.getVisaPhoto())
                .visaIssueDate(request.getVisaIssueDate())
                .visaExpiryDate(request.getVisaExpiryDate())


                .agencyName(request.getAgencyName())
                .executiveName(request.getExecutiveName())
                .statusId(CommonConstant.STATUS_ACTIVE)
                .authorizationStatusId(CommonConstant.AUTHORIZATION_STATUS_NEW_ID)
                .medicalResultId(CommonConstant.MEDICAL_RESULT_NO_RESULT_ID)
                .build();
        passengerRepository.save(passenger);

        PassengerMedicalDetails medicalDetails = PassengerMedicalDetails.builder()
                .passengerId(passenger.getId())
                .bp(request.getBp())
                .weight(request.getWeight())
                .height(request.getHeight())
                .albumin(request.getAlbumin())
                .basophils(request.getBasophils())
                .ent(request.getEnt())
                .esr(request.getEsr())
                .medicalExamDate(request.getMedicalExamDate())
                .bilirubin(request.getBilirubin())
                .creatinine(request.getCreatinine())
                .ecg(request.getEcg())
                .medicalExamTypeId(request.getMedicalExamTypeId())
                .haemoglobin(request.getHaemoglobin())
                .eosinophils(request.getEosinophils())
                .lymphocytes(request.getLymphocytes())
                .pulse(request.getPulse())
                .tc(request.getTc())
                .sgot(request.getSgot())
                .sgpt(request.getSgpt())
                .skin(request.getSkin())
                .monocytes(request.getMonocytes())
                .urea(request.getUrea())
                .neutrophils(request.getNeutrophils())
                .sugarRandom(request.getSugarRandom())
                .pregnancy(Pregnancy.NOT_APPLICABLE)
                .statusId(CommonConstant.STATUS_ACTIVE)
                .medicalResultId(CommonConstant.MEDICAL_RESULT_NO_RESULT_ID)
                .build();
         passengerMedicalDetailsRepository.save(medicalDetails);

    }

    @Override
    public long getTotalCountPassenger() {
        return passengerRepository.getTotalCountPassenger();
    }


    @Override
    public List<PassengerResponse> getPassengerList() {
        return passengerRepository.getPassengerList();
    }
}
