from python_functions import length
from python_functions import two_length
from python_functions import replace
from python_functions import find_long_word
from python_functions import odd_index
from python_functions import two_input
from python_functions import maximum_number
from python_functions import minimum_number
from python_functions import doubled_numbers
from python_functions import summed_doubled_numbers

def test_length_python_functions():
        assert length("semicolon") == 9
        
def test_two_length_python_functions():        
        assert two_length('semicolon') == 'seon'
        assert two_length('on') == 'onon'
        assert two_length('o') == "" 
        
def test_replace_python_functions():
        assert replace('abc') == 'abcing'
        assert replace('string') == 'stringly'
        assert replace('on') == 'on'
        
def test_find_long_word_python_functions():

	word_inputted = ["welcome", "out", "weather", "mobile", "Breakfast", "journey"]

	long_word, long_length = find_long_word(word_inputted) 
   
	assert long_word == 'Breakfast' and long_length == 9

def test_odd_index_python_functions():

	assert odd_index('semicolon') == 'eioo'

def test_two_input_python_functions():
	assert two_input('hello',3) == 'hellohellohello'
	assert two_input('hi',4.5) == 'hi'

def test_minimum_number_python_fuctions():
	number_inputted = [8,4,9,2,5,7,3]
	assert minimum_number(number_inputted) == 2

def test_maximum_number_python_fuctions():
	number_inputted = [8,4,9,2,5,7,3]
	assert maximum_number(number_inputted) == 9

def test_doubled_numbers_python_functions():
	numbers_inputted = [2,3,4,5,7]
	assert doubled_numbers(numbers_inputted) == [4,9,16,25,49]

def test_summed_doubled_numbers_python_functions():

	numbers_inputted = [2,3,4,5,7]
	assert summed_doubled_numbers(numbers_inputted) == 103 



        
