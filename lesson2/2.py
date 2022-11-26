n = int(input())
p = 1
res = []

for i in range(1, n + 1):
    p *= i
    res.append(p)
print(res)