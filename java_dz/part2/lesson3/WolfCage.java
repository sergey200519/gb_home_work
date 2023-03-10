package java_dz.part2.lesson3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class WolfCage implements Iterable<Wolf> {
  private int index;
  private List<Wolf> wolfs;

  public WolfCage() {
    this.wolfs = new ArrayList<>();
    this.index = 0;
  }

  public void addWolf(Wolf wolf) {
    wolfs.add(wolf);
  }

  public List<Wolf> getWolfs() {
    Collections.sort(this.wolfs, new WolfComparator());
    return this.wolfs;
  }

  @Override
  public Iterator<Wolf> iterator() {
    return new WolfIterator(this.wolfs);
  }
}
