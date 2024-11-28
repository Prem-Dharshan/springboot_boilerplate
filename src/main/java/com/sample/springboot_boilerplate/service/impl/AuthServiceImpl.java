package com.sample.springboot_boilerplate.service.impl;

import com.sample.springboot_boilerplate.Db.AuthHandler;
import com.sample.springboot_boilerplate.service.AuthService;
import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final AuthHandler authHandler;

    @Override
    public boolean authUser(String userid, String password) {
        List<Object[]> emp = authHandler.authUser(userid, password);
        return emp.size() > 0;

    }
}
