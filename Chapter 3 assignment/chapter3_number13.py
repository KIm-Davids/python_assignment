user_input = int(input("Enter a number "))
final_result = 1
result = 1

for number in range(1, user_input):
	result = user_input - (number - 1)
	final_result *= result 

print(f'The factor of {user_input} is {final_result}')