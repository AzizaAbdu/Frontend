package com.example.System_Backend.controller;

import com.example.System_Backend.model.User;
import com.example.System_Backend.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/User")
public class UserApi {

    @Autowired
    private UserRepo userRepo;



    //Get All user from the table
    @GetMapping("/getAll")
    public ResponseEntity<?> getAll() {
        try {
            List<User> userList = userRepo.findAll();

            if (userList.isEmpty()) {
                return new ResponseEntity<>("Hakuna data", HttpStatus.NOT_FOUND);
            } else {
                return new ResponseEntity<>(userList, HttpStatus.OK);
            }
        } catch (Exception pandu) {
            return new ResponseEntity<>("Network Error", HttpStatus.BAD_REQUEST);
        }
    }

    //Get User using Id
    @GetMapping("/{id}")
    public ResponseEntity<?> getByID(@PathVariable int id) {
        try {
            Optional<User> optionalUser = userRepo.findById(id);

            if (optionalUser.isPresent()) {
                return new ResponseEntity<>(optionalUser, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("User not foound", HttpStatus.NOT_FOUND);
            }
        } catch (Exception punda) {
            return new ResponseEntity<>("User are not added", HttpStatus.BAD_REQUEST);
        }

    }

    //add user in table
    @PostMapping("/Add")
    public ResponseEntity<?> AddUser(@RequestBody User user) {
        try {
            User user1 = userRepo.save(user);
            return new ResponseEntity<>("Data yako ineingia", HttpStatus.OK);

        } catch (Exception pindua) {
            return new ResponseEntity<>("User not added", HttpStatus.BAD_REQUEST);

        }

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable int id) {
        try {
            userRepo.deleteById(id);
            return new ResponseEntity<>("Data imefutika", HttpStatus.OK);

        } catch (Exception pinduka) {
            return new ResponseEntity<>("User not deleted", HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateUSer(@PathVariable int id, @RequestBody User user) {
        try {
            if (userRepo.findById(id).isPresent()) {
                User user1 = userRepo.save(user);
                user1.setId(id);
                return new ResponseEntity<>("User updated", HttpStatus.OK);
            }else {
                return new ResponseEntity<>("Hogo",HttpStatus.CONFLICT);
            }
        } catch (Exception exception){
            return new ResponseEntity<>("Uzembe ",HttpStatus.BAD_REQUEST);
        }
    }



}