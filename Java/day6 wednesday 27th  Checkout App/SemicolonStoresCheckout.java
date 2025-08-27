import java.util.Scanner;

public class SemicolonStoresCheckout {
public static void main(String[] args) {
String name1 = "Adekunle Ciroma";
String product = "Ovaltine beverage";
int numberBought = 6;
int pricePerUnitNGN = 2000;

getCustomersPurchaseDetail(name1, product, numberBought, pricePerUnitNGN);

Scanner scanner = new Scanner(System.in);
System.out.println("Add more items for this customer? YES or NO");
String question = scanner.nextLine().toUpperCase();

switch (question) {
case "YES":
boolean addMoreItems = true;
while (addMoreItems) {
getCustomersPurchaseDetail(name1, product, numberBought, pricePerUnitNGN);
addMoreItems = false;
}
break;

case "NO":
getCustomersPurchaseDetail(name1, product, numberBought, pricePerUnitNGN);
System.out.println("Goodbye");
break;

default:
System.out.println("Error: invalid response");
}
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
}
