sideA = int(input("Enter side One"))
sideB = int(input("Enter side Two"))
sideC = int(input("Enter side Three"))
if sideA == sideB and sideB == sideC:
    type = "Equilateral Triangle"
    print(f"Traingle with sides {sideA} {sideB} {sideC} is an {type} \n")
if sideA == sideB and sideB != sideC:
    type = "Isosceles Triangle"
    print(f"Traingle with sides {sideA} {sideB} {sideC} is an {type} \n")
elif sideA != sideB and sideB == sideC:
    type = "Isosceles Triangle"
    print(f"Traingle with sides {sideA} {sideB} {sideC} is an {type} \n")
elif sideA == sideC and sideB == sideB:
    type = "Isosceles Triangle"
    print(f"Traingle with sides {sideA} {sideB} {sideC} is an {type} \n")
if sideA != sideB and sideB != sideC and sideC != sideA:
    type = "Scalene Triangle"
    print(f"Traingle with sides {sideA} {sideB} {sideC} is an {type} \n")
