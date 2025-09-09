from datetime import date, datetime

# Collect cashier and customer info
cashier_name = input("Enter cashier's name:\n")
customer_name = input("Enter customer's name:\n")
discount_rate = float(input("Enter discount percentage to give customer:\n"))

items = []
quantities = []
unit_prices = []

add_more_items = True

while add_more_items:
    item = input("Enter product bought:\n")
    quantity = int(input("Enter quantity:\n"))
    price = int(input("Enter price per unit:\n"))

    items.append(item)
    quantities.append(quantity)
    unit_prices.append(price)

    response = input("Add another item? Type YES to continue or type anything else to stop:\n").upper()
    add_more_items = response == "YES"

def display_invoice(customer_name, cashier_name, discount_rate, items, quantities, unit_prices):
    title = """
SEMICOLON STORES
MAIN BRANCH
LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
TEL: 03293828343
    """
    print("\n" + title)
    print("Date:", date.today())
    print("Time:", datetime.now().strftime("%H:%M:%S"))
    print("Cashier:", cashier_name)
    print("Customer:", customer_name)
    print()

    print("Item\tQty\tPrice/Unit\tTotal")
    print("---")

    bill_grand_total = 0
    for i in range(len(items)):
        total = quantities[i] * unit_prices[i]
        bill_grand_total += total
        print(items[i], "\t", quantities[i], "\tNGN", unit_prices[i], "\tNGN", total)

    vat = bill_grand_total * 0.075
    discount = bill_grand_total * (discount_rate / 100)
    final_total = bill_grand_total + vat - discount

    print("-----")
    print("BILL GRAND TOTAL:", "NGN", bill_grand_total)
    print("VAT @ 7.5%:", "NGN", round(vat, 2))
    print("Discount:", "NGN", round(discount, 2))
    print("TOTAL AFTER DISCOUNT & VAT:", "NGN", round(final_total, 2))
    print("\nTHANK YOU FOR YOUR PATRONAGE!")

display_invoice(customer_name, cashier_name, discount_rate, items, quantities, unit_prices)
