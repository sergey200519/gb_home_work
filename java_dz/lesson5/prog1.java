package java_dz.lesson5;

import java.util.HashMap;

public class prog1 {
    public static void main(String[] args) {
        HashMap<Integer, String> phone = new HashMap<>();
        phone.put(89753559, "ivan");
        phone.put(96523467, "max");
        System.out.println(phone);
        System.out.println(phone.get(89753559));
    }
}
