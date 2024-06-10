numbers = [1,3,5,4,8,2,4,3,6,5,9]
x = 3
y = 2
x_array = []
y_array = []
x_array.append(x)
y_array.append(y)

index_x = [i for i in range(len(numbers)) if numbers[i] in x_array]
index_y = [i for i in range(len(numbers)) if numbers[i] in y_array]

for counter in index_y:
	number_one = counter
for number in index_x:
	result = abs(number_one - number)
	
print(result)	
	
	