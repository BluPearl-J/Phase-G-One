
  print "Enter cashier's name"
  set cashierName TO user input

  print "Enter customer's name"
 setcustomerName TO user input

  print "Enter discount percentage to give customer"
  setdiscountRate TO user input as decimal

 initialise items as empty list
  initialisequantities as empty arraylist
 initialise unitPrices as empty arraylist

  SET addMoreItems TO true

  WHILE addMoreItems IS true 
    print "Enter product bought"
    add user input TO items arraylist

    DISPLAY "Enter quantity"
    ADD user input TO quantities arraylist

    DISPLAY "Enter price per unit"
    ADD user input TO unitPrices arraylist

    DISPLAY "Add another item? Type YES to continue or anything else to stop"
    IF user input (uppercase) IS NOT "YES" THEN
      SET addMoreItems TO false
    END IF
  END WHILE

  CALL displayInvoice WITH customerName, cashierName, discountRate, items, quantities, unitPrices

END Program


FUNCTION displayInvoice(customerName, cashierName, discountRate, items, quantities, unitPrices)

  displaystore header and contact info
  display current date and time
  print cashierName and customerName

  display table headers: Item, Qty, Price/Unit, Total

  set billGrandTotal TO 0

  FOR each index i FROM 0 TO length of items list DO
    SET total TO quantities[i] * unitPrices[i]
    ADD total TO billGrandTotal
    DISPLAY items[i], quantities[i], unitPrices[i], total
 end for loop

  SET vat TO billGrandTotal * 0.075
  SET discount TO billGrandTotal * (discountRate / 100)
  SET finalTotal TO billGrandTotal + vat - discount

  print "BILL GRAND TOTAL:", billGrandTotal
print"VAT @ 7.5%:", vat
  print"Discount:", discount
print"TOTAL AFTER DISCOUNT & VAT:", finalTotal
  print "THANK YOU FOR YOUR PATRONAGE!"

