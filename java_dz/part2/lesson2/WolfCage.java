package java_dz.part2.lesson2;

import java_dz.part2.lesson1.HotDrink;

import java.util.ArrayList;
import java.util.List;

public class WolfCage implements AnimalCage {
  private List<Wolf> wolfs;

  public WolfCage() {
    this.wolfs = new ArrayList<>();
  }

  public void addWolf(Wolf wolf) {
    wolfs.add(wolf);
  }

  @Override
  public Wolf getaFirstWolf() {
    if (wolfs.size() > 0) {
      return wolfs.get(0);
    } else {
      return null;
    }
  }
}
