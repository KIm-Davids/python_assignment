user_list = []
largest = 0
second_largest = 0

for numbers in range(0,11):
	numbers_inputted = int(input("Enter 5 number"))
	user_list.append(numbers_inputted)

user_list.sort()


print(user_list[-1])
print(user_list[-2])
		