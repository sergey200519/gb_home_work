package java_dz.part2.lesson3;

import java.util.Comparator;

public class WolfComparator implements Comparator<Wolf> {
  @Override
  public int compare(Wolf o1, Wolf o2) {
    if (o1.weight > o2.weight) {
      return 1;
    } else if (o1.weight < o2.weight) {
      return -1;
    }
    return 0;
  }
}
