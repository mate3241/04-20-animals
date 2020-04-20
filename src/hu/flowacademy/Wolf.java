package hu.flowacademy;

public class Wolf extends Animal implements AttackerInterface {
  int attackPower;

  public Wolf(int age, int hp, String type, int attackPower) {
    super(age, hp, type, false, false, false, false, true);
    this.attackPower = attackPower;
  }

  @Override
  public String getDeathScream() {
    return ("aroooo I'm dead");
  }

  @Override
  public void sayHello() {
    System.out.println("arooo");
  }

  @Override
  public String toString() {
    return "Wolf{" +
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
    return 50;
  }
}
