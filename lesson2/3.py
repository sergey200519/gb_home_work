n = int(input())
l = []

for i in range(1, n + 1):
    l.append((1 + 1 / i)**i)

print(sum(l))