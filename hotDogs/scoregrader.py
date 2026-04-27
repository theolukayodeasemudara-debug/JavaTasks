score = int(input("What is your score?"))
if score >= 90 and score <= 100:
    grade = "A"
    print(f"{score} is Grade: {grade} \n")
elif score >= 80 and score <= 89:
    grade = "B"
    print(f"{score} is Grade: {grade} \n")
elif score >= 70 and score <= 79:
    grade = "C"
    print(f"{score} is Grade: {grade} \n")
elif score >= 60 and score <= 69:
    grade = "D"
    print(f"{score} is Grade: {grade} \n")
elif score < 60:
    grade = "E"
    print(f"{score} is Grade: {grade} \n")
