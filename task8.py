total_number = 1
first_number = 4
totalnumber = 1
second_number = 8
final_result = 0
finalresult = 0
total = 0

for number in range(5):
	total_number = total_number * first_number
	final_result = final_result + total_number
	
	
for number in range(5):
	totalnumber = totalnumber * second_number
	finalresult = finalresult + totalnumber
	
total = final_result + finalresult
	

print(total, end= "  ")
