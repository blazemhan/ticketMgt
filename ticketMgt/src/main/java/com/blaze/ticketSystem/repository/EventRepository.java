package com.blaze.ticketSystem.repository;

import com.blaze.ticketSystem.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event,Long> {

}
