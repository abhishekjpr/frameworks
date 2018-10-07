package com.example.CalledApplication.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class InitialController {

    @RequestMapping(value = "/getNameAndCompany/{name}", method = RequestMethod.GET)
    public String getNameAndCompany(@PathVariable(name = "name") String name) {
        log.info("[getNameAndCompany] Called Get Name and Company Controller..");
        return name + " - " + "Lenskart";
    }
}
