number_to_check = int(input("Enter the amount of numbers you would want to check "))

largest = 0
smallest = 1
number_to_compare = 0

for numbers in range(number_to_check):
	checking_number = int(input("Enter the number"))
	if(checking_number > largest):
		largest = checking_number
	if(checking_number < smallest):
		smallest = checking_number

print("The largest number is " + str(largest))
print("The smallest number is " + str(smallest))


			