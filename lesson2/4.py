from random import randint
n = int(input())


l = []
for i in range(n):
    l.append(randint(-n, n))

one = int(input())
two = int(input())

print(l[one] * l[two])