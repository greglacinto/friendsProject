package com.description.friends.controller;

import com.description.friends.model.friend;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DescriptionController {
    private static Map<String, friend> friendRepo = new HashMap<>();

    static {
        friend victor = new friend();
        victor.setId("1");
        victor.setName("Victor");
        victor.setFamilyName("Akan");
        victor.setDob("1996");
        victor.setCareer("Data Engineer");
        victor.setLocation("Lagos, Nigeria");
        victor.setEmail("victor.akan@gmail.com");
        friendRepo.put(victor.getName(), victor);
    }

    //Get API
    @RequestMapping(value= "api/friends", method = RequestMethod.GET)
    public ResponseEntity<Object> getFriend() {
        return new ResponseEntity<>(friendRepo.values(), HttpStatus.OK);
    } //End of Get API
}
