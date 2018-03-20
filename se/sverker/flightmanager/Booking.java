package se.sverker.flightmanager;

public class Booking {

	private static int nextID = 0;
	private int bookingID;

	private int customerID;
	private int seatNumber;
	private Airplane airplane;
	private Meal meal;
	private boolean isBusiness;
	
	// Constructor for class.
	// Sets the name and assigns a booking ID.
	// Also increment the counter for bookings.
	public Booking(Airplane airplane, int customerID, Meal meal, boolean isBusiness) {
		this.airplane = airplane;
		this.customerID = customerID;
		this.meal = meal;
		this.isBusiness = isBusiness;
		seatNumber = airplane.reserveSeat(customerID, isBusiness);
		
		// If the booking was successful, increase the static for next ID.
		if (seatNumber >= 0) {
			nextID++;
		}
	}

	public int getBookingID() {
		return this.bookingID;
	}

	public Meal getMeal() {
		return this.meal;
	}

	public int getCustomerID() {
		return this.customerID;
	}
	
	public Airplane getAirplane() {
		return this.airplane;
	}

}
