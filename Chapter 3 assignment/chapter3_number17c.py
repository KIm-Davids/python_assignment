number_of_stars = 10

for row in range(1,number_of_stars + 1):
	
	for space in range(1,(number_of_stars + row) - number_of_stars):
		print(" ", end=" ")
	
	for symbol in range((number_of_stars  - row) - 1):
		print("*", end=" ")

	print() 