package se.sverker.flightmanager;

public class Customer {
	
	private static int nextID = 0;
	
	private String name;
	private int customerID;
	
	// Constructor for class.
	// Sets the name and assigns a customer ID.
	// Also increment the counter for customers.
	public Customer(String name) {
		this.name = name;
		this.customerID = nextID++;
	}
	
	public String getName() {
		return name;
	}
	
	public int getCustomerID() {
		return customerID;
	}

}
