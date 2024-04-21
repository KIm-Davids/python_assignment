user_input = int(input("Enter a five digit number"))

for number in range(5):

	a = user_input / 10000 % 1000 % 100
	b = user_input / 1000 % 100 % 10
	c = user_input / 100 % 10
	d = user_input / 10 % 10
	e = user_input % 10

	first_number = int(a)
	second_number = int(b)
	third_number = int(c)
	fourth_number = int(d)
	fifth_number = int(e)

print(f'{first_number} {second_number} {third_number} {fourth_number} {fifth_number}')