package com.example.CallerApplication.service.impl;

import com.example.CallerApplication.service.CallerClient;
import com.example.CallerApplication.service.GetDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;

@Service
public class GetDetailsServiceImpl extends RestTemplate implements GetDetailsService {

    @Override
    public String getDetails(String name) {
        String baseUrlW = callerClient.getBaseUrl() + "/getNameAndCompany/" + name;
        ResponseEntity<String> result = callerClient.getForEntity(baseUrlW, String.class);
        return result.getBody();
    }

    @Autowired
    CallerClient callerClient;
}
