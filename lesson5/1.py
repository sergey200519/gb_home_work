res = ""
with open("lesson5/text.txt", "r") as f:
    res = f.read().replace("абв", "")
print(res)