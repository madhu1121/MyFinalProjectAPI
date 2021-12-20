package com.example.staysinbackend.Repositories;

import com.example.staysinbackend.Models.State;
import com.example.staysinbackend.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, String> {
}
