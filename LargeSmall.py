first_number = int(input("Enter a number"))
second_number = int(input("Enter a number"))
third_number = int(input("Enter a number"))

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

