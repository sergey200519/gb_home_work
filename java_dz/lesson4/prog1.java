package java_dz.lesson4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class prog1 {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            ls.add(i);
        }
        System.out.println(rev(ls));
    }
    public static ArrayList<Integer> rev(ArrayList<Integer> arr){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = arr.size() - 1; i >= 0; i--) {
            result.add(arr.get(i));
        }
        return result;
    }
}
