package java_dz.part2.lesson4;

public class Lion extends Animal {
  public Lion(String name, int age, int weight) {
    super(name, age, weight);
  }

  @Override
  public int getAge() {
    return this.age;
  }
}
