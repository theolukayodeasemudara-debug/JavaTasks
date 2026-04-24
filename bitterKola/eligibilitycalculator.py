birth_year = int(input("What is your birth year? "))
current_year = 2026
age = current_year - birth_year
if age >= 65:
    print("You are eligble for a senior citizen discount.")
else:
    print("Sorry, you'll have to wait till you're 65+ years'")
