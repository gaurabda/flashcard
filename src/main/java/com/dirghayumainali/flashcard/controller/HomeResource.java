package com.dirghayumainali.flashcard.controller;

import com.dirghayumainali.flashcard.entity.Flashcard;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public Flashcard randomMethod(){
        Flashcard f1 = new Flashcard(1, "Which Energy is used to push or pull an object?", "Force");
        Flashcard f2 = new Flashcard(2, "Energy of motion?", "Kinetic Energy");
        Flashcard f3 = new Flashcard(3, "The amount of matter in an object", "Mass");
//        ObjectMapper obj = new ObjectMapper();
//        String json = null;
//        try {
//           json = obj.writeValueAsString(f1);
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
        return f1;
    }

    @GetMapping("/error")
    public String randomMethod1(){
        return "404 Page not found";
    }

    @GetMapping("/a")
    public String randomMethod2(){
        return "This is page a";
    }
}
