package shoppingListItems;

import java.util.InputMismatchException;
import java.util.Scanner;

public class timerForPerishablityClass {
	
	private static boolean ITP;//Shortened check for if item is perishable
	private static boolean YNGate;
	
	private static double IED;//Shortened max time before expiration
	private static double ST;//Shortened system time
	
	private static String IN;//Shortened item name
	private static String allIsOkForever = " is unperishable.";
	private static String allIsOk = " has not yet expired";
	private static String allIsNotOk = " has expired";
	private static String errorMessage = "If the code gets here something is very wrong";

	@SuppressWarnings("resource")
	public static String isRotten(String itemName, boolean isItemPerishable, double itemExpirationDate, double systemTime) {
		ITP = isItemPerishable;
		IED = itemExpirationDate;
		ST = systemTime;
		IN = itemName;
		
		Scanner sc = new Scanner(System.in);
		/*
		 * Everything here will be changed around when I move this too a GUI.
		 */
		
		if(!ITP) {
			return (IN + allIsOkForever);
		}
		else {
			if(itemExpirationDate > systemTime) {
				return (IN + allIsOk);
			}
			else {
				System.out.println("This " + IN + "Is found to be expired. Do you wish to replace it.");
				try {
					YNGate = sc.nextBoolean();
					if(YNGate) {
						IED = IED + ST;//In theory this line will buy a new set of groceries when that part of the code is set up.
						isRotten(itemName, isItemPerishable, IED, systemTime);
					}
					else {
						return (IN + allIsNotOk);
					}
				}
				catch(InputMismatchException e) {
					System.out.println("print either true or false");
					isRotten(itemName, isItemPerishable, IED, systemTime);
				}
			}
		}
		isRotten(itemName, isItemPerishable, IED, systemTime);
		return errorMessage;
	}
	
}
