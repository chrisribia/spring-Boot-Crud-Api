package com.infortech.book.ticket.app.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infortech.book.ticket.app.entities.Ticket;

@Repository
public interface TicketBookingDao extends CrudRepository<Ticket, Integer> {

}
