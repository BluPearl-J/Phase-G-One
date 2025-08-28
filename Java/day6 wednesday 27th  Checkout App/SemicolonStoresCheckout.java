

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalTime;

public class SemicolonStoresCheckout {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Enter customer's name:");
String customerName = input.nextLine();



List<String> items = new ArrayList<>();
List<Integer> quantities = new ArrayList<>();
List<Integer> unitPrices = new ArrayList<>();

boolean addMoreItems = true;

while (addMoreItems) {
System.out.println("Enter product bought:");
items.add(input.nextLine());

<<<<<<< HEAD
=======
case "NO":
System.out.println("Goodbye");
break;
>>>>>>> 5bd6406b813542cdc95cb19b9b677773952584c2

System.out.println("Enter quantity:");
quantities.add(Integer.parseInt(input.nextLine()));

System.out.println("Enter price per unit:");
unitPrices.add(Integer.parseInt(input.nextLine()));

System.out.println("Add another item? Type YES to continue or type anything else to stop:");
String response = input.nextLine().toUpperCase();
addMoreItems = response.equals("YES");
}
displayInvoice(customerName, items, quantities, unitPrices);
}

public static void getCustomersPurchaseDetail(String name, String product, int numberBought, int pricePerUnit) {
System.out.println("What is the customer's name?");
System.out.println(name);
System.out.println("What did the customer " + name + " buy?");
System.out.println(product);
System.out.println("How many pieces of " + product + " did " + name + " buy?");
System.out.println(numberBought);
System.out.println("How much per unit (NGN):");
System.out.println(pricePerUnit);
}

public static void displayInvoice(String customerName, List<String> items, List<Integer> quantities, List<Integer> unitPrices) {
String title = """
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                TEL: 03293828343
                """;

System.out.println("\n" + title);
System.out.println("Date: " + LocalDate.now());
System.out.println("Time: " + LocalTime.now());
System.out.println("Customer: " + customerName);
System.out.println();

System.out.printf("%-15s %-10s %-15s %-15s%n", "Item", "Qty", "Price/Unit", "Total");
System.out.println("---");

int billGrandTotal = 0;
for (int i = 0; i < items.size(); i++) {
int total = quantities.get(i) * unitPrices.get(i);
billGrandTotal += total;
System.out.printf("%-15s %-10d NGN%-13d NGN%-13d%n", items.get(i), quantities.get(i), unitPrices.get(i), total);}

System.out.println("-----");
System.out.printf("%-30s NGN%-13d%n", "BILL GRAND TOTAL:", billGrandTotal);
System.out.println("\nTHANK YOU FOR YOUR PATRONAGE!");
}
}
