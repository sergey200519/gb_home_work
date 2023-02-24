package java_dz.part2.lesson1;

public class main {
  public static void main(String[] args) {
    var a = new HotDrinkVendingMachine();
    a.addDrink("name2", 8, 8);
    a.addDrink("name3", 8, 8);
    a.addDrink("name4", 8, 8);
    System.out.println(a.getProduct("name3", 8, 8));
    System.out.println(a);
  }
}
