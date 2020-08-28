package com.infortech.book.ticket.app.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infortech.book.ticket.app.entities.Ticket;
import com.infortech.book.ticket.app.service.ticketBookingService;

@RestController
@RequestMapping(value="/api/tickets")
public class TecketBookingController {

	@Autowired
	private ticketBookingService ticketBookingService;
	
	
	@PostMapping(value="/createticket")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return ticketBookingService.createTicket(ticket);
	}
	
	@GetMapping(value="/ticket/{ticketId}")
	public Optional<Ticket> getTicketById(@PathVariable("ticketId") Integer ticketId) {
		
		return ticketBookingService.getTcketByIdticketId(ticketId);
	}
	

	@GetMapping(value="/ticket/alltickets")
	public Iterable<Ticket> getAllBookedTickets(){
		
		return ticketBookingService.getAllTickets();
	}
	
	@DeleteMapping(value="/ticket/{ticketId}")
	public void deleteTicket(@PathVariable("ticketId")Integer ticketId) {
		ticketBookingService.deleteTicketticketId(ticketId);
		
	}
	
}
