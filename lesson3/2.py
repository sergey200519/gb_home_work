a = [2, 3, 4, 5, 6]
a = [2, 3, 5, 6]
n = int(len(a) / 2) if len(a) % 2 == 0 else int((len(a) - 1) / 2)

res = []
for i in range(n):
    res.append(a[i] * a[-(i + 1)])

if len(a) % 2 != 0:
    res.append(a[n] * a[-(n + 1)])

print(res)