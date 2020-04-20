package hu.flowacademy;

public abstract class Animal extends Creature{
  String type;
  boolean domestic;
  boolean edible;
  boolean forFun;
  boolean forSecurity;


  public abstract void sayHello();

  public Animal(int age, int hp, String type, boolean domestic, boolean edible, boolean forFun, boolean forSecurity, boolean canFight) {
    super(age, hp);
    this.type = type;
    this.domestic = domestic;
    this.edible = edible;
    this.forFun = forFun;
    this.forSecurity = forSecurity;
  }

  @Override
  public String toString() {
    return "Animal{" +
            "type='" + type + '\'' +
            ", domestic=" + domestic +
            ", edible=" + edible +
            ", forFun=" + forFun +
            ", forSecurity=" + forSecurity +
            '}';
  }

}
