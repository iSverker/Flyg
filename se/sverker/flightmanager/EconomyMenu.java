package se.sverker.flightmanager;

import java.util.HashMap;
import java.util.Map;

public class EconomyMenu {
	protected Map<String, Double> economyMenu;


	public static void main(String[] args) {
		displayEconomyMenu();
	}
	
	public EconomyMenu() {
		economyMenu = new HashMap<>();
		
		economyMenu.put("Cheese Roll", 2.00);
		economyMenu.put("Ham sandwich", 3.50);
		economyMenu.put("Salad", 7.50);
		economyMenu.put("Pizza", 5.00);
		economyMenu.put("Water", 2.00);
		economyMenu.put("Beer", 5.00);
		economyMenu.put("Wine", 6.00);
	}
	
	
	public Map<String, Double> getEconomyMenu() {
		return economyMenu;
	}

	
	public static void displayEconomyMenu() {
		System.out.println("Economy Menu");
		System.out.println("------------");
		
		System.out.println("1. Cheese Roll (€2.00) \n2. Ham sandwich (€3.50) \n3. Salad (€7.50) "
				+ "\n4. Pizza (€5.00) \n5. Water (€2.00) \n6. Beer (€5.00) \n7. Wine (€6.00)");
	}
	
}














//for (Map.Entry<String, Double> pair : economyMenu.entrySet()) {
//	System.out.println(pair.getKey() + " [price: " + pair.getValue() + " €]");
//}