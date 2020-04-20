package hu.flowacademy;

public class Main {

  public static void main(String[] args) {
    int wolf = 0;
    int notWolf = 0;
    Animal[] animals = new Animal[10];
    for (int i = 0; i < 10; i++) {
      animals[i] = randomAnimal();
      System.out.println((animals[i]));
      if (animals[i] instanceof Wolf) {
        wolf++;
      } else {
        notWolf++;
      }
    }

    Wolf[] wolves = new Wolf[wolf];
    Animal[] notWolves = new Animal[notWolf];
    wolf = 0;
    notWolf = 0;
    for (int i = 0; i < animals.length; i++) {
      if (animals[i] instanceof Wolf) {
        wolves[wolf++] = (Wolf) animals[i];
      } else {
        notWolves[notWolf++] = animals[i];
      }
    }


    Wolf wooolf = new Wolf(3, 200, "wolf", 50);
    Cat cat = new Cat(4, 300, "cat");
    for (int i = 0; i < notWolves.length; i++) {
      for (int j = 0; j < wolves.length; j++) {
        while (wolves[j].isLive() && i < notWolves.length) {
          boolean didTheWolfWin = attack(wolves[j], notWolves[i]);
          if (didTheWolfWin && i < notWolves.length) {
            i++;
          } else if (j < wolves.length) {
            j++;
          }
        }
      }
    }
  }


  public static Animal randomAnimal() {
    double random = Math.random() * 100 + 1;
    if (random >= 80) return new Wolf(3, 100, "wolf", 30);
    if (random >= 70) return new Dog(2, 700, "dog", 20);
    if (random >= 65) return new Cat(8, 30, "cat");
    if (random >= 60) return new Turkey(5, 35, "turkey", 15);
    else return new Chicken(1, 15, "chicken");
  }

  public static void attackAnimal(Wolf attacker, Animal poorAnimal) {
    poorAnimal.setHp(poorAnimal.getHp() - attacker.getAttackScore());
    if (poorAnimal.isLive()) {
      if (poorAnimal instanceof AttackerInterface) {
        AttackerInterface ai = (AttackerInterface) poorAnimal;
        attacker.setHp(attacker.getHp() - ai.getAttackScore());
      }
    }
  }

  private static boolean attack(Wolf attacker, Animal victim) {
    if (!(victim instanceof AttackerInterface)) {
      victim.setHp(0);
      return true;
    } else {
      return fight(attacker, victim);
    }
  }

  private static boolean fight(Wolf w, Animal victim) {
    AttackerInterface ai = (AttackerInterface) victim;
    while (victim.isLive() && w.isLive()) {
      victim.setHp(victim.getHp() - w.getAttackScore());
      if (victim.isLive()) {
        w.setHp(w.getHp() - ai.getAttackScore());
      }
    }
    return (w.getHp()) >= 0;
  }
}