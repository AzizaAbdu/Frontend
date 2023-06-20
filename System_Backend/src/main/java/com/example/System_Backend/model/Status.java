package com.example.System_Backend.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int S_id;
    public String Name;
    public String S_Category;

    @ManyToOne
    @JoinColumn( name = "A_id")
    public Application application;
}
