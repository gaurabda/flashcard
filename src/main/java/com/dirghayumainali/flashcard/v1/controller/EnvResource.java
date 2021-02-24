package com.dirghayumainali.flashcard.v1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/env")
public class EnvResource {

    @Autowired
    Environment environment;

    @GetMapping("/")
    public void env(){

    }
}
