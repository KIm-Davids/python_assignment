number_inputted = int(input("Enter a five digit integer"))

num2 = number_inputted // 10000 % 1000 % 100
num3 = number_inputted // 1000 % 10
num4 = number_inputted // 100 % 10
num5 = number_inputted // 10 % 10
num6 = number_inputted % 10

print(f"  " + str(num2) + "  " + str(num3) + "  " + str(num4) + "  " + str(num5) + "  " + str(num6))
	
