package com.sample.springboot_boilerplate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sample.springboot_boilerplate.dto.OrgDto;
import com.sample.springboot_boilerplate.service.OrgService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    private final OrgService orgService;

    public HelloWorldController(OrgService orgService) {
        this.orgService = orgService;
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }

    @GetMapping("/list/orgs")
    public List<OrgDto> listOrgs() {
        return orgService.listOrgs();
    }
}
