package Items;

public class Milk extends Item{

	public Milk(double itemCost, int itemAmount, String itemName, String itemType) {
		super(itemCost, itemAmount, itemName, itemType);
		itemCost = 2.50;
		itemAmount = 0;
		itemName = "Milk";
		itemType = "dairy";
	}

}
