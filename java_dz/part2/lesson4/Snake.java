package java_dz.part2.lesson4;

public class Snake extends Animal {
  public Snake(String name, int age, int weight) {
    super(name, age, weight);
  }

  @Override
  public int getAge() {
    return this.age;
  }
}
