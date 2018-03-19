package Items;

public class FrozenFoodMicrowaveMeals extends Item{

	public FrozenFoodMicrowaveMeals(String itemTypeC, String itemNameC, int aisleNum, int itemAmountC, double itemCostC,
			long timeTillExpirationC, boolean itemOnGroundC, boolean itemPerishableC) {
		super(itemTypeC, itemNameC, aisleNum, itemAmountC, itemCostC, timeTillExpirationC, itemOnGroundC, itemPerishableC);
		setAisleStartUp();
		aisleNum = aisle;
		itemTypeC = itemType;
	}
	
	private static void setAisleStartUp() {
		aisle = 3;
		itemType = "Frozen Food that is a meal.";
	}
}
