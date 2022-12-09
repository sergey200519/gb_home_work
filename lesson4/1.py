from math import atan, pi

n = "0.001"
pee = atan(1 / (3**0.5)) * 6
print(round(pee, len(n) - 2))