package com.example.staysinbackend.Controllers;

import com.example.staysinbackend.Models.Property;
import com.example.staysinbackend.Models.User;
import com.example.staysinbackend.Repositories.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PropertyController {

    @Autowired(required=false)
    PropertyRepository repository;

    @PostMapping("/addProperty")
    public ResponseEntity<String> addProperty(@RequestBody Property property ){
        repository.save(property);
        return ResponseEntity.status(HttpStatus.OK).body("property added sucessfully");
    }
}
