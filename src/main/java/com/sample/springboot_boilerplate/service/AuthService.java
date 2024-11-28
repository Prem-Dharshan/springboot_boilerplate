package com.sample.springboot_boilerplate.service;

import org.springframework.stereotype.Service;

@Service
public interface AuthService {

    // Simulate database lookup
    public boolean authUser(String userid, String password);
}
