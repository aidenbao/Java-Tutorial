/**
 * 
 */
package tutorial;

/**
 * 
 */
public class BottleSong {

  /**
   * @param args
   */
  public static void main(String[] args) {
    int bottlesNum = 10;
    String word = "bottles";
    
    while (bottlesNum > 0) {
      System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
      System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
      System.out.println("And if one green bottle should accidentally fall,");
      bottlesNum--;
      
      if (bottlesNum ==1) {
        word = "bottle";
      }
      if (bottlesNum > 0) {
        System.out.println("There'll be " + bottlesNum +
        " green " + word + ", hanging on the wall");
      } else {
        System.out.println("There'll be no green bottles, hanging on the wall");
      }

    }
  }
}