package java_dz.part2.lesson4.zoo;

import java_dz.part2.lesson4.AnimalCage;
import java_dz.part2.lesson4.Lion;
import java_dz.part2.lesson4.Snake;
import java_dz.part2.lesson4.Wolf;

public class Zoo {
  private AnimalCage<Lion> lionCage;
  private AnimalCage<Snake> snakeCage;
  private AnimalCage<Wolf> wolfCage;

  public Zoo(AnimalCage<Lion> lionCage, AnimalCage<Snake> snakeCage, AnimalCage<Wolf> wolfCage) {
    this.lionCage = lionCage;
    this.snakeCage = snakeCage;
    this.wolfCage = wolfCage;
  }
}
