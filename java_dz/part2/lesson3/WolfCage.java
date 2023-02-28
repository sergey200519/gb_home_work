//package java_dz.part2.lesson3;
//
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class WolfCage implements Iterable<String> {
//  private int index;
//  private List<WolfComparator> wolfs;
//
//  public WolfCage() {
//    this.wolfs = new ArrayList<>();
//    this.index = 0;
//  }
//
//  public void addWolf(WolfComparator wolf) {
//    wolfs.add(wolf);
//  }
//
//  public List<WolfComparator> getWolfs() {
//    Collections.sort(this.wolfs);
//    return this.wolfs;
//  }
//
//  @Override
//  public boolean hasNext() {
//    return this.index < wolfs.size();
//  }
//
//  @Override
//  public String next() {
//    return "this.index < wolfs.size()";
//  }
//}
