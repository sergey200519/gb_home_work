package java_dz.lesson7;

public class Laptop {
  String name;
  int ram;
  int ssd;
  String os;
  String color;

  public Laptop(String name, int ram, int ssd, String os, String color){
    this.name = name;
    this.ram = ram;
    this.ssd = ssd;
    this.os = os;
    this.color = color;
  }

  public String toString() {
    return String.format("id: %s3, ram: %d ГБ, ssd: %d ГБ, OS: %s, color: %s", this.name, this.ram, this.ssd, this.os, this.color);
  }
}
