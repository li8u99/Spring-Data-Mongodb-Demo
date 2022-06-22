package com.example.mongodb.controller;

import com.example.mongodb.model.User;
import com.example.mongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.io.PrintStream;

@RestController
@RequestMapping("/")
public class UserController {

   @Autowired
   private UserRepository userRepository;

   @ResponseStatus(HttpStatus.CREATED)
   @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
   public User createUser(@RequestBody User user) {
      return userRepository.save(user);
   }

   @PostMapping(value="/test")
   public User readUserById(@RequestParam("a") String id){

      return userRepository.findByUserNameLike(id);

   }
   

   



}
