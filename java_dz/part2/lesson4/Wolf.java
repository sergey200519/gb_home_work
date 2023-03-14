package java_dz.part2.lesson4;

public class Wolf extends Animal {
  public Wolf(String name, int age, int weight) {
    super(name, age, weight);
  }


  @Override
  public int getAge() {
    return this.age;
  }
}
