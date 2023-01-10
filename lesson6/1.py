# д/з к 3 семенару 3 задание
a = [1.1, 1.2, 3.1, 5, 10.01]
lst = [round(item % 1, 5) for item in a if item - int(item) != 0]
print(max(lst) - min(lst))

# д/з к 4 семенару 3 задание
from collections import Counter

a = [1, 1, 2, 3, 3, 4, 1, 5, 7, 8, 8, 7, 9]
res = [item[0] for item in Counter(a).most_common() if item[1] == 1]
print(res)

# д/з к 3 семенару 1 задание
lst = [2, 3, 5, 9, 3]
summ = 0
for i in range(1, len(lst), 2):
    summ += lst[i]
print(summ)



lst = [2, 3, 5, 9, 3]
summ = sum([lst[i] for i in range(1, len(lst), 2)])
print(summ)

# д/з к 3 семенару 5 задание
k = 8
lst = [-1, 1, 0, 1, 1]
for i in range(3, k + 1):
    lst.insert(0, lst[1] - lst[0])
    lst.append(lst[-2] + lst[-1])
print(lst)


k = 8
lst = [-1, 1, 0, 1, 1]
[lst.insert(0, lst[1] - lst[0]) for i in range(3, k + 1)]
[lst.append(lst[-2] + lst[-1]) for i in range(3, k + 1)]
print(lst)