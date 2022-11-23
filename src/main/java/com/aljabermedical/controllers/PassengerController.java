package com.aljabermedical.controllers;

import com.aljabermedical.payload.requestdto.PassengerRequest;
import com.aljabermedical.payload.responsedto.PassengerResponse;
import com.aljabermedical.payload.responsedto.MessageResponse;
import com.aljabermedical.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @PostMapping("/save")
    public ResponseEntity<?> registerPassenger(@Valid @RequestBody PassengerRequest request) {

        Date currentDate = new Date();
        LocalDate localDate = currentDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        String refNo = "BD/"+localDate.getYear()+"/AJ-"+passengerService.getTotalCountPassenger();
        request.setCode(refNo);

//        if (passengerService.existsByCode(request.setCode())) {
//            return ResponseEntity.badRequest().body(new MessageResponse("Error: Registration No"+ refNo +" is already taken!"));
//        }

        passengerService.createPassenger(request);
        return ResponseEntity.ok(new MessageResponse("Passenger registered successfully! Registration No "+refNo+""));
    }

    @GetMapping("/passenger-list")
    public List<PassengerResponse> getPassengerList() {
        return passengerService.getPassengerList();
    }

}
