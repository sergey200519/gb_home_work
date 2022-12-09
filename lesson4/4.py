from random import randint, choice

s = ["+", "-"]
k = 2
res = ""
if k == 1:
    res = f"{randint(0, 101)}x+{randint(0, 101)}=0"
else:
    for i in range(k, 1, -1):
        res += f"{randint(1, 101)}x^{i}{choice(s)}"
    res += f"{randint(1, 101)}=0"
print(res)