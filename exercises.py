import math
print("Exercise #2.1")
print("\n")

x = 2 
y = 3

print('x =', x)
print('value of', x, '+', x, 'is', (x + x))
print('x =')
print((x + y), '=', (y +x))

print("\n")

print("Exercise #2.2")

print("\n")

rating = int(input('Enter an integer rating between 1 and 10\n'))

print("\n")

print("Exercie #2.3")

print("\n")

grade = 90

print('Congratulations! Your grade of ' + str(grade) + ' earns you an A in this course')

print("\n")


print("Exercise #2.4")

print("\n")

number1 = 27.5
number2 = 2

print("The first number is 27.5")
print("The second number is 2")

print("\n")

addition = number1 + number2
subtraction = number1 + number2
multiplication = number1 * number2
division = number1 / number2
floor = number1 // number2
raise_power = number1 ** number2

print("The addition of 27.5 and 2 is = " + str(addition))
print("The subtraction of 27.5 and 2 is = " + str(subtraction))
print("The multiplication of 27.5 and 2 is = " + str(multiplication))
print("The division of 27.5 and 2 is = " + str(division))
print("The floor of 27.5 and 2 is = " + str(floor))
print("The raise_power of 27.5 and 2 is = " + str(raise_power))

print("\n")

print("Exercise #2.5")

print("\n")

radius = 2
pie = 3.14159

diameter = 2 * radius
circumference = 2 * pie * radius
area = pie * (radius ** 2) 

print("The radius = 2 ")
print("The pie = 3.14159")

print("\n")

print("The diameter of the inputted number is " + str(diameter))
print("The circumference of the inputted number is " + str(circumference))
print("The area of the inputted number is " + str(area))


print("\n")

print("Exercise #2.6")

print("\n")

number1 = int(input("Enter an integer to determing if it's an Odd or Even number\n"))
number2 = number1

if number2 % 2 == 0:
	print("The number is even")
else:
	print("The number is odd")

print("\n")


print("Exercise #2.7")

print("\n")

number1 = 2
number2 = 4
number3 = 1024
number4 = 10

print("Check if the 2 is a multiple of 10")
print("Check if 1024 is a multiple of 4")

print("\n")

if number3 % number2 == 0:
	print("It is a multiple of 4")
else:
	print("It it not a multiple of 4")

if number4 % number1 == 0:
	print("It is a multiple of 10")
else:
	print("It is not a multiple of 10")

print("\n")


print("Exercise #2.8")

print("\n")

print("number " + "square " + "cube")
print("0      " + "0     " + "0   ")
print("1      " + "1     " + "1   ")
print("2      " + "4     " + "8   ")
print("3      " + "9     " + "27  ")
print("4      " + "16    " + "64  ")
print("5      " + "25    " + "125 ")

print("\n")

print("number " + "square " + "cube")
print("     0" + "     0" + "   0")
print("     1" + "     1" + "   1")
print("     2" + "     4" + "   8")
print("     3" + "     9" + "  27")
print("     4" + "    16" + "  64")
print("     5" + "    25" + " 125")

print("\n")

print("Exercise #2.9")

print("\n")

print("The integer value of character'A' is", ord('A'))

print("\n")

print("Exercise #2.10")

print("\n")

first_number = int(input("Enter a number to check the sum, average, product, smallest and largest\n"))
second_number = int(input("Enter the second number check the sum, average, product, smallest and largest\n"))
third_number = int(input("Enter the third number check the sum, average, product, smallest and largest\n"))

sum = first_number + second_number + third_number

average = sum / 3

product = first_number  * (second_number * third_number)

largest = first_number
smallest = first_number

if second_number < smallest: 
	smallest = second_number
	
if third_number < smallest:
	smallest = third_number

if first_number < smallest:
	smallest = first_number



if second_number > largest:
	largest = second_number

if third_number > largest:
	largest = third_number
	
if first_number > largest:
	largest = first_number
	
print("The sum is = ", sum)
print("The average is = ", average)
print("The product is = ", product)
print("The smallest number is: ", smallest)
print("The largest number is: ", largest)	


print("\n")

print("Exercise #2.11")


print("\n")

number_inputted = int(input("Enter a five digit integer, let's print it seperately\n"))

num2 = number_inputted // 10000 % 1000 % 100
num3 = number_inputted // 1000 % 10
num4 = number_inputted // 100 % 10
num5 = number_inputted // 10 % 10
num6 = number_inputted % 10

print(f"  " + str(num2) + "  " + str(num3) + "  " + str(num4) + "  " + str(num5) + "  " + str(num6))
	

print("\n")

print("Exercise #2.12")

print("\n")

principal = 1000
annual_rate = 7 / 100
number_of_years10 = 10
number_of_years20 = 20
number_of_years30 = 30

ten_years = principal * (1 + annual_rate) ** 10
twenty_years = principal * (1 + annual_rate) ** 20
thirty_years = principal * (1 + annual_rate) ** 30

print(f"The amount deposited at the end of 10 years is {ten_years:,.0f}")
print(f"The amount deposited at the end of 20 years is {twenty_years:,.0f}")
print(f"The amount depostied at the end of 30 years is {thirty_years:,.0f}")









