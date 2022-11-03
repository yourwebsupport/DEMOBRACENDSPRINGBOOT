package com.aljabermedical.service;

import com.aljabermedical.payload.requestdto.PassengerRequest;
import com.aljabermedical.payload.responsedto.PassengerResponse;

import java.util.List;

public interface PassengerService {
    void createPassenger(PassengerRequest request);
    long getTotalCountPassenger();
    List<PassengerResponse> getPassengerList();

}
