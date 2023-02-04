package java_dz.lesson5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class prog2 {
    public static void main(String[] args) {
        ArrayList<String> ls = new ArrayList<String>();
        ls.add("ivan");
        ls.add("max");
        ls.add("ivan");
        ls.add("max");
        ls.add("sergey");
        ls.add("max");
        ls.add("max");
        ls.add("max");
        HashMap<String, Integer> repit = new HashMap<>();
        ArrayList<String> temp = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < ls.size(); i++) {
            if (temp.contains(ls.get(i))) {
                if (!repit.containsKey(ls.get(i))) {
                    repit.put(ls.get(i), 2);
                } else {
                    Integer temp2 = repit.get(ls.get(i)) + 1;
                    repit.put(ls.get(i), temp2);
                }

            } else {
                temp.add(ls.get(i));
            }
        }
        for (Map.Entry<String, Integer> entry : repit.entrySet()) {
            num.add(entry.getValue());
        }
        Collections.sort(num);
        Collections.reverse(num);
        for (int i = 0; i < num.size(); i++) {
            for (Map.Entry<String, Integer> entry : repit.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                if (value == num.get(i)) {
                    System.out.println(key + " - " + value);
                }
            }
        }
    }
}
