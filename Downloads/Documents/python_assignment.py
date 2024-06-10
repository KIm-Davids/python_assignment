list_of_numbers = []

def generate_ten_numbers():
    for numbers in range(1,51,5):
        list_of_numbers.append(numbers)

def length_of_a_list(collect_input):
    for numbers in collect_input:
        length = numbers
    return length   

def sum_of_even_indxes(collect_input):
    sum_of_numbers = 0
    numbers = 0
    even_index = collect_input[1::2]
    for numbers in even_index:
        sum_of_numbers = sum_of_numbers + numbers
    return sum_of_numbers

def sum_of_odd_indexes(collect_input):
    sum_of_numbers = 0
    numbers = 0
    odd_index = collect_input[0::2]
    for numbers in odd_index:
        sum_of_numbers = sum_of_numbers + numbers
    return odd_index

def multiply_third_position(collect_input):
    product = 1
    third_position = collect_input[::3]
    for numbers in third_position:
        product = product * numbers
    return product

def calculate_average(collect_input):
    average = 0
    for numbers in collect_input:
        for length in len(collect_input):
            sum_of_numbers = sum_of_numbers + numbers
            

print(multiply_third_position([1,2,3,4,5,6,7]))


