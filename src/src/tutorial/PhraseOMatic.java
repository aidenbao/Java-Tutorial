/**
 * 
 */
package tutorial;
import java.util.Random;
/**
 * 
 */
public class PhraseOMatic {

  /**
   * @param args
   */
  public static void main(String[] args) {
    String[] wordListOne = {"agnostic", "opinionated",
        "voice activated", "haptically driven", "extensible",
        "reactive", "agent based", "functional", "AI enabled",
        "strongly typed"};
    
    String[] wordListTwo = {"loosely coupled", "six sigma",
        "asynchronous", "event driven", "pub-sub", "IoT", "cloud native", 
        "service oriented", "containerized", "serverless",
        "microservices", "distributed ledger"};
    
    String[] wordListThree =  {"framework", "library",
        "DSL", "REST API", "repository", "pipeline", "service mesh", 
        "architecture", "perspective", "design",
        "orientation"};
    
    Random rng = new Random();
    for (int i=0; i<10; ++i) {
      System.out.print(wordListOne[rng.nextInt(wordListOne.length)] + " ");
      System.out.print(wordListTwo[rng.nextInt(wordListTwo.length)] + " ");
      System.out.println(wordListThree[rng.nextInt(wordListThree.length)]);
    }
  }

}
