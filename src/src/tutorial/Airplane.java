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
  public static class Builder{
    public Builder() {
      this.engineType = EngineType.JET;
      this.weight = 100000;
      this.color = Color.WHITE;
    }
    public Builder engineType(EngineType type) {
      this.engineType = type;
      return this;
    }
    public Builder weight(int w) {
      this.weight = w;
      return this;
    }
    
    public Builder color(Color c) {
      this.color = c;
      return this;
    }

    public Airplane build() {
      return new Airplane(this);
    }
    protected EngineType engineType;
    protected int weight;
    protected Color color;
  }
  
  public Airplane(Builder builder) {
    this.engineType = builder.engineType;
    this.weight = builder.weight;
    this.color = builder.color;
    this.speed = 0;
  }
  public void speed(int s) {
    this.speed = s;
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
	  Airplane myPlane = new Builder().engineType(EngineType.PAPER).weight(90909).color(Color.WHITE).build();
	  myPlane.speed(234);
	  System.out.println("My plane is " + myPlane);
	}
}
