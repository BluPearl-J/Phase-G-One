import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalTime;

public class Checkout {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter cashier's name:");
        String cashierName = input.nextLine();

        System.out.println("Enter customer's name:");
        String customerName = input.nextLine();

      
        System.out.println("Enter discount percentage to give customer:");
        double discountRate = Double.parseDouble(input.nextLine());

        ArrayList<String> items = new ArrayList<>();
        ArrayList<Integer> quantities = new ArrayList<>();
        ArrayList<Integer> unitPrices = new ArrayList<>();

        boolean addMoreItems = true;

        while (addMoreItems) {
            System.out.println("Enter product bought:");
            items.add(input.nextLine());

            System.out.println("Enter quantity:");
            quantities.add(Integer.parseInt(input.nextLine()));

            System.out.println("Enter price per unit:");
            unitPrices.add(Integer.parseInt(input.nextLine()));

            System.out.println("Add another item? Type YES to continue or type anything else to stop:");
            String response = input.nextLine().toUpperCase();
            addMoreItems = response.equals("YES");
        }

        displayInvoice(customerName, cashierName, discountRate, items, quantities, unitPrices);
    }

    public static void displayInvoice(String customerName, String cashierName, double discountRate,
                                      ArrayList<String> items, ArrayList<Integer> quantities, ArrayList<Integer> unitPrices) {
        String title = """
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                TEL: 03293828343
                """;

        System.out.println("\n" + title);
        System.out.println("Date: " + LocalDate.now());
        System.out.println("Time: " + LocalTime.now());
        System.out.println("Cashier: " + cashierName); // 🌸 Added cashier name
        System.out.println("Customer: " + customerName);
        System.out.println();

        System.out.printf("%-15s %-10s %-15s %-15s%n", "Item", "Qty", "Price/Unit", "Total");
        System.out.println("---");

        int billGrandTotal = 0;
        for (int i = 0; i < items.size(); i++) {
            int total = quantities.get(i) * unitPrices.get(i);
            billGrandTotal += total;
            System.out.printf("%-15s %-10d NGN%-13d NGN%-13d%n", items.get(i), quantities.get(i), unitPrices.get(i), total);
        }

        //Calculate VAT and discount
        double vat = billGrandTotal * 0.075;
        double discount = billGrandTotal * (discountRate / 100);
        double finalTotal = billGrandTotal + vat - discount;

        System.out.println("-----");
        System.out.printf("%-30s NGN%-13d%n", "BILL GRAND TOTAL:", billGrandTotal);
        System.out.printf("%-30s NGN%-13.2f%n", "VAT @ 7.5%:", vat); 
        System.out.printf("%-30s NGN%-13.2f%n", "Discount:", discount); 
        System.out.printf("%-30s NGN%-13.2f%n", "TOTAL AFTER DISCOUNT & VAT:", finalTotal); 
        System.out.println("\nTHANK YOU FOR YOUR PATRONAGE!");
    }
}
