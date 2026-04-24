num_of_mins = int(input("Kinly enter your time range "))
day = num_of_mins // 1440
rem_min = num_of_mins % 1440
hour = rem_min // 60
min = rem_min % 60
print(f"{day} days: {hour} hours: {min} minutes")
