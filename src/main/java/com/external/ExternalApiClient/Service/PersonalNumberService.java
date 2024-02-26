package com.external.ExternalApiClient.Service;

import com.external.ExternalApiClient.Response.PersonalNumberResponse;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PersonalNumberService {

    public PersonalNumberResponse generatePersonalNumber() {
        Random random = new Random();
        Integer number = 10000000 + random.nextInt(90000000);
        return new PersonalNumberResponse(number);
    }
}
