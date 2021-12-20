package com.example.staysinbackend.Controllers;


import com.example.staysinbackend.Models.User;
import com.example.staysinbackend.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
    //private ArrayList<User> user = new ArrayList<>();

    @Autowired(required=false)
    UserRepository repository;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }

    @PostMapping("/addUser")
    public ResponseEntity<String> addUser(@RequestBody User user ){
        repository.save(user);
        return ResponseEntity.status(HttpStatus.OK).body("User added sucessfully");
    }

}
