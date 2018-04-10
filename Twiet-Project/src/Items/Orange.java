package Items;

public class Orange extends Item{

	public Orange(double itemCost, int itemAmount, String itemName, String itemType) {
		super(itemCost, itemAmount, itemName, itemType);
		itemCost = 5.50;
		itemAmount = 0;
		itemName = "Orange";
		itemType = "Produce";
	}

}
