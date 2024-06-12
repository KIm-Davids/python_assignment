import unittest
from python_task import *


class MyTestCase(unittest.TestCase):
    def test_length(self):
        self.assertEqual(7, length_method([1, 2, 3, 4, 5, 6, 7]))

    def test_to_get_the_sum_of_even_index(self):
        self.assertEqual(12, sum_of_even_indxes([1, 2, 3, 4, 5, 6, 7]))

    def test_to_get_the_sum_of_odd_index(self):
        self.assertEqual(16, sum_of_odd_indexes([1, 2, 3, 4, 5, 6, 7]))

    def test_to_get_the_product_of_the_index(self):
        self.assertEqual(28, multiply_third_position([1, 2, 3, 4, 5, 6, 7]))

    def test_to_get_the_average_of_the_index(self):
        self.assertEqual(4, calculate_average([1, 2, 3, 4, 5, 6, 7]))

    def test_to_get_the_largest_of_the_index(self):
        self.assertEqual(10, largest_number_in_the_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]))

    def test_to_get_the_smallest_of_the_index(self):
        self.assertEqual(1, smallest_number_in_the_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]))

    def test_to_get_the_length_of_a_string(self):
        self.assertEqual("sonos", length_of_a_string(["semicolon", "finish", "hundred", "sonos"]))

    def test_to_get_an_inclusive_list(self):
        self.assertEqual([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15], inclusive_list())

    def test_to_check_for_duplicates_number(self):
        self.assertEqual(
            {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15},
            duplicate_number_list())

    def test_to_remove_for_duplicates_number(self):
        self.assertEqual({1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, eliminate_duplicate_values())

    def test_to_add_to_the_third_index(self):
        self.assertEqual(12, add_the_third_position([1, 2, 3, 4, 5, 6, 7, 8, 9]))

    def test_add_the_third_position(self):
        self.assertEqual(15, add_the_first_middle_and_last_index([1, 2, 3, 4, 5, 6, 7, 8, 9]))

    def test_that_user_can_add_to_a_set(self):
        self.assertEqual({1, 2, 3, 4, 5, 6, 7}, collect_input_and_store_in_a_set([1, 2, 4, 5, 6, 7]))

    def test_to_sum_up_a_collection(self):
        self.assertEqual(21, sum_collection({1, 2, 3, 4, 5, 6}))

    def test_inputted_number_is_not_present_in_the_set(self):
        self.assertEqual("1", remove_item({"1", "2", "3", "4", "5", "6"}, "1"))


if __name__ == '__main__':
    unittest.main()
