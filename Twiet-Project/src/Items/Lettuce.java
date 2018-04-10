package Items;

public class Lettuce extends Item{

	public Lettuce(double itemCost, int itemAmount, String itemName, String itemType) {
		super(itemCost, itemAmount, itemName, itemType);
		itemCost = 5.50;
		itemAmount = 0;
		itemName = "lettuce";
		itemType = "produce";
	}

}
