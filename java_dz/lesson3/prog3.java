package java_dz.lesson3;

import java.util.ArrayList;
import static java.util.Collections.max;
import static java.util.Collections.min;

import org.xml.sax.SAXException;

public class prog3 {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            ls.add(i);
        }
        double maxx = Double.NEGATIVE_INFINITY;
        double minn = Double.POSITIVE_INFINITY;
        Integer average = 0;
        System.out.println(min(ls) + " " + max(ls));
        for (int i = 0; i < ls.size(); i++) {
            Integer item = ls.get(i);
            if (item > maxx) {
                maxx = item;
            }
            if (item < minn) {
                minn = item;
            }
            average += item;
        }
        System.out.println(minn + " " + maxx + " " + average / ls.size());
    }
}
