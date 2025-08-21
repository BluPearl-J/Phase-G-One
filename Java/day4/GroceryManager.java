import java.util.ArrayList;

import java.util.scanner;

public class GroceryManager {
String [] groceryList = new String[totalInitialLength]; 

public static void addItem(String items) {
System.out.print("Enter the number of grocery items: ");
Scanner input =new Scanner(System.in);
int totalInitialLength = input.nextInt();

String [] groceryList = new String[totalInitialLength]; 
//System.out.print("add item ");

System.out.print("Enter your " + groceryList.length + " values: ");
for (int i = 0; i < groceryList.length; i++) 
groceryList[i] = input.nextString();
groceryList.add(item);
int itemCount=0;
itemCount++;
System.out.println("" + item + "added to grocery list.");


public void removeItem(String item) {
if (groceryList.remove(item)) {
System.out.println( item + "' removed from list.");
} 
else {
System.out.println( item + "not found inlist.");
 }
 }



public static void ShowItem(String items) {

if (groceryList.isEmpty()) {
System.out.println("empty.add items");
        } 
else {
 System.out.println("Grocery List:");  }      
//Displaying arrays: printing array,elements
for (int i = 0; i < groceryList.length; i++) {
 System.out.print(groceryList[i] + " ");
}

//for (double e: groceryList) {
//System.out.println(e);
}
}




public static void main(String[] args) {
       
Scanner scanner = new Scanner(System.in);
while (true) {
System.out.println("Choose option:");
System.out.println("1. Add item");
System.out.println("2. Remove item");
System.out.println("3. Show available item");
System.out.println("0. Exit");
System.out.print("Enter your choice (1-0): ");

String answerSelected = scanner.nextLine();
switch (answerSelected) {
case "1":
System.out.print("Enter item to add: ");
String addItem = scanner.nextLine();
groceryManager.addItem(addItem);
break;
case "2":
System.out.print("Enter item to remove: ");
String removeItem = scanner.nextLine();
groceryManager.removeItem(removeItem);
break;
case "3":
groceryManager.showItems();
break;
case "0":
System.out.println("Goodbye");
return;
default:
System.out.println("Invalid choice. Please try again.");
}
}
}
}

//pg 456 lian
//+ArrayList()    Creates an empty list
//ArrayList<String> cityList = new ArrayList<>();
//+add(o: E): void  Appends a new element o at the end of this list. 
//+contains(o: Object): boolean   Returns true if this list contains the element o.
//+isEmpty(): boolean   Returns true if this list contains no elements.
//+lastIndexOf(o: Object): int
//(o: Object): boolean
//+size(): int
//+remove(index: int): boolean



