salary_range = int(input("Kinly enter your salary range "))
if salary_range <= 300000:
    print("No Tax")
elif salary_range >= 300001 and salary_range <= 600000:
    print("Tax is 15%")
elif salary_range > 600000:
    print("Tax is 25%")
