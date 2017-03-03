import java.util.Scanner;

public class CashRegisterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CashRegister myCashRegister = new CashRegister();
		

		
		//Ask cashier to select from following options(1-7)
		/*
		 * 1. Add new Item in CashRegister
		 * 2. Update price for Item in CashRegister
		 * 3. Delete Item from CashRegister
		 * 4. Display all Items stored in CashRegister
		 * 5. Display item details (ask for barcode)
		 * 6. Display items by given Category
		 * 7. Exit 
		 * 
		 */
		
		
		Item myItem = new Item(123456, "Tide 16oz Detergent", 16.95, 'A' );
		myCashRegister.addItem(myItem);
		myCashRegister.deleteItem(123456);
		Item item2 = myCashRegister.getItem(123456);
		System.out.println(item2.toString()); //this should print the barcode, name, cost and category
		myCashRegister.updateItem(123456,"Tide 16oz Detergent", 17.95, 'C');
		myCashRegister.printItemsByCategory('C');
		//this will print all item by given category
		myCashRegister.pringAllItems();
		

	}

}
