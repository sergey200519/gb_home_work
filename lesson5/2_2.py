from random import randint

print('Welcome to the game!')


def motion(user, n):
    print(f"Сейчас ходит {user}")
    if user == "bot":
        if n > 2 * 28:
            num = 28
        elif n in range(29, 57):
            num = 1
        else:
            num = n
        print(f"bot взял {num} конфет")
    else:
        while True:
            num = int(input())
            if num in range(0, 29):
                break
            else:
                print("invalid input")
    return num

def main():
    n = 201
    users = ["sergey", "bot"]
    user = randint(0, 1)
    
    while True:
        n -= motion(users[user], n)
        print(f"Осталось конфет: {n}")
        if n <= 0:
            print(f"{users[user]} выйграл")
            break
        user = 0 if user == 1 else 1
main()