/**
 * 
 */
package tutorial;

/**
 * 
 */
public class Airplane {
  public enum Color{RED, BLUE, PURPLE, WHITE, BLACK, GREEN, YELLOW, BROWN, ORANGE}
  public enum EngineType{ELECTRIC, JET, PROPELLER, PAPER, WIND}
  
  public Airplane(EngineType engineType, int weight, Color color, int speed) {
    this.engineType = engineType;
    this.weight = weight;
    this.color = color;
    this.speed = speed;
  }
  
  public String toString() {
    return String.format("Airplane: engine type = %s, weight = %dlbs, color = %s, speed = %d.", engineType, weight, color, speed);
  }
  
  private final EngineType engineType;
  private final int weight;
  private final Color color;
  private int speed;

	public static void main(String[] args) {
	  System.out.println("Airplane is going to lift off...");
	  Airplane myPlane = new Airplane(EngineType.PAPER, 298742, Color.BLACK, 160);
	  System.out.println("My plane is " + myPlane);
	}
}
