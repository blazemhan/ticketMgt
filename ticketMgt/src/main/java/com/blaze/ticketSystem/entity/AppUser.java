package com.blaze.ticketSystem.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Users")
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstname;
    private String lastname;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private UserCategory userCategory;

    public AppUser(AppUser users){
        this.firstname = users.firstname;
        this.lastname = users.lastname;
        this.email = users.email;
        this.password = users.password;
        this.userCategory = users.userCategory;

    }

    public AppUser(){

    }



}
