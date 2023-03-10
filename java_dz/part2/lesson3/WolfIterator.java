package java_dz.part2.lesson3;

import java.util.Iterator;
import java.util.List;

public class WolfIterator implements Iterator<Wolf> {
  private final List<Wolf> wolfs;
  private int cursor;

  public WolfIterator(List<Wolf> wolfs) {
    this.wolfs = wolfs;
  }

  public WolfIterator(List<Wolf> wolfs, List<Wolf> wolfs1) {
    this.wolfs = wolfs1;
  }

  @Override
  public boolean hasNext() {
    return  cursor + 1 < wolfs.size();
  }

  @Override
  public Wolf next() {
    return wolfs.get(cursor++);
  }

}
