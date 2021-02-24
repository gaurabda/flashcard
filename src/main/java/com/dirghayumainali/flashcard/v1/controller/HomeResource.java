package com.dirghayumainali.flashcard.v1.controller;

import com.dirghayumainali.flashcard.v1.entity.Card;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/flashcard")
public class HomeResource {

    @GetMapping("/")
    public Card randomMethod(){
        Card f1 = new Card(1L, "Which Energy is used to push or pull an object?", "Force");
        Card f2 = new Card(2L, "Energy of motion?", "Kinetic Energy");
        Card f3 = new Card(3L, "The amount of matter in an object", "Mass");
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
