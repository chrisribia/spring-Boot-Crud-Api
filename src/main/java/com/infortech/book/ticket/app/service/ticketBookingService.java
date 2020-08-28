package com.infortech.book.ticket.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infortech.book.ticket.app.Dao.TicketBookingDao;
import com.infortech.book.ticket.app.entities.Ticket;

@Service
public class ticketBookingService {
	
	@Autowired
	private TicketBookingDao  ticketBookingDao;
	public Ticket createTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return ticketBookingDao.save(ticket);
	}
	
	public Optional<Ticket> getTcketByIdticketId(Integer ticketId) {
		// TODO Auto-generated method stub
		return ticketBookingDao.findById(ticketId);
	}

	public Iterable<Ticket> getAllTickets() {
		// TODO Auto-generated method stub
		return ticketBookingDao.findAll();
	}

	public void deleteTicketticketId(Integer ticketId) {
		// TODO Auto-generated method stub
		ticketBookingDao.deleteById(ticketId);
	}

}
