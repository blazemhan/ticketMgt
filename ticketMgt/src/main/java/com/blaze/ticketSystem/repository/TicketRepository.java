package com.blaze.ticketSystem.repository;

import com.blaze.ticketSystem.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Long> {

}
