list_of_numbers = []
second_list_of_numbers = []


def generate_ten_numbers():
    generated_number = 0
    for numbers in range(1, 51, 7):
        for random_number in range(50, -1, -6):
            list_of_numbers.append(numbers)
            if (random_number % 4 == 0):
                list_of_numbers.append(random_number)
                generated_number = list_of_numbers[0:10]
    return generated_number


def length_method(collect_input):
    count = 0
    for numbers in collect_input:
        count += 1
    return count


def sum_of_even_indxes(collect_input):
    sum_of_numbers = 0
    even_index = collect_input[1::2]
    for numbers in even_index:
        sum_of_numbers = sum_of_numbers + numbers
    return sum_of_numbers


def sum_of_odd_indexes(collect_input):
    sum_of_numbers = 0
    odd_index = collect_input[0::2]
    for numbers in odd_index:
        sum_of_numbers = sum_of_numbers + numbers
    return sum_of_numbers


def multiply_third_position(collect_input):
    product = 1
    third_position = collect_input[::3]
    for numbers in third_position:
        product = product * numbers
    return product


def calculate_average(collect_input: list, sum_of_numbers=0):
    for numbers in range(length_method(collect_input)):
        sum_of_numbers += collect_input[numbers]
        average = sum_of_numbers / length_method(collect_input)
    return average


def largest_number_in_the_list(collect_input):
    maximum = 0
    for numbers in range(length_method(collect_input)):
        if collect_input[numbers] > maximum:
            maximum = collect_input[numbers]

    return maximum


def smallest_number_in_the_list(collect_input):
    minimum = collect_input[0]
    for numbers in range(length_method(collect_input)):
        if collect_input[numbers - 1] < minimum:
            minimum = collect_input[numbers - 1]

    return minimum


def length_of_a_string(collect_input, counter=0):
    final_word = ""
    for word in collect_input:
        for letters in word:
            counter += 1
            if word[0] == word[-1] and counter > 2:
                final_word = word

    return final_word


def inclusive_list():
    number_list = []
    for numbers in range(1, 16):
        number_list.append(numbers)
    return number_list


def duplicate_number_list():
    number_list = []
    for numbers in range(1, 16):
        number_list.append(numbers)
        number_list.append(numbers)
    return number_list


def eliminate_duplicate_values():
    number_from_list = duplicate_number_list()
    new_list = set(number_from_list)
    return new_list


def add_the_third_position(collect_input):
    product = 0
    third_position = collect_input[::3]
    for numbers in third_position:
        product = product + numbers
    return product


def add_the_first_middle_and_last_index(collect_input):
    first_index = collect_input[0]
    second_index = length_method(collect_input) // 2
    middle_number = collect_input[second_index]
    last_index = collect_input[- 1]

    # if length_method(collect_input) % 2 != 0:
    #    second_result = first_index + middle_number + last_index + middle_number + collect_input[second_index + 1]
    #   return second_result

    result = first_index + middle_number + last_index

    return result


def collect_input_and_store_in_a_set(collect_input):
    list_of_numbers = set()
    for numbers in collect_input:
        list_of_numbers.add(numbers)

    return list_of_numbers


def sum_collection(collect_input, result=0):
    for numbers in collect_input:
        result += numbers

    return result


def remove_item(collect_input, number):
    removed_element = ""
    for numbers in collect_input:
        if numbers == number:
            return number
        if numbers != number:
             return None
    return removed_element


print(remove_item({"1", "2", "3", "4", "5", "6"}, "7"))


def find_intersection(first_set, second_set):
    result = set()
    for numbers in first_set:
        if numbers in second_set:
            result.add(numbers)
    return result


def union_of_union(first_set, second_set):
    new_set = set()
    for numbers in first_set:
        for number in second_set:
            new_set.add(numbers)
            new_set.add(number)
    return new_set


def isSubSet_(first_set, second_set):
    result = False
    for numbers in first_set:
        if numbers in second_set:
            result = True

    return result


def remove_all_elements(collect_input):
    removed_number = set()
    for numbers in collect_input:
        if numbers > 0 or numbers < 0:
            removed_number = {}
    return removed_number


def maximum_second_set(first_set, second_set):
    maximum = 0
    for numbers in second_set:
        if numbers > maximum:
            maximum = numbers
    return maximum


def minimum_second_set(first_set, second_set):
    minimum = 200000000
    for numbers in second_set:
        if numbers < minimum:
            minimum = numbers
    return minimum


def length_of_a_set(collect_input):
    count = 0
    for numbers in collect_input:
        count += 1

    return count


def empty_tuple(collect_input):
    result = tuple(collect_input)
    return result


def add_to_tuple():
    original_tuple = ()
    for numbers in range(1, 21):
        original_tuple += (numbers,)

    return original_tuple


def sum_of_odd_index(collect_input, sum_of_the_numbers=0):
    for numbers in range(0, length_method(collect_input), 2):
        sum_of_the_numbers += collect_input[numbers]
    return sum_of_the_numbers


def sum_of_even_index(collect_input, sum_of_the_numbers=0):
    for numbers in range(1, (len(collect_input)), 2):
        sum_of_the_numbers += collect_input[numbers]

    return sum_of_the_numbers


def sum_of_the_highest_and_smallest(collect_input):
    maximum = 0
    minimum = collect_input[0]
    for numbers in range(0, length_method(collect_input)):
        if collect_input[numbers] > maximum:
            maximum = collect_input[numbers]
        if collect_input[numbers] < minimum:
            minimum = collect_input[numbers]

        sum_ = maximum + minimum

    return sum_


def empty_dictionary(new_dict={}):
    if new_dict == {}:
        return True
    else:
        return False


def dictionary_script(name, age):
    students = {}

    students['name'] = name
    students['age'] = age

    return students


def sort_dictionary_by_key(collect_input):
    sorted_dictionary = {}
    for key in sorted(collect_input, key=collect_input.get):
        sorted_dictionary[key] = collect_input[key]
    return sorted_dictionary


def sort_dictionary_by_value(collect_input):
    sorted_dictionary = {}
    sorted_values = sorted(collect_input.values())

    for value in range(length_method(sorted_values)):
        sorted_dictionary[value] = sorted_values[value]
    return sorted_values


def sum_the_sort_dictionary_by_value(collect_input):
    sorted_dictionary = 0
    sorted_values = sorted(collect_input.values())

    for value in range(length_method(sorted_values)):
        sorted_dictionary += sorted_values[value]
    return sorted_dictionary

#print(duplicate_number_list())
