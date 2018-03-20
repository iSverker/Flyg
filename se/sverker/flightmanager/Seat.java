package se.sverker.flightmanager;

public class Seat {
	
	// Indicates if the seat is business class or not
	private boolean business = false;
	
	// Assign acustomer to the seat
	private int customerID;
	
	public boolean isBusiness() {
		return business;
	}
	
	public void setBusiness(boolean business) {
		this.business = business;
	}
	
	public void reserveSeat(int customerID) {
		this.customerID = customerID;
	}
	
	public void releaseSeat() {
		this.customerID = - 1;
	}
		
	public int getCustomerID() {
		return customerID;
	}
	
	public void setCustomer(int customerID) {
		this.customerID = customerID;
	}
	
}
