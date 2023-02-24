package java_dz.part2.lesson2;

import java_dz.part2.lesson1.HotDrinkVendingMachine;

public class Main {
  public static void main(String[] args) {
    WolfCage a = new WolfCage();
    a.addWolf(new Wolf("bobik", 5));
    System.out.println(a.getaFirstWolf());
  }
}
