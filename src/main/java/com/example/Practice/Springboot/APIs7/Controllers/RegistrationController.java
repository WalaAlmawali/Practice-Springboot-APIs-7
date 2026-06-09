package com.example.Practice.Springboot.APIs7.Controllers;

import com.example.Practice.Springboot.APIs7.Services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @DeleteMapping("/registrations")
    public String deleteRegistrations(
            @RequestParam List<Integer> ids) {

        return registrationService.deleteMultipleByIds(ids);
    }
}
