package java_dz.lesson7;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
  Laptop laptop1 = new Laptop("ASUS", 2, 128, "Windows", "red");
  Laptop laptop2 = new Laptop("SAMSUNG", 4, 256, "Windows", "black");
  Laptop laptop3 = new Laptop("NAME1", 32, 512, "MacOS", "black");
  Laptop laptop4 = new Laptop("NAME2", 16, 256, "MacOS", "grey");

  public void getFilterRam(int ram) {
    if (ram >= 32) {
      System.out.printf(this.laptop1.toString() + "\n" + this.laptop2.toString() + "\n" + this.laptop4.toString() + "\n" + this.laptop3.toString());
    } else if (ram < 4) {
      System.out.printf(this.laptop1.toString());
    } else if (ram < 16) {
      System.out.printf(this.laptop1.toString() + "\n" + this.laptop2.toString());
    } else if (ram < 32) {
      System.out.printf(this.laptop1.toString() + "\n" + this.laptop2.toString() + "\n" + this.laptop4.toString());
    } else {
      System.out.println("ноутбуков нет");
    }
  }

  public void getFilterSSD(int ssd) {
    if (ssd >= 512) {
      System.out.printf(this.laptop1.toString() + "\n" + this.laptop2.toString() + "\n" + this.laptop4.toString() + "\n" + this.laptop3.toString());
    } else if (ssd < 128) {
      System.out.printf(this.laptop1.toString());
    } else if (ssd < 256) {
      System.out.printf(this.laptop1.toString() + "\n" + this.laptop2.toString());
    } else if (ssd < 512) {
      System.out.printf(this.laptop1.toString() + "\n" + this.laptop2.toString() + "\n" + this.laptop4.toString());
    } else {
      System.out.println("ноутбуков нет");
    }
  }

  public void getFilterOS(String os) {
    System.out.println(os);
    if (os.equals("Windows")) {
      System.out.printf(laptop1.toString() + "\n" + laptop2.toString());
    } else if (os.equals("MacOS")) {
      System.out.printf(laptop3.toString() + "\n" + laptop4.toString());
    } else {
      System.out.println("ноутбуков нет!");
    }
  }

  public void getFilterColor(String color) {
    if (color.equals("red")) {
      System.out.printf(laptop1.toString());
    } else if (color.equals("black")) {
      System.out.printf(laptop2.toString() + "\n" + laptop3.toString());
    } else if (color.equals("grey")) {
      System.out.printf(laptop4.toString());
    } else {
      System.out.println("ноутбуков нет!");
    }
  }
}
