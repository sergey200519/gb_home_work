package java_dz.part2.lesson4;

public interface AnimalCage<T extends Animal> {
  int animalAdd(T animalToAdd);

  void sortByAge();
}
