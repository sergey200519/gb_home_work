package java_dz.part2.lesson4.animalUtils;

import java_dz.part2.lesson4.Animal;

import java.util.Comparator;

public class AnimalComporator implements Comparator<Animal> {
  @Override
  public int compare(Animal o1, Animal o2) {
    return Integer.compare(o1.getAge(), o2.getAge());
  }
}
