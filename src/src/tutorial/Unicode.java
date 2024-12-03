/**
 * 
 */
package tutorial;
import java.io.Console;

/**
 * 
 */
public class Unicode {
public static final String TEXT_RESET = "\033[0m";
public static final String TEXT_GREEN = "\033[32m";
public static final String TEXT_BG_CYAN = "\u001B[43m";
public static final char TOP_LEFT_CORNER = '\u250C';
public static final char TOP_RIGHT_CORNER = '\u2510';
public static final char BOTTOM_LEFT_CORNER = '\u2514';
public static final char BOTTOM_RIGHT_CORNER = '\u2518';
public static final char VERTICAL_LINE = '\u2502';  
public static final char HORIZONTAL_LINE = '\u2500';

public static void drawTable(int width, int height) {
  System.out.print(TOP_LEFT_CORNER);
  for (int i = 0;i<width; i++) {
    System.out.print(HORIZONTAL_LINE);
  }
  System.out.print(TOP_RIGHT_CORNER);
    System.out.println();
  for (int i = 0;i<height; i++) {
    System.out.println(VERTICAL_LINE + " ".repeat(width)  + VERTICAL_LINE);
  }
  System.out.print(BOTTOM_LEFT_CORNER);
  for (int i = 0;i<width; i++) {
    System.out.print(HORIZONTAL_LINE);
  }
  System.out.println(BOTTOM_RIGHT_CORNER);
}
/**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.print(TEXT_BG_CYAN);    
    System.out.print(TEXT_GREEN);
    System.out.println("hello world");
    System.out.print(TEXT_RESET + "15 / 5 = 3");
    System.out.println("15 \u00f7 5 = 3");
    System.out.println("15 \u00d7 5 = 75 \u00a9");
    System.out.println("\u00bc + \u00be = 1");
    System.out.println("\u263a");
    drawTable(05, 0);
    drawTable(10,2);
    drawTable(35,9);
    drawTable(42,4);
    drawTable(8,256);
    drawTable(7,6);
    drawTable(4,97);
    drawTable(5,5);
    drawTable(80,13);
    drawTable(1,49);
    
  }
} 

