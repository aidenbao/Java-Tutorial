package tutorial;

/**
 * Easy Math for Aiden.
 */
public class EasyMath {
  private static void test1() {
    int var1;
    int var2;
    var1 = 150;
    var2 = 5;
    System.out.println("sum is " + (var1 + var2));
    System.out.println("difference is " + (var1 - var2));
    System.out.println("product is " + (var1 * var2));
    System.out.println("quotient is " + (var1 / var2));
  }
  
  private static void test2() {
    int iresult, irem;
    double dresult, drem;
    iresult = 10 / 3;
    irem = 10 % 3;
    dresult = 10.0/3.0;
    drem = 10.0 % 3.0;
    System.out.println("Result and remainder of 10 / 3: " + iresult + " " + irem);
    System.out.println("Result and remainder of 10.0 / 3.0: " + dresult + " " + drem);
  }
  
  public static void main(String[] args) {
    test1();
    test2();
  }
}

