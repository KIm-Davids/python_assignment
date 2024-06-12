from bank import Bank
from login_user import Login_user
import random

my_bank = Bank()

def close_account():
    confirm_prompt = input("Are you sure you want to close your account ? \n\n<yes> or <no>\n")
    if(confirm_prompt == 'no'):
          main_menu()
    if(confirm_prompt == 'yes'):
          print("Thank you for banking with us\nWe hope to we can serve you better next time")
    

def change_pin():
    pin_verification()

    pin_to_change = int(input("Enter your new pin\n"))

    confirm_pin = int(input("Please confirm your pin\n"))
    

    if(confirm_pin == pin_to_change):
          my_bank.set_pin(confirm_pin)
          print("Pin Change Successful")

    if(confirm_pin != pin_to_change):
          print("Pin does not match")
          change_pin()
    main_menu()


def transfer():
    transfer_account_number = input("Enter the account number you would like to transfer: \n\n")
	
    if(len(transfer_account_number) < 10):
        print("Invalid Account Number\n\nPlease try again\n")
        transfer()
    
    transfer_amount_str = input("Enter amount to transfer: \n\n")
    remove_comma = transfer_amount_str.replace(",","")
    transfer_amount = int(remove_comma)

    if(transfer_amount <= -1):
          print("Wrong Input\n\nPlease Try again")
          transfer()

    if(transfer_amount > my_bank.get_balance()):
        print("Insufficient Funds")
		
        main_menu()
    my_bank.set_transfer(transfer_amount)
    print(f'Transfer to {transfer_account_number} successful')
    transfer_prompt = input("Would you like to perform another transfer <yes> or <no>?\n")
    if(transfer_prompt == 'yes'):
          transfer()
    if(transfer_prompt == 'no'):
          main_menu()



def pin_verification():
	
    pin_number = int(input("Enter your pin number\n"))
    pin_code = int(my_bank.get_pin())

    if(pin_number != pin_code):
        print("\nIncorrect Pin\n\nPls try again")
        pin_verification()
    else:
       print("\n\nPin Code Valid\n")
       print("LOADING >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n")       
		



def login_page():
	print("""
	
1 -> Create Account
2 -> Login to your Account

	""")
	login_page_input = int(input(""))
	match login_page_input:
		case 1: welcome_page()
		case 2: login_account()
	
	

def welcome_page():

	

	print("WELCOME TO BANKE MULTINATIONAL BANK\n\nLET'S GET YOU STARTED\n")
	name = input("Please enter your full name: \n")

	account_number = random.randint(1, 12345678901)		
	pin = input("Enter a pin\n")	
	
	
	my_bank.set_name(name)
	my_bank.set_account_number(account_number)
	my_bank.set_pin(pin)
	print(f'Hi {name} your account number is {account_number}\n\nPlease ensure you keep it')
	
	main_menu()


def withdraw():
	
    pin_verification()
    withdraw_amount_str = (input("How much would you like to withdraw ?\n"))
    remove_comma = withdraw_amount_str.replace(",","")
    withdraw_amount = int(remove_comma)

    if(withdraw_amount <= -1):
          print("Wrong amount\n\nPlease Try again")
          withdraw()
    if(withdraw_amount > my_bank.get_balance()):
        print("Insufficient Funds !")
   
    my_bank.set_withdraw(withdraw_amount)
    main_menu()

def deposit():
	
	amount_to_deposit_in_str = input("How much would you like to deposit ?\n")
	remove_comma = amount_to_deposit_in_str.replace(",","")
	amount_to_deposit = int(remove_comma)
  
	if(amount_to_deposit < 0):
		print("Error in amount\n\nPlease Try again")
		deposit()
	else:
		my_bank.set_deposit(amount_to_deposit)
		print(f'\nDeposit Successful !\n\nLoading >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n\nYour initial deposit is {amount_to_deposit}')
		main_menu()
	




def balance():
	
	print(my_bank)
	main_menu()


def main_menu():
	print("""
        1 -> Deposit
	   
	2 -> Withdraw money
	   
	3 -> Account Balance
	   
	4 -> Transfer Money
	   
	5 -> Change Pin
	   
	6 -> Close Account

    """)
	main_menu_page = int(input("Please enter an option\n"))
	match main_menu_page:
            case 1: deposit()
            case 2: withdraw()
            case 3: balance()
            case 4: transfer()
            case 5: change_pin()
            case 6: close_account()
            case _: print("Invalid Option\n\nPlease try again")
			 




def login_account():
	

	name  = input("Enter your name")
	account_number = input("Enter your account number")
	login_pin = (input("Enter your pin"))
	print("LOADING >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n")
	my_bank.set_name(name)
	my_bank.set_account_number(account_number)
	my_bank.set_pin(login_pin)
	main_menu()
	
	




	



login_page()
	
	
	
	