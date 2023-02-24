package java_dz.part2.lesson1;

public class HotDrink extends Drink {
  private double temperature;
  private double volume;

  public HotDrink(String name, double temperature, double volume) {
    super(name);
    this.temperature = temperature;
    this.volume = volume;
  }

  public String getName() {
    return this.nameDrink;
  }

  public double getVolume() {
    return this.volume;
  }

  public double getTemperature() {
    return this.temperature;
  }
}
