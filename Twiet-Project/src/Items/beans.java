package Items;

public class beans extends Item{

	public beans(double itemCost, int itemAmount, String itemName, String itemType) {
		super(itemCost, itemAmount, itemName, itemType);
		itemCost = 1.50;
		itemAmount = 0;
		itemName = "beans";
		itemType = "canned food";
	}
	
}
