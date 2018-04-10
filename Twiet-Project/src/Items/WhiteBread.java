package Items;

public class WhiteBread extends Item{

	public WhiteBread(double itemCost, int itemAmount, String itemName, String itemType) {
		super(itemCost, itemAmount, itemName, itemType);
		itemName = "white bread";
		itemType = "baked good";
		itemCost = 5.00;
		itemAmount = 0;
	}

}
