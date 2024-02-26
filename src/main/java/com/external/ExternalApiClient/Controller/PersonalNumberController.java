package com.external.ExternalApiClient.Controller;

import com.external.ExternalApiClient.Response.PersonalNumberResponse;
import com.external.ExternalApiClient.Service.PersonalNumberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class PersonalNumberController {
    private final PersonalNumberService personalNumberService;

    @GetMapping("personal_number")
    public PersonalNumberResponse getRandomPersonalNumber() {
        return personalNumberService.generatePersonalNumber();
    }
}
