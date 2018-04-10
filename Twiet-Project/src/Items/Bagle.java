package Items;

public class Bagle extends Item{

	public Bagle(double itemCost, int itemAmount, String itemName, String itemType) {
		super(itemCost, itemAmount, itemName, itemType);
		itemCost = 5.50;
		itemAmount = 0;
		itemName = "bagle";
		itemType = "baked good";
	}
	
}
