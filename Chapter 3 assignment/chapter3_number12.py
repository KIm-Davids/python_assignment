user_input = int(input("Enter a five digit: "))

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


if first_number == fifth_number and second_number == fourth_number:
	print("It is a palindrome")
else:
	print("It is not a palindrome")

