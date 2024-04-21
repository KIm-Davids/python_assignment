summed_number = 0
largest = 0
user_list = []
for number in range(1,5):
	user_input = int(input("Enter number"))
	
	user_list.append(user_input)
	smallest = user_list[0]
	

	summed_number += user_input 
	average = summed_number / 3

#product
	number *= user_input
	number *= user_input

	if user_input > largest:
		largest = user_input
	
	smallest = min(user_list)


print(f'The largest of the number are: {largest}')
print(f'The smallest of the number are: {smallest}')
print(f'The product of the number are: {number}')
print(f'The average of the number are: {average}')
print(f'The sum of the numbers are: {summed_number}')
print(user_input)