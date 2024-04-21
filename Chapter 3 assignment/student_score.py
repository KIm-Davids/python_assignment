passes = 0
failures = 0
#user_input = int(input("Enter result (1 = pass, 2 = fail): "))

while True:
	user_input = int(input("Enter result (1 = pass, 2 = fail): "))

	if user_input == 1:
		passes = passes + 1
	if user_input == 2:
		failures = failures + 1	
	
	if user_input > 1 and user_input > 2:
		break
	

print('Passed: ', passes)
print('Failed: ', failures)

if passes > 8:
	print('Bonus to instructor')