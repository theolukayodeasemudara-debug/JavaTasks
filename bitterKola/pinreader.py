user_pin = int(input("Kinly enter your 4 digit PIN "))
if user_pin >= 1000 and user_pin <= 9999:
    print("PIN is Valid")
else:
    print("Invalid PIN")
