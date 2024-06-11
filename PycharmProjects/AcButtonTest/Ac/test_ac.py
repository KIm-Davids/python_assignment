from unittest import TestCase
from ac import ac


class Testac(TestCase):
    my_ac = ac(23, False)

    def test_is_off(self):
        self.assertFalse(self.my_ac.off_button())

    def test_is_on(self):
        self.my_ac.on_button()
        self.assertTrue(self.my_ac.my_is_on()),

    def test_test_the_initial_temperature(self):
        self.my_ac.on_button()
        self.assertEqual(23, self.my_ac.temperature_at_23())

    def test_that_the_ac_can_increase(self):
        self.my_ac.on_button()
        self.assertEqual(24, self.my_ac.temperature_at_23() + 1)

    def test_that_the_ac_can_decrease(self):
        self.my_ac.on_button()
        self.assertEqual(22, self.my_ac.temperature_at_23() - 1)
