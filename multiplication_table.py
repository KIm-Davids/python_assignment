multiplication_number = int(input("Enter a number to check the multiplication table "))

multiplied_number = 1

for numbers in range(1,11):
	multiplied_number = multiplication_number * numbers
	print(f"{multiplication_number} * {numbers} = {multiplication_number * numbers}")