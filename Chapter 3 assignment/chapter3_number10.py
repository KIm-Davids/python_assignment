for number in range(1,31,1):
	a = 0
	p = 1000
	r = 7/100
	t = 0

	calculated_value = p*(1 + r)**number
	
	print(f'year {number} amount - {calculated_value:.2f}')
	