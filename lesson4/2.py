n = 236
lst = []
i = 2
while i <= n:
    if n % i == 0:
        lst.append(i)
        n //= i
        i = 2
    else:
        i += 1
print(lst)