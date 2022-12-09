from collections import Counter

a = [1, 1, 2, 3, 3, 4, 1, 5, 7, 8, 8, 7, 9]
res = [item[0] for item in Counter(a).most_common() if item[1] == 1]
print(res)