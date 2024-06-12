import random

class Bank:
    
    def __init__(self, balance = 0, name = "",account_number = 0) -> None:
        self.balance = balance
        self.name = name
        self.account_number = account_number

    def get_balance(self):
        return self.balance
    
    def get_transfer(self):
        return self.transfer
    
    def get_name(self):
        return self.name
		
    def get_account_number(self):
        return self.account_number
		
    def get_pin(self):
        return self.pin
		
    def set_transfer(self,transfer):
        self.balance -= transfer   
        
    def set_balance(self,balance):
        self.balance = balance

    def set_name(self,name):
        self.name = name
        
    def set_withdraw(self,withdraw):
        if(self.balance >= withdraw):
            self.balance -= withdraw
       

    def set_deposit(self,deposit):
        self.balance += deposit

    def set_account_number(self,account_number):
        self.account_number = account_number

    def set_pin(self,pin):
        self.pin = pin
  
    def __str__(self):
	    return f"Customer name: {self.get_name()}\ncustomer account number: {self.get_account_number()}\nCustomer Balance: {str(self.balance)}"