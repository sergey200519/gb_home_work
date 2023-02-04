package java_dz.lesson4;

import java.util.LinkedList;

public class prog2 {
    static LinkedList<Integer> ls = new LinkedList<Integer>();
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ls.add(i);
        }
        System.out.println(ls);
        enqueue(10);
        System.out.println(ls);
        System.out.println(dequeue());
        System.out.println(ls);
        System.out.println(first());
        System.out.println(ls);
    }
    public static void enqueue(Integer item){
        ls.add(item);
    }

    public static Integer dequeue(){
        Integer result = ls.get(0);
        ls.remove(0);
        return result;
    }

    public static Integer first(){
        return ls.get(0);
    }
}
