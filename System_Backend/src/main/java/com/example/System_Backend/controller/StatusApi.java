package com.example.System_Backend.controller;


import com.example.System_Backend.model.Status;
import com.example.System_Backend.model.User;
import com.example.System_Backend.repository.StatusRepo;
import com.example.System_Backend.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class StatusApi {

    @Autowired
    public StatusRepo statusRepo;

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll() {
        try {
            List<Status> statusList = statusRepo.findAll();

            if (statusList.isEmpty()) {
                return new ResponseEntity<>("No data", HttpStatus.NOT_FOUND);
            } else {
                return new ResponseEntity<>(statusList, HttpStatus.OK);
            }
        } catch (Exception pandu) {
            return new ResponseEntity<>("Network Error", HttpStatus.BAD_REQUEST);
        }
    }

    //Get Status using Id
    @GetMapping("/{S_id}")
    public ResponseEntity<?> getByID(@PathVariable int S_id) {
        try {
            Optional<Status> optionalStatus = statusRepo.findById(S_id);

            if (optionalStatus.isPresent()) {
                return new ResponseEntity<>(optionalStatus, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("User not foound", HttpStatus.NOT_FOUND);
            }
        } catch (Exception punda) {
            return new ResponseEntity<>("User are not added", HttpStatus.BAD_REQUEST);
        }

    }

    //add Status in table
    @PostMapping("/Add")
    public ResponseEntity<?> AddStatus(@RequestBody Status status) {
        try {
           Status status1 = statusRepo.save(status);
            return new ResponseEntity<>("Data inserted", HttpStatus.OK);

        } catch (Exception pindua) {
            return new ResponseEntity<>("Status not added", HttpStatus.BAD_REQUEST);

        }

    }

    @DeleteMapping("/{S_id}")
    public ResponseEntity<?> deleteStatus(@PathVariable int S_id) {
        try {
            statusRepo.deleteById(S_id);
            return new ResponseEntity<>("Data deleted", HttpStatus.OK);

        } catch (Exception pinduka) {
            return new ResponseEntity<>("Status not deleted", HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/{S_id}")
    public ResponseEntity<?> updateUSer(@PathVariable int S_id, @RequestBody Status status) {
        try {
            if (statusRepo.findById(S_id).isPresent()) {
                Status status1 = statusRepo.save(status);
                status1.setS_id(S_id);
                return new ResponseEntity<>("User updated", HttpStatus.OK);
            }else {
                return new ResponseEntity<>("Hogo",HttpStatus.CONFLICT);
            }
        } catch (Exception exception){
            return new ResponseEntity<>("Uzembe ",HttpStatus.BAD_REQUEST);
        }
    }



}



