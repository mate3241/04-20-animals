package hu.flowacademy;

public class Dog extends Animal implements AttackerInterface{
  int attackPower;

  public Dog(int age, int hp, String type, int attackPower) {
    super(age, hp, type, true, false, true, true, true);
    this.attackPower = attackPower;
  }

  @Override
  public String getDeathScream() {
    return ("woof I'm dead");
  }

  @Override
  public void sayHello() {
    System.out.println("wuf wuf");
  }

  @Override
  public String toString() {
    return "Dog{" +
            "attackPower=" + attackPower +
            ", type='" + type + '\'' +
            ", domestic=" + domestic +
            ", edible=" + edible +
            ", forFun=" + forFun +
            ", forSecurity=" + forSecurity +
            '}';
  }

  @Override
  public int getAttackScore() {
    return 25;
  }
}
