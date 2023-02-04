package java_dz.lesson3;

import java.util.ArrayList;

public class prog2 {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            ls.add(i);
        }
        for (int i = 0; i < ls.size(); i++) {
            if ((ls.get(i) % 2) == 0) {
                ls.remove(i);
            }
        }
        System.out.println(ls);
    }
}
