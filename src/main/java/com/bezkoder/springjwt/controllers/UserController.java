package com.bezkoder.springjwt.controllers;


import com.bezkoder.springjwt.payload.response.UserResponse;
import com.bezkoder.springjwt.security.jwt.JwtUtils;
import com.bezkoder.springjwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtUtils jwtUtils;

    @Autowired
    UserService userService;

    @GetMapping("/user")
    public ResponseEntity<?> authenticateUser() {
        UserResponse userResponse = userService.getUser();
        return ResponseEntity.ok(userResponse);
    }
}
