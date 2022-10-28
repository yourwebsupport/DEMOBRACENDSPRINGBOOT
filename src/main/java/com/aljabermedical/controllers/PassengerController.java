package com.aljabermedical.controllers;

import com.aljabermedical.payload.requestdto.PassengerRequest;
import com.aljabermedical.payload.responsedto.MessageResponse;
import com.aljabermedical.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping("/api")
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @PostMapping("/save")
    public ResponseEntity<?> registerPassenger(@Valid @RequestBody PassengerRequest request) {
        passengerService.createPassenger(request);
        return ResponseEntity.ok(new MessageResponse("Passenger registered successfully!"));
    }
}
