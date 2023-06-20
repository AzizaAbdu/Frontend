package com.example.System_Backend.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String Name;
    public int Age;
    public String Gender;
    public String Address;
    public String Zan_id;
    public String P_no;
}
