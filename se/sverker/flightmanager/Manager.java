package se.sverker.flightmanager;

import java.util.ArrayList;
import java.util.HashMap;

public class Manager {

	ArrayList<Airplane> airplane = new ArrayList<>();

	public Manager() {

		// Get an airplane
		Airplane ap1 = new Airplane(10, "ARN-GTW");

		// Install a customer database
		HashMap<Integer, String> customers = new HashMap<>();

		// Set up a bookings database
		ArrayList<Booking> bookings = new ArrayList<>();

		// Add some customers
		Customer kalle = new Customer("Kalle Kubik");
		customers.put(kalle.getCustomerID(), kalle.getName());
		Customer lisa = new Customer("Lisa Pettersson");
		customers.put(lisa.getCustomerID(), lisa.getName());
		Customer lisa2 = new Customer("Lisa-Lisa Pettersson");
		customers.put(lisa2.getCustomerID(), lisa2.getName());
		Customer sas = new Customer("Åsa Blom");
		customers.put(sas.getCustomerID(), sas.getName());
		Customer roger = new Customer("Roger Andersson");
		customers.put(roger.getCustomerID(), roger.getName());
		Customer niklas = new Customer("Niklas Svensson");
		customers.put(niklas.getCustomerID(), niklas.getName());
		Customer pelle = new Customer("Pelle Svensson");
		customers.put(pelle.getCustomerID(), pelle.getName());

		// Set up a bogus meal
		Meal meal = new Meal();

		// Book a business seat for Kalle
		Booking book = new Booking(ap1, kalle.getCustomerID(), meal, true);
		bookings.add(book);

		// List all bookings
		for (Booking booked : bookings) {
			System.out.println(booked.getBookingID() + ": " + customers.get(booked.getBookingID()) + ", "
					+ booked.getAirplane().getJourney());
		}

	}

}
