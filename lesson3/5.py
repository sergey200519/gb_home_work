k = 8
lst = [-1, 1, 0, 1, 1]
for i in range(3, k + 1):
    lst.insert(0, lst[1] - lst[0])
    lst.append(lst[-2] + lst[-1])
print(lst)
