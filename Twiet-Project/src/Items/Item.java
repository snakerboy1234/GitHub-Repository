package Items;

import shoppingListItems.timerForPerishablityClass;
import shoppingListItems.MainForProject;

public class Item {
	
	public static String itemType;
	public static String Perished;
	public static String itemName;
	public static String asile;
	public static int itemAmount;
	public static double itemCost;
	public static double tTE;
	public static long timeTillExpiration;
	public static boolean itemOnGround = false;
	public static boolean itemPerishable;
	
	public Item(String itemType, String itemName, String asile, int itemAmount, double itemCost, long timeTillExpiration, boolean itemOnGround, boolean itemPerishable){
		
	}
	
	public String callItemName() {
		return itemName;
	}
	public String callItemType() {
		return itemType;
	}
	public int callItemAmount() {
		return itemAmount;
	}
	public double callItemCost() {
		return itemCost;
	}
	public String callTimeTillExpiration() {
		tTE = timeTillExpiration;
		Perished = timerForPerishablityClassisRotten(itemName, itemPerishable, tTE = System.currentTimeMillis(), startTime);
	}
	public boolean pickUpItemOnGround() {
		if(itemOnGround) {
			itemOnGround = itemOnGround!;
			return itemOnGround;
		}
	}
	
}
