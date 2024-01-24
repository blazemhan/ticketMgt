package com.blaze.ticketSystem.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import com.blaze.ticketSystem.entity.Event;

import java.math.BigDecimal;


@Entity
@Table
@Getter
@Setter
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Event event;

    private BigDecimal price;
    private int quantity;

    // Constructors, getters, and setters

    public Ticket() {
    }

    public Ticket(Event event, BigDecimal price, int quantity) {
        this.event = event;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and setters

}


