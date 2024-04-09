students_passed = 0
students_failed = 0
for number in range(1, 16):
	scores = int(input("Please input scores"))
	if(scores < 45):
		students_failed = students_failed + 1
	if(scores >= 45):
		students_passed = students_passed + 1

print("The students that failed are " + str(students_failed))
print("The students that passed are " + str(students_passed))

