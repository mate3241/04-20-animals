package hu.flowacademy;

public class Chicken extends Animal{

  public Chicken(int age, int hp, String type) {
    super(age, hp, type, true, true, false, false, false);
  }

  @Override
  public String getDeathScream() {
    return ("pakpak I'm dead");
  }

  @Override
  public void sayHello() {
    System.out.println("pakpak");
  }

  @Override
  public String toString() {
    return "Chicken{" +
            ", type='" + type + '\'' +
            ", domestic=" + domestic +
            ", edible=" + edible +
            ", forFun=" + forFun +
            ", forSecurity=" + forSecurity +
            '}';
  }
}
