miles_driven = 0
gallons_used = 0
counter =  -1
result = 1
total = 0
result_minus_1 = 0

while True:
	gallons_used = float(input("Enter gallons used (-1 to end): "))
	miles_driven = float(input("Enter miles driven (-1 to end): "))
	

	result_calculated = miles_driven / gallons_used

	counter = counter + 1
	print(result_calculated)
	result += result_calculated
	
	if gallons_used == -1:
		break

average = result / counter
average = average - 1		
	
	
print(f'The overall miles/gallons is = {average}')
print(f'counter: {counter}')