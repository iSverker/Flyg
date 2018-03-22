package se.sverker.flightmanager;

import java.util.HashMap;
import java.util.Map;

public class BusinessMenu {
	protected Map<String, Double> businessMenu;

	public static void main(String[] args) {
		displayBusinessMenu();
	}
	
	public BusinessMenu() {
		businessMenu = new HashMap<>();
		
		businessMenu.put("Sourdough Roll", 3.00);
		businessMenu.put("Wholegrain sandwich", 5.50);
		businessMenu.put("Salad", 7.50);
		businessMenu.put("Olives", 4.00);
		businessMenu.put("Water", 2.00);
		businessMenu.put("Beer", 5.00);
		businessMenu.put("Wine", 6.00);
		businessMenu.put("Champagne", 8.00);
	}
	

	public Map<String, Double> getBusinessMenu() {
		return businessMenu;
	}


	public static void displayBusinessMenu() {
		System.out.println("Business Menu");
		System.out.println("-------------");
		System.out.println("1. Sourdough Roll (€3.00) \n2. Wholegrain sandwich (€5.50) \n3. Salad (€7.50) "
				+ "\n4. Olives (€4.00) \n5. Water (€2.00) \n6. Beer (€5.00) \n7. Wine (€6.00) \n8. Champagne (€8.00)");
	}
	

	
}