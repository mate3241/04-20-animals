package hu.flowacademy;

public class Cat extends Animal implements AttackerInterface{

  public Cat(int age, int hp, String type) {
    super(age, hp, type, true, false, true, false, false);
  }
  @Override
  public String getDeathScream() {
    return ("meow I'm dead");
  }

  @Override
  public void sayHello() {
    System.out.println("meow hello");
  }

  @Override
  public String toString() {
    return "Cat{" +
            ", type='" + type + '\'' +
            ", domestic=" + domestic +
            ", edible=" + edible +
            ", forFun=" + forFun +
            ", forSecurity=" + forSecurity +
            '}';
  }

  @Override
  public int getAttackScore() {
    return 5;
  }
}
