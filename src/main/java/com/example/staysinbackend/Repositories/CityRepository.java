package com.example.staysinbackend.Repositories;

import com.example.staysinbackend.Models.City;
import com.example.staysinbackend.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, String> {
}
