from random import randint

print('Welcome to the game!')


def motion(user):
    print(f"Сейчас ходит {user}")
    while True:
        num = int(input())
        if num in range(0, 29):
            break
        else:
            print("invalid input")
    return num

def main():
    n = 20
    users = ["sergey", "max"]
    user = randint(0, 1)
    
    while True:
        n -= motion(users[user])
        print(f"Осталось конфет: {n}")
        if n <= 0:
            print(f"{users[user]} выйграл")
            break
        user = 0 if user == 1 else 1
main()