package com.example.staysinbackend.Repositories;

import com.example.staysinbackend.Models.Property;
import com.example.staysinbackend.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepository extends JpaRepository<Property, String> {
}
