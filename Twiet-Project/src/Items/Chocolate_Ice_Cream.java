package Items;

public class Chocolate_Ice_Cream extends Item{

	public Chocolate_Ice_Cream(double itemCost, int itemAmount, String itemName, String itemType) {
		super(itemCost, itemAmount, itemName, itemType);
		itemCost = 5.50;
		itemAmount = 0;
		itemName = "Chocolate Ice Cream";
		itemType = "frozen desert";
		}

}