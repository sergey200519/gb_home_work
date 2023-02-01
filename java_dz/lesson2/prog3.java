package java_dz.lesson2;


import java.util.logging.Logger;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.SimpleFormatter;

public class prog3 {
    static Scanner scanner = new Scanner(System.in);
    static boolean flag = true;

    public static void main(String[] args) {
        while (flag) {
            int operand1 = nextInt();
            int operand2 = nextInt();
            char operation = getOperation();
            int result = calc(operand1,operand2,operation);
            System.out.println("Результат операции: "+result);
        }
    }

    public static int nextInt(){
        System.out.println("Введите число:");
        int operand = scanner.nextInt();
        return operand;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation = scanner.next().charAt(0);
        return operation;
    }

    public static int calc(int operand1, int operand2, char operation){
        Logger logger = Logger.getLogger(prog3.class.getName());
        ConsoleHandler ch = new ConsoleHandler();
        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);
        logger.addHandler(ch);
        int result = 0;
        switch (operation){
            case '+':
                result = operand1+operand2;
                logger.info("действие: +");
                break;
            case '-':
                result = operand1-operand2;
                logger.info("действие: -");
                break;
            case '*':
                result = operand1*operand2;
                logger.info("действие: *");
                break;
            case '/':
                result = operand1/operand2;
                logger.info("действие: /");
                break;
            case 'e':
                flag = false;
                logger.info("действие:: Выход");
                break;
        }
        return result;
    }
}