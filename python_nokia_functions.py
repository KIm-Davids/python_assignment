def set_1_error_message(value):
	print(f"Try again{value}")
        




def option():
	print("1. Type of view")
	print("2. Memory status")
	print("0. Back")
	
	userinput = int(input(" "))

	match userinput:
		case 1: option()
		case 2: option()
		case 0: phone_book()
		case _: print("\n**please try again**\n") + option()



def phone_book_options(options):
	match options:
			case 1: phone_book()
			case 2: phone_book()
			case 3: phone_book()
			case 4: phone_book()
			case 5: phone_book()
			case 6: phone_book()
			case 7: phone_book()
			case 8: option()
			case 9: phone_book()
			case 10: phone_book()
			case 0: main_menu()
			case _: print("\n**please try again**\n") + phone_book()



def phone_book():
	print("""
	1. Search
	2. Service Nos
	3. Add name
	4. Erase 
	5. Edit
	6. Assign tone
	7. Send b'card
	8. Options
	9. Speed dials
	10. Voice tags
	0. Back""")
	
	options = int(input("Enter option\n"))
	phone_book_options(options)
			

def message_settings():
	print("""
	1. Set 1
	2. Common
	0. Back
			""")
	options = int(input(" "))
	match options: 
		case 1: set_1()
		case 2: common()
		case 0: messages()
		case _: print("\n**please try again**\n") +message_settings()		



def set_1():
	print("""
	1. Message centre number
	2. Messages sent as
	3. Messages validity
	0. Back
			""")	
	options = int(input(" "))
	match options:
		case 1: set_1()
		case 2: set_1()
		case 3: set_1()
		case 0: message_settings()
		case _: print("\n**please try again**\n") + set_1()





def common(): 
	print("""
	1. Delivery reports
	2. Reply via same number
	3. Character support
	0. Back
		""")

	options = int(input(" "))
	match options:
		case 1: common()
		case 2: common()
		case 3: common()
		case 0: message_settings()
		case _: print("\n**please try again**\n") + common()



def message_options(options):
	match options:
			case 1: messages()
			case 2: messages()
			case 3: messages()	
			case 4: messages()
			case 5: messages()
			case 6: messages()
			case 7: message_settings()
			case 8: messages()
			case 9: messages()
			case 10: messages()
			case 0: main_menu()
			case _: print("\n**please try again**\n") + messages()

def messages():
	print("""
	1. Write messages
	2. Inbox
	3. Outbox
	4. Picture messages
	5. Templates
	6. Smileys
	7. Messages settings
	8. Info service
	9. Voice mailbox number
	10. Service command edit
	0. Back to menu""")
	
	options = int(input("Enter option\n"))
	message_options(options)


def call_cost_settings_(options):
	match options:
		case 1: call_cost_settings()
		case 2: call_cost_settings()
		case 0: call_register()
		case _: print("\n**please try again**\n") + call_cost_settings()		


def call_cost_settings():
	print("""
	1. Call costs limit
	2. Show costs in
	0. Back
		""")
	options = int(input(" "))
	call_cost_settings_(options)




def show_call_cost_(options):
	match options:
		case 1: show_call_cost()
		case 2: show_call_cost()
		case 3: show_call_cost()
		case 0: call_register()
		case _: print("\n**please try again**\n") + show_call_cost()


def show_call_cost():
	print("""
	1. Last all duration
	2. All call's duration
	3. Clear counter
	0. Back
		""")
	options = int(input(" "))
	show_call_cost_(options)	
		



def show_call_durations():
	print("""
	1. Last call duration
	2. All calls' duration
	3. Recieved calls' duration
	4. Dialled calls' duration 
	5. Clear timers
	0. Back
		""")
	options = int(input(" "))
	match options:
		case 1: show_call_durations()
		case 2: show_call_durations()
		case 3: show_call_durations()
		case 4: show_call_durations()
		case 5: show_call_durations()
		case 0: call_register()
		case _: print("\n**please try again**\n") + show_call_durations()



def call_register_(options):
	match options:
		case 1: call_register()
		case 2: call_register()
		case 3: call_register()
		case 4: call_register()
		case 5: show_call_durations()
		case 6: show_call_cost()
		case 7: call_cost_settings()
		case 8: call_register()
		case 0: main_menu()
		case _: print("\n**please try again**\n") + call_register()
		



def call_register():
	print("""
	1. Missed calls	
	2. Recieved calls
	3. Dialled numbers
	4. Erase recent call lists
	5. Show call duration
	6. Show call costs
	7. Call cost settings
	8. Prepaid credit
	0. Back to menu""")

	options = int(input())
	call_register_(options)

def tones_(options):
	match options:
		case 1: tones()
		case 2: tones()
		case 3: tones()
		case 4: tones()
		case 5: tones()
		case 6: tones()
		case 7: tones()
		case 8: tones()
		case 9: tones()
		case 0: main_menu()
		case _: print("\n**please try again**\n") + tones()





def tones():
	print("""
	1. Ringing tone
	2. Ringing volume
	3. Incoming call alert
	4. Composer
	5. Message alert tone
	6. Keypad tones
	7. Waring and game tones
	8. Vibrating alert
	9. Screen saver	
	0. Back to main menu""")

	options = int(input(" "))
	tones_(options)


	
