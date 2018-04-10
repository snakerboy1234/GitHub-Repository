package Items;

public class Apples extends Item{

	public Apples(double itemCost, int itemAmount, String itemName, String itemType) {
		super(itemCost, itemAmount, itemName, itemType);
		itemCost = 5.50;
		itemAmount = 0;
		itemName = "apples";
		itemType = "produce";
	}

}
