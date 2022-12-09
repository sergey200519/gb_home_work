import os


def list_replase(table, pos, sim):
    for item in pos:
        if item in table:
            table[item - 1] = sim
    return table
def render(table, crus=[], zero=[]):
    os.system("clear")
    table = list_replase(table, crus, "x")
    table = list_replase(table, zero, "o")
    print(f"{table[0]} | {table[1]} | {table[2]}")
    print("-" * 10)
    print(f"{table[3]} | {table[4]} | {table[5]}")
    print("-" * 10)
    print(f"{table[6]} | {table[7]} | {table[8]}")
    return table



def main():
    flag = "x"
    table = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    for i in range(9):
        print(f"Сейчас ходят {flag}")
        pos = int(input())
        if flag == "x":
            table = render(table, crus=[pos])
        else:
            table = render(table, zero=[pos])
        flag = "x" if flag == "o" else "o"
main()