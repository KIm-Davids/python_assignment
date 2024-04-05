num1 = int(input("Please enter a price\n"))	
num2 = int(input("Please enter discount recieved\n"))

discountpercentage = num2 / 100 * num1

pricediscount = num1 - discountpercentage

print("The price after discount is " + str(pricediscount))
	
