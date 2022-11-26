from random import randint

a = [1, 2, 3, 4, 5]
b = []
n = len(a)

for item in a:
    b.insert(randint(-n, n), item)

print(b)