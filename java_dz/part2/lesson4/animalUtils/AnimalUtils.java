package java_dz.part2.lesson4.animalUtils;

import java_dz.part2.lesson4.Animal;

import java.util.Collections;
import java.util.List;

public class AnimalUtils {
  public static <T extends Animal> List<T> sortAnimals(List<T> animals) {
    Collections.sort(animals, new AnimalComporator());
    return animals;
  }
}
