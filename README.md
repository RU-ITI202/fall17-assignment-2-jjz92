# Individual-Assignment-2
This is repository to store starter project for Assignment 2


## Objective
### Demonstrate the following:

1. Usage of Eclipse
2. Variable Assignment
3. Looping (for, while etc)
4. ArrayList (using object)
5. Object based programming
6. String to Integer or vice-versa conversions as needed
7. User Interaction with multiple options
8. Implementing Methods in relavent classes
9. Use Github for Individual Assignment

### Instructions
* You will create a basic java program to Store Items in cashRegister with its Barcode, name, cost and category
* The program should prompt store-manager various actions he can perform on cashRegister like addNewItem, updateItem, deleteItem, displayAllItems, Print information for selected Item based on its barcode, exit
* Based on the selected action ask for further input for example user select to update Item, ask him to enter the barcode for the item he wants to update details, following prompts will be to get the name, cost and category so you can update the item in cashRegister
* Implement various methods shown in CashRegisterTester.java file
* Validate user cannot add Item with existing barcode they have to enter unique barcode for each item.
* When asked to print all Items print based on Category, Name, Barcode 
* Gracefully exit the program


## Sample Output

```

WELCOME TO THE CASH REGISTER APPLICATION
-----------------------------------------------------------------------------
Select one of the following options:
		 1. Add new Item in CashRegister
		 2. Update price for Item in CashRegister
		 3. Delete Item from CashRegister
		 4. Display all Items stored in CashRegister
		 5. Display item details (ask for barcode)
		 6. Display item for Selected Category
		 7. Exit
1
You have selected to Add new Item
Please Enter Barcode:
123456
Please Enter Name:
Test Item
Please Enter Cost:
20.5
Please Enter Category(A- Food, B-Clothes, C-Other):
C

Item "Barcode: 123456, Name: Test Item, Cost: $20.50, Category: Other" is added in CashRegister

Select one of the following options:
		 1. Add new Item in CashRegister
		 2. Update price for Item in CashRegister
		 3. Delete Item from CashRegister
		 4. Display all Items stored in CashRegister
		 5. Display item details (ask for barcode)
		 6. Display item for Selected Category
		 7. Exit
4
You have selected to Display allItems stored in CashRegister
	Barcode: 123456, Name: Test Item, Cost: $20.50, Category: Other

Select one of the following options:
		 1. Add new Item in CashRegister
		 2. Update price for Item in CashRegister
		 3. Delete Item from CashRegister
		 4. Display all Items stored in CashRegister
		 5. Display item details (ask for barcode)
		 6. Display item for Selected Category
		 7. Exit
7
Are you sure you want to Exit(y/n)?
y
Good Bye Have a Nice Day! 
``` 

 
## Total Possible Points: 100
 
1. Program runs as submitted - 5 points
2. Program accepts all valid option (1-6) only and handle errors properly - 10 points
3. Program adds new Items - 10 points
4. Program update existing Item - 10 points
5. Program delete existing Item - 10 points
6. Program display existing Item - 10 points
7. Program display all items in proper order category A first, name, barcode - 15 points
8. Program exits without problems with proper message - 5 points
9. Code is well documented using Javadocs - 10 points
10. Program handles errors properly - 15 points
	* Shows error for user input (validate double, string, char, etc)
	* Shows error when Item not found or invalid barcode entered
