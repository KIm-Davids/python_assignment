class ac:
    _temperature = 23
    def __init__ (self,temperature:int, is_on:bool):
        self.temperature = temperature
        self.is_on = is_on

    def off_button(self):
       self.is_on = False

    def my_is_on(self):
        return self.is_on

    def on_button(self):
        self.is_on = True

    def temperature_at_23(self):
        return self.temperature

    def increase_temperature(self):
        self.temperature += 1


