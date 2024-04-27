def length(word_inputted):

        return len(word_inputted)
        
        
def two_length(word_inputted):

        if len(word_inputted) < 2:
            return ""
        else:
            return word_inputted[:2] + word_inputted[-2:]
            
def replace(word_inputted):
    
        if len(word_inputted) < 3:
                return word_inputted 
        elif word_inputted[-3:] == 'ing':
                return word_inputted + 'ly'
        else:
            return word_inputted[-3:] + 'ing'
            
def find_long_word(word_inputted):

	long_word = ""
	long_length = 0

	for word in word_inputted:
		if len(word) > long_length:
			long_word = word
			long_length = len(word)
	return long_word, long_length

def odd_index(word_inputted):
	word_counted = ""
	for counter in range(len(word_inputted)):
		if counter % 2 == 1:
			word_counted += word_inputted[counter]
	return word_counted




def minimum_number(number_inputted):

	
	minimum = number_inputted[0]

	for number in number_inputted:
		if number < minimum:  
			minimum = number
	return minimum


def maximum_number(number_inputted):


	maximum = number_inputted[0]

	for number in number_inputted:

		if number > maximum:
			maximum = number

	return maximum


def two_input(string, num):

	if type(string) and type(num) in [string, int]:
		return string * num
	else:
		return string 


def doubled_numbers(numbers_inputted):
	
	numbers_inputted = [2,3,4,5,7]
	new_list = []

	for numbers in numbers_inputted:
		new_list = [numbers ** 2 for numbers in numbers_inputted]
	return new_list

def summed_doubled_numbers(numbers_inputted):

	numbers_inputted = [2,3,4,5,7]

	new_list = []
	sum = 0
	for numbers in numbers_inputted:
		new_list = [numbers ** 2 for numbers in numbers_inputted]
		
	for number in new_list:
		sum += number

	
	return sum







            
    
      