package java_dz.part2.lesson4;


public abstract class Animal {
  protected String name;
  protected int age;
  protected int weight;

  public Animal(String name, int age, int weight) {
    this.name = name;
    this.age = age;
    this.weight = weight;
  }

  public abstract int getAge();
}
