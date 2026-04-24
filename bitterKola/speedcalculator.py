user_speed = int(input("Enter a speed value "))
if user_speed == 0:
    print("Car is stationary")
elif user_speed >= 1 and user_speed <= 40:
    print("Car speed is slow")
elif user_speed >= 41 and user_speed <= 80:
    print("Car speed is moderate")
elif user_speed >= 81 and user_speed <= 120:
    print("Car speed is fast")
elif user_speed > 120:
    print("Car is moving dangerously fast")
