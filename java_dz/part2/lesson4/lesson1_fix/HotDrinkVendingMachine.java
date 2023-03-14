package java_dz.part2.lesson4.lesson1_fix;

public class HotDrinkVendingMachine<T> extends VendingMachine {
  public HotDrinkVendingMachine() {
    super();
  }

  public void addDrink(String name, double volume, double temperature) {
    HotDrink temp = new HotDrink(name, temperature, volume);
    this.hotDrinks.add(temp);
  }

  public HotDrink getProduct(T name, double volume, double temperature) {
    for (int i = 0; i < this.hotDrinks.size(); i++) {
      HotDrink el = hotDrinks.get(i);
      if (el.getName().equals(name) && el.getTemperature() == temperature && el.getVolume() == volume) {
        return el;
      }
    }
    return null;
  }
}
