def print_the_sum_of_the_index(collect_input):
    sum_of_the_numbers = 0
    for number in range(11):
        if number % 2 == 0:
            sum_of_the_numbers += number
    print(sum_of_the_numbers)
