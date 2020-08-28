package com.infortech.book.ticket.app;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.infortech.book.ticket.app.entities.Ticket;
import com.infortech.book.ticket.app.service.ticketBookingService;

@SpringBootApplication
public class TicketBookingManagmentAppApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext 	 conApplicationContext = SpringApplication.run(TicketBookingManagmentAppApplication.class, args);
	ticketBookingService ticketBookingService = conApplicationContext.getBean("ticketBookingService", ticketBookingService.class);
	Ticket ticket = new Ticket();
	ticket .setBookingDate(new Date());
	ticket.setDestStation("Solai");
	ticket.setEmail("chrisribia@gmail.com");
	ticket.setPassangerName("Christopher ribia Njeri");
	
	ticket.setSourceStation("Nakuru Town");
	ticketBookingService.createTicket(ticket );
	}

}
