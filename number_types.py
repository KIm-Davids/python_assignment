userInput = int(input("How many numbers would you look to check? "))

positive_numbers = 0;
negative_numbers = 0;
zeros = 0;
counter = 0;


for numbers in range(userInput):
	number_to_check = int(input("Enter the number"))
	if(number_to_check >= 1):
		positive_numbers += 1
	if(number_to_check <= -1):
		negative_numbers += 1
	if(number_to_check == 0):
		zeros += 1





print("The positive numbers are: " + str(positive_numbers))
print(negative_numbers)
print(zeros)

