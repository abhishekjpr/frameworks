package com.example.CallerApplication.controller;

import com.example.CallerApplication.service.GetDetailsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class CallerController {

    @RequestMapping(value = "/caller/{name}", method = RequestMethod.GET)
    public String getDetails(@PathVariable (name = "name") String name) {

        log.info("[getDetails] Received request for name : ", name);
        String result = getDetailsService.getDetails(name);
        return result;
    }

    @Autowired
    GetDetailsService getDetailsService;

}
