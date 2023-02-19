package java_dz.lesson5;

import java.util.HashMap;
import java.util.Scanner;

public class prog1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        HashMap<Integer, String> phone = new HashMap<>();
        while (true) {
            System.out.println("--------------------------------");
            int num = scanner.nextInt();
            String name = scanner.next();
            if (num == 0) break;   
            phone.put(num, name);
        }
        System.out.println(phone);
        System.out.println(phone.get(89753559));
        scanner.close();
    }
}
