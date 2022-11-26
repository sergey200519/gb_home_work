n = int(input())

if n == 1:
    print("x > 0, y > 0")
elif n == 2:
    print("x < 0, y > 0")
elif n == 3:
    print("x < 0, y < 0")
elif n == 4:
    print("x > 0, y < 0")
else:
    print("Такой четверти не существует")