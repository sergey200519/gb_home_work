import json
from telebot import TeleBot, types
 
TOKEN = '2032808076:AAGMglFep6L1PBAgGXv6KKe_4wFsqH8RQSA'
 
bot = TeleBot(TOKEN)

logined_status = False

with open("lesson9/users.json") as file:
    users = json.load(file)

def is_complex(num):
    if "j" in num or "i" in num:
        return complex(num.replace("i", "j"))
    return float(num.replace(",", ".")) 


@bot.message_handler(commands=['start'])
def answer(msg: types.Message):
    bot.register_next_step_handler(msg, logined)
    bot.send_message(chat_id=msg.from_user.id, text="Введите своё имя и пароль через пробел")


@bot.message_handler(commands=['login'])
def answer(msg: types.Message):
    bot.register_next_step_handler(msg, logined)
    bot.send_message(chat_id=msg.from_user.id, text='Введите своё имя и пароль через пробел')


@bot.message_handler(commands=['logout'])
def answer(msg: types.Message):
    global logined_status
    logined_status = False
    bot.send_message(chat_id=msg.from_user.id, text="Вы вышли")


@bot.message_handler()
def main(msg: types.Message):
    text = msg.text
    print(logined_status)
    if not logined_status:
        bot.send_message(chat_id=msg.from_user.id, text='Вы не вошли')
        return
    elif text == '+':
        bot.register_next_step_handler(msg, addition)
        bot.send_message(chat_id=msg.from_user.id, text='Введите слагаемые')
    elif text == '-':
        bot.register_next_step_handler(msg, subtraction)
        bot.send_message(chat_id=msg.from_user.id, text='Введите уменьшаемое и вычитаемое')
    elif text == '*':
        bot.register_next_step_handler(msg, multiplication)
        bot.send_message(chat_id=msg.from_user.id, text='Введите уменьшаемое и вычитаемое')
    elif text == '/':
        bot.register_next_step_handler(msg, division)
        bot.send_message(chat_id=msg.from_user.id, text='Введите уменьшаемое и вычитаемое')
    else:
        bot.send_message(chat_id=msg.from_user.id, text='Вы ввели неправильное действие')


@bot.message_handler()
def logined(msg: types.Message):
    name = msg.text.split(" ")
    for key, value in users.items():
        if value["name"] == name[0] and value["password"] == name[1]:
            global logined_status
            logined_status = True
            bot.send_message(chat_id=msg.from_user.id, text='Вы успешно вошли')
            bot.register_next_step_handler(msg, main)
            return
    bot.send_message(chat_id=msg.from_user.id, text='Ошибка в имени или в пароле')
    bot.register_next_step_handler(msg, logined)

 
def addition(msg):
    a, b = map(is_complex, msg.text.split())
    bot.send_message(chat_id=msg.from_user.id, text=f'Результат сложения {a + b}')
 
 
def subtraction(msg):
    a, b = map(is_complex, msg.text.split())
    bot.send_message(chat_id=msg.from_user.id, text=f'Результат сложения {a - b}')


def multiplication(msg):
    a, b = map(is_complex, msg.text.split())
    bot.send_message(chat_id=msg.from_user.id, text=f'Результат сложения {a * b}')


def division(msg):
    a, b = map(is_complex, msg.text.split())
    bot.send_message(chat_id=msg.from_user.id, text=f'Результат сложения {a / b}')
 
 
bot.polling()
 