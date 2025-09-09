const prompt = require('prompt-sync')();

// Collect cashier and customer info
const cashierName = prompt("Enter cashier's name:\n");
const customerName = prompt("Enter customer's name:\n");
const discountRate = parseFloat(prompt("Enter discount percentage to give customer:\n"));

const items = [];
const quantities = [];
const unitPrices = [];

let addMoreItems = true;

while (addMoreItems) {
  const item = prompt("Enter product bought:\n");
  const quantity = parseInt(prompt("Enter quantity:\n"));
  const price = parseInt(prompt("Enter price per unit:\n"));

  items.push(item);
  quantities.push(quantity);
  unitPrices.push(price);

  const response = prompt("Add another item? Type YES to continue or type anything else to stop:\n").toUpperCase();
  addMoreItems = response === "YES";
}

// Display invoice
function displayInvoice(customerName, cashierName, discountRate, items, quantities, unitPrices) {
  const title = `
SEMICOLON STORES
MAIN BRANCH
LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
TEL: 03293828343
  `;

  console.log("\n" + title);
  console.log("Date:", new Date().toLocaleDateString());
  console.log("Time:", new Date().toLocaleTimeString());
  console.log("Cashier:", cashierName);
  console.log("Customer:", customerName);
  console.log();

  console.log("Item\t\tQty\tPrice/Unit\tTotal");
  console.log("---");

  let billGrandTotal = 0;
  for (let i = 0; i < items.length; i++) {
    const total = quantities[i] * unitPrices[i];
    billGrandTotal += total;
    console.log(`${items[i]}\t\t${quantities[i]}\tNGN${unitPrices[i]}\t\tNGN${total}`);
  }

  const vat = billGrandTotal * 0.075;
  const discount = billGrandTotal * (discountRate / 100);
  const finalTotal = billGrandTotal + vat - discount;

  console.log("-----");
  console.log(`BILL GRAND TOTAL:\tNGN${billGrandTotal}`);
  console.log(`VAT @ 7.5%:\t\tNGN${vat}`);
  console.log(`Discount:\t\tNGN${discount}`);
  console.log(`TOTAL AFTER DISCOUNT & VAT:\tNGN${finalTotal}`);
  console.log("\nTHANK YOU FOR YOUR PATRONAGE!");
}

displayInvoice(customerName, cashierName, discountRate, items, quantities, unitPrices);
