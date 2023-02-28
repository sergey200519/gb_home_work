package java_dz.lesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    Catalog catalog = new Catalog();
    List<Laptop> temp = new ArrayList<>();
    int operation = scanner.nextInt();
    if (operation == 1) {
      catalog.getFilterRam(scanner.nextInt());
    }
    if (operation == 2) {
      catalog.getFilterSSD(scanner.nextInt());
    }
    if (operation == 3) {
      catalog.getFilterOS(scanner.next());
    }
    if (operation == 4) {
      catalog.getFilterColor(scanner.next());
    }
    scanner.close();
  }
}
