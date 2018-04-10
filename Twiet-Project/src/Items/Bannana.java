package Items;

public class Bannana extends Item{

	public Bannana(double itemCost, int itemAmount, String itemName, String itemType) {
		super(itemCost, itemAmount, itemName, itemType);
		itemCost = 1.00;
		itemAmount = 0;
		itemName = "Bannana";
		itemType = "produce";
	}

}
