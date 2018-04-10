package Items;

public class Item {
	private static double itemCostU;
	private static int itemAmountU;
	private static String itemNameU;
	private static String itemTypeU;
	public Item(double itemCost, int itemAmount, String itemName, String itemType) {
		itemCost = itemCostU;
		itemAmount = itemAmountU;
		itemName = itemNameU;
		itemType = itemTypeU;
	}
	public static double returnPrice() {
		return itemCostU;
	}
	public static int returnAmountOfItemInAisle() {
		return itemAmountU;
	}
	public static String returnItemName() {
		return itemNameU;
	}
	public static String returnItemType() {
		return itemTypeU;
	}
	public static void changePrice(double newPrice) {
		itemCostU = newPrice;
	}
	public static void changeAmountOfItemsInAisle(int newAmountOfItems) {
		itemAmountU = newAmountOfItems; 
	}
}
