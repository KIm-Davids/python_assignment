from python_functions import length
from python_functions import two_length
from python_functions import replace
from python_functions import find_long_word
from python_functions import odd_index


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

        
