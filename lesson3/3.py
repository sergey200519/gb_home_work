a = [1.1, 1.2, 3.1, 5, 10.01]
lst = [round(item % 1, 5) for item in a if item - int(item) != 0]
print(max(lst) - min(lst))