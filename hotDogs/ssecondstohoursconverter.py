totalSecs = int(input("Enter number of seconds: "))
hours = totalSecs // 3600
remain = totalSecs % 3600
minutes = remain // 60
seconds = remain % 60
print(f"{totalSecs} = {hours} hour, {minutes} minutes, {seconds} seconds \n")
