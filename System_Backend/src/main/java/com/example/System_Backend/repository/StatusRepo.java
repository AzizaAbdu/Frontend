package com.example.System_Backend.repository;

import com.example.System_Backend.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepo  extends JpaRepository<Status,Integer> {

}