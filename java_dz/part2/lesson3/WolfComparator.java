package java_dz.part2.lesson3;

public class WolfComparator implements Comparable<WolfComparator> {
  private String name;
  private int age;
  private int weight;
  public WolfComparator(String name, int age, int weight) {
    this.name = name;
    this.age = age;
    this.weight = weight;
  }
  @Override
  public int compareTo(WolfComparator o) {
    if (this.age + this.weight > o.age + o.weight) {
      return 1;
    } else if (this.age + this.weight < o.age + o.weight) {
      return -1;
    }
    return 0;
  }
}
