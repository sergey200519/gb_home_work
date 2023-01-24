package java_dz.lesson1;
public class prog2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            if (i == 2) {
                i++;
                continue;
            }
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }
}