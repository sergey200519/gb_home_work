a = 50000
res = ""
while a > 0:
    res = str(a % 2) + res
    a = a // 2
 
print(res)