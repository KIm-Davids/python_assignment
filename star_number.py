star_number = int(input("Enter the number of triangles"))

star = "*"
for number in range(1):
	print(f'{" " * star_number}')
	for numbers in range(star_number):
		print(f'{"*" * numbers + "*"}') 
