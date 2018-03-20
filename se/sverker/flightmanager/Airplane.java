package se.sverker.flightmanager;

public class Airplane {

	// Define the airplane specs
	private int numberOfSeats;
	private Seat[] seat;
	private int seatNumber = -1;
	private String journey;

	// Set ticket prices.
	private final int businessPrice = 20000;
	private final int economyPrice = 5000;

	// Default constructor – needs the number of seats and to-from
	public Airplane(int numberOfSeats, String journey) {
		this.numberOfSeats = numberOfSeats;
		seat = new Seat[numberOfSeats];

		// Set the first five seats to business
		for (int i = 0; i < numberOfSeats; i++) {
			seat[i] = new Seat();
		}

		// Set the first five seats to business
		for (int i = 0; i < 5; i++) {
			seat[i].setBusiness(true);
		}
		
		this.journey = journey;
	}

	// Reserve a seat for a customer if it's not already reserved
	public int reserveSeat(int customerID, boolean isBusiness) {

		int startSeat;
		int stopSeat;

		// Set the right boundaries for searching an available seat
		if (isBusiness) {
			startSeat = 0;
			stopSeat = 4;
		} else {
			startSeat = 5;
			stopSeat = numberOfSeats - 1;
		}

		// Reserve the first available seat in the appropriate travel class
		boolean succeeded = false;
		for (int i = startSeat; i <= stopSeat; i++) {
			if (seat[i].getCustomerID() < 0) {
				seat[i].reserveSeat(customerID);
				seatNumber = i;
				succeeded = true;
				break;
			}
		}

		// If it didn't work, print a message that it didn't, and return a negative
		// number.
		if (!succeeded) {
			System.out.println("No seats available in travel class " + (isBusiness ? "business." : "economy."));
			return -1;
		}

		// Everything went fine. Return the seat number.
		return seatNumber;

	}

	// Say how much the ticket was.
	public int getTicketPrice(int seatNumber) {
		seatNumber--;
		if (seatNumber < 0 || seatNumber > numberOfSeats) {
			System.out.println("Invalid seat number.");
			return 0;
		}
		return (seat[seatNumber].isBusiness() ? this.businessPrice : this.economyPrice);
	}

	public String getJourney() {
		return journey;
	}

}
