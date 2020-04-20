package hu.flowacademy;

public abstract class Creature {
  private int age;
  private int hp;
  private boolean live;

  public abstract String getDeathScream();

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    if (hp <= 0) {
      hp = 0;
      live = false;
      System.out.println(getDeathScream());
    }
    this.hp = hp;
  }

  public boolean isLive() {
    return live;
  }

  public Creature(int age, int hp) {
    this.age = age;
    this.hp = hp;
    this.live = true;
  }
}