def security_settings_(options):
	match options:
		case 1: security_settings()
		case 2: security_settings()
		case 3: security_settings()
		case 4: security_settings()
		case 5: security_settings()
		case 6: security_settings()
		case 0: settings()
		case _: print("\n**please try again**\n") + security_settings()


def security_settings():
	print("""
	1. PIN code request 
	2. Call barring service
	3. Fixed dialling
	4. Closed user group
	5. Phone security
	6. Change access codes	
	0. Back
		""")
	options = int(input(" "))
	security_settings_(options)



def phone_settings_(options):
	match options:
		case 1: phone_settings()
		case 2: phone_settings()
		case 3: phone_settings()
		case 4: phone_settings()
		case 5: phone_settings()
		case 6: phone_settings()
		case 0: settings()
		case _: print("\n**please try again**\n") + phone_settings()


def phone_settings():
	print("""
	1. Language 
	2. Cell info display
	3. Welcome note
	4. Network selection
	5. Lights 
	6. Confirm SIM service actions
	0. Back
		""")
	options = int(input(" "))
	phone_settings_(options)



def call_settings_(options):
	match options:
		case 1: call_settings()
		case 2: call_settings()
		case 3: call_settings()	
		case 4: call_settings()
		case 5: call_settings()
		case 6: call_settings()
		case 0: settings()
		case _: print("\n**please try again**\n") + call_settings()


def call_settings():
	print("""
	1. Automatic redial
	2. Speed dialling
	3. Call waiting options
	4. Own number sending
	5. Phone line in use
	6. Automatic answer
	0. Back 
		""")
	options = int(input(" "))
	call_settings_(options)



def settings_(options):
	match options:
		case 1: call_settings()
		case 2: phone_settings()
		case 3: security_settings()
		case 4: print("Restore factory settings")
		case 0: main_menu()
		case _: print("\n**please try again**\n") + settings()



def settings():
	print("""
	1. Call settings
	2. Phone settings
	3. Security settings
	4. Restore factory settings
	0. Back to main menu 
		""")	
	
	options = int(input(" "))
	settings_(options)

def clock_(options):
	match options:
		case 1: clock()
		case 2: clock()
		case 3: clock()
		case 4: clock()
		case 5: clock()
		case 6: clock()
		case 0: main_menu()
		case _: print("\n**please try again**\n") + clock()



def clock():	
	print("""
	1. Alarm clock
	2. Clock settings
	3. Date setting
	4. Stopwatch
	5. Countdown timer
	6. Auto update of date and time
	0. Back""")
	options = int(input(" "))
	clock_(options)

def call_divert_(options):
	match options:
		case 1: print("More features incoming !!!")
		case 0: main_menu()
		case _: print("\n**please try again**\n") + call_divert()


def call_divert():
	print("More features incoming !!!\n\nPlease press '0' to go back")
	options = int(input(" "))	
	call_divert_(options)


def games_(options):
	match options:
		case 1: print("More features incoming !!!")
		case 0: main_menu()
		case _: print("\n**please try again**\n") + games()

def games():
	print("More features incoming !!!\n\nPlease press '0' to go back")
	options = int(input(" "))
	games_(options)


def calculator_(options):
	match options:
		case 1: print("More features incoming !!!")
		case 0: main_menu()
		case _: print("\n**please try again**\n") + calculator()

def calculator():
	print("More features incoming !!!\n\nPlease press '0' to go back")
	options = int(input(" "))
	calculator_(options)

def reminder_(options):
	match options:
		case 1: print("More features incoming !!!")
		case 0: main_menu()
		case _: print("\n**please try again**\n") + reminder()


def reminder():
	print("More features incoming !!!\n\nPlease press '0' to go back")
	options = int(input(" "))
	reminder_(options)

def profiles_(options):
	match options:
		case 1: print("More features incoming !!!")
		case 0: main_menu()
		case _: print("\n**please try again**\n") + profiles()


def profiles():
	print("More features incoming !!!\n\nPlease press '0' to go back")
	options = int(input(" "))
	profiles_(options)

def sim_service_(options):
	match options:
		case 1: print("More features incoming !!!")
		case 0: main_menu()
		case _: print("\n**please try again**\n") + sim_services()



def sim_services():
	print("More features incoming !!!\n\nPlease press '0' to go back")
	options = int(input(" "))
	sim_service_(options)
					


def display_options(options):
	match options:
		case 1: phone_book()
		case 2: messages()
		case 3: chat()
		case 4: call_register()
		case 5: tones()
		case 6: settings()
		case 7: call_divert()
		case 8: games()
		case 9: calculator()
		case 10: reminder()
		case 11: clock()
		case 12: profiles()
		case 13: sim_services()






def main_menu():
	print("""
	1. Phone book

	2. Messages
	
	3. Chat 

	4. Call register 

	5. Tones 

	6. Settings 

	7. Call divert 

	8. Games 

	9. Calculator 
	
	10. Reminder 

	11. Clock 

	12. Profiles

	13. sim services""")

	options = int(input("Enter option\n"))

	display_options(options)	


main_menu()