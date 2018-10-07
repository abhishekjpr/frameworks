package com.example.CallerApplication.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public @Data
class CallerClient extends RestTemplate {

    @Value("${called.api.baseUrl}")
    private String baseUrl;

    CallerClient(){}

}
