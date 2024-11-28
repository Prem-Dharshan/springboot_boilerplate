package com.sample.springboot_boilerplate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sample.springboot_boilerplate.dto.LoginRequest;
import com.sample.springboot_boilerplate.dto.LoginResponse;
import com.sample.springboot_boilerplate.service.AuthService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        boolean isAuthenticated = authService.authUser(loginRequest.getUserid(), loginRequest.getPassword());
        if (isAuthenticated) {
            LoginResponse response = new LoginResponse();
            response.setUserid(loginRequest.getUserid());
            return new ResponseEntity<>(response, HttpStatus.OK);

            // return ResponseEntity.ok("Login successful");
        } else {
            // Return an unauthorized response
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }
}
