package tutorial;
//AIWEN HAS OBCD
import java.util.Random;
/**
 * 
 */
class Dog{
  String name;
  int attackPower;
  int defensePower;
  int hp;
  int speed;
  
  public Dog(String name, int attackPower, int defensePower) {
    this.name = name;
    this.attackPower = attackPower;
    this.defensePower = defensePower;
    this.hp = 100;
  }
  public boolean isAlive() {
    return hp>0;
  }
  public void defend(int damage) {
    int k = damage/defensePower;
    hp = hp - k;
    System.out.println(name + " has recieved " + k + " damage. hp is now " + Math.max(0, hp));
    if (!isAlive()) {
      System.out.println(name + " is dead.");
    }
  }
  
  public void attack(Dog victim) {
    System.out.println(name + " attacks " + victim.name);
    Random rng = new Random();
    int damage = rng.nextInt(attackPower);
    victim.defend(damage);
  }
}
/**
 * 
 */
public class DogTestDrive {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Dog aiwen = new Dog("Aiwen", 50, 3);
    Dog klein = new Dog("Klein", 50, 3);
    while (aiwen.isAlive() && klein.isAlive()) {
      aiwen.attack(klein);
      try {
        Thread.sleep(1400);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      klein.attack(aiwen);
      try {
        Thread.sleep(1400);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
