package com.example.System_Backend.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data

public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int A_id;
    public String Category;
    public String Name;
    public int Phone;
    public int Email;

    @ManyToOne
    @JoinColumn(name = "id")
    public User user;

}
