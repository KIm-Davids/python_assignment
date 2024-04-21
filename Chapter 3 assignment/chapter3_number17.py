number_of_star = 11

for row in range(1,number_of_star - 1):


	for space in range(2,(number_of_star - row) + 1):
		print(" ", end=" ")
	
	for symbol in range(1,row + 1):
		print("@",end=" ") 

	print() 
		
print(end=" ")

print()


number_of_stars = 10

for row in range(1,number_of_stars + 1):
	
	for space in range(1,(number_of_stars + row) - number_of_stars):
		print(" ", end=" ")
	
	for symbol in range((number_of_stars  - row) - 1):
		print("*", end=" ")

	print()     


number_of_stars = 10

for row in range(1,number_of_stars):


	for space in range(number_of_stars,(number_of_star - row) - 1):
		print("*", end=" ")
	
	for symbol in range(1,(row - 1) + 1):
		print("*", end=" ")


	print()       

print()



number_of_stars = 10

for row in range(1,number_of_stars):
	

	for spaces in range(1,(row - 1) + 1):
		print("#",end=" ")

	for symbol in range(10,(number_of_stars + 1) + 1):
		print("*",end=" ")


	print()














                                                                                                                                                                                                                                                                                                                    