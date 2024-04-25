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
	for word in range(len(word_inputted)):
		if word % 2 == 1:
			word_counted += word_inputted[word]
	return word_counted
            
    
      