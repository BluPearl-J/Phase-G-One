import java.util.Scanner;

public class GroceryManagerOne {
    static String[] groceryList;
    // pg 338, 337 liang 
    static int itemCount = 0;
    //The number of objects created 

public static void addItem() {
Scanner input = new Scanner(System.in);
System.out.print("Enter the number of grocery items: ");
int totalInitialLength = input.nextInt();
        

groceryList = new String[totalInitialLength];
System.out.println("Enter your " + groceryList.length + " items:");

for (int i = 0; i < groceryList.length; i++) {
System.out.print("Item " + (i + 1));
groceryList[i] = input.nextLine();
itemCount++;
}
}

public static void removeItem(String item) {
boolean found = false;
for (int i = 0; i < itemCount; i++) {
if (groceryList[i] != null && groceryList[i].equalsIgnoreCase(item)) {
groceryList[i] = null;
found = true;
System.out.println("'" + item + "' removed from list.");
break;
}
}
if (!found) {
System.out.println("'" + item + "' not found in list.");
}
}

public static void showItems() {
if (groceryList == null || itemCount == 0) {
System.out.println("Grocery list is empty. Add items");
} else {
System.out.println("Grocery List:");
for (int i = 0; i < groceryList.length; i++) {
if (groceryList[i] != null) {
System.out.println("- " + groceryList[i]);
}
}
}
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

while (true) {
System.out.println("Choose an option:");
System.out.println("1. Add items");
System.out.println("2. Remove item");
System.out.println("3. Show grocery list");
System.out.println("0. Exit");
System.out.print("Enter your choice: ");

String choice = scanner.nextLine();

switch (choice) {
case "1":
addItem();
break;
case "2":
System.out.print("Enter item to remove: ");
String removeItem = scanner.nextLine();
removeItem(removeItem);
break;
case "3":
showItems();
break;
case "0":
System.out.println("Goodbye!");
return;
default:
System.out.println("Invalid choice. Please try again.");
}
}
}
}
