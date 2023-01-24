package java_dz.lesson1;
public class prog1 {
    public static void main(String[] args) {
        System.out.println(fun(1));
    }

    public static int fun(int num) {
        int res = 0;
        for (int i = 0; i <= num; i++) {
            res = res + i;
        }
        return res;
    }
}