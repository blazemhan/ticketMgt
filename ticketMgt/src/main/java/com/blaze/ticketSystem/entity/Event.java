package com.blaze.ticketSystem.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Date date;
    private String location;

    // Constructors, getters, and setters

    public Event() {
    }

    public Event(String name, Date date, String location) {
        this.name = name;
        this.date = date;
        this.location = location;
    }

    // Getters and setters
  }

