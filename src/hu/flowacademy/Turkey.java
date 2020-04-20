package hu.flowacademy;

public class Turkey extends Animal implements AttackerInterface{
  int attackPower;

  public Turkey(int age, int hp, String type, int attackPower) {
    super(age, hp, type, true, true, false, false, true);
    this.attackPower = attackPower;
  }

  @Override
  public String getDeathScream() {
    return ("gobble gobble I'm dead");
  }

  @Override
  public void sayHello() {
    System.out.println("gobble gobble");
  }

  @Override
  public String toString() {
    return "Turkey{" +
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
    return 10;
  }
}
