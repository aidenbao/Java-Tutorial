/**
 * 
 */
package tutorial;
import java.awt.*;
import java.awt.event.*;
/**
 * 
 */
public class Party {
  public void buildInvite() {
    Frame f = new Frame();
    f.setTitle("Aiwen is big");
    f.setSize(500,300);
    Label l = new Label("Party at Tim's");
    Button b = new Button("You bet");
    Button c = new Button("Shoot me");
    Panel p = new Panel();
    p.add(l);
    p.add(b);
    p.add(c);
    f.add(p);
  }
  /**
   * @param args
   */
  public static void main(String[] args) {
    new Party().buildInvite();
  }

}
