with open("1.txt", "w", encoding="utf-8") as file:
    file.write("52x^2 + 81 = 0")
with open("2.txt", "w", encoding="utf-8") as file:
    file.write("100x^2 - 63 = 0")

with open("poly_1.txt","r") as file:
    poly_1 = file.readline()
    list_of_poly_1 = poly_1.split()


with open("poly_2.txt","r") as file:
    poly_2 = file.readline()
    list_of_poly_2 = poly_2.split()
