from collections import Counter


def _encode(s):
    res = ""
    for key, value in Counter(s).items():
        if value > 9:
            temp = 9
            while value > 0:
                res += f"{temp}{key}"
                value -= 9
                temp = 9 if value >= 9 else value
        else:
            res += f"{value}{key}"
    return res

with open("lesson5/text2.txt", "r", encoding="utf-8") as f:
    en = _encode(f.read())
print(en)

def _decode(s):
    flag = False
    n = 0
    res = ""
    for item in s:
        if flag:
            flag = False
            res += item * n
        else:
            n = int(item)
            flag = True
    return res

de = _decode(en)
print(de)
with open("lesson5/text3.txt", "w", encoding="utf-8") as f:
    f.write(de)